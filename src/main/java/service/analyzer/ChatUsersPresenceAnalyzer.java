package service.analyzer;

import model.ChatUsersPresence;

import service.operator.VkChatOperator;

import java.util.Set;

public class ChatUsersPresenceAnalyzer {
	private VkChatOperator operator;
	
	public ChatUsersPresenceAnalyzer(VkChatOperator operator) {
		this.operator = operator;
	}
	
	public ChatUsersPresence getUsersPresence(int... chatIds) throws Exception {
		ChatUsersPresence cup = new ChatUsersPresence(chatIds);
		for (int chatId : chatIds) {
			Set<Integer> chatUsers = operator.loadChatUsers(chatId).keySet();
			cup.addAll(chatId, chatUsers);
		}
		return cup;
	}
}
