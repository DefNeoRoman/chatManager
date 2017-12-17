function getActivity() {
     console.log("hello from getActivity");
     $.ajax({
         type: 'GET',
         url: '/getActivity' + msg,
         success: function (data) {
              console.log("success");
         }
     });

 }
 function getPresence() {
     console.log("hello from getPresence");
     $.ajax({
         type: 'GET',
         url: '/getPresence',
         success: function (data) {
                console.log("success");
         }
     });
   }
 function getCensor() {
 console.log("hello from getCensor");
     $.ajax({
         type: 'GET',
         url: '/getCensor',
         success: function (data) {
               console.log("success");
         }
     });

 }