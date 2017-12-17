package web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChatRestController {

    @GetMapping(value = "/getActivity",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getActivity(){
        System.out.println("hello from getActivity");
        return new ArrayList<>();
    }
    @GetMapping(value = "/getPresence",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getPresence(){
        System.out.println("hello from getPresence");
        return new ArrayList<>();
    }
    @GetMapping(value = "/getCensor",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getCensor(){
        System.out.println("hello from getCensor");
        return new ArrayList<>();
    }
}
