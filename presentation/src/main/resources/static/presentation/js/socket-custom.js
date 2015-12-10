        var stompClient = null;

        function connect() {
            var socket = new SockJS('/event');
            stompClient = Stomp.over(socket);
            stompClient.connect({}, function(frame) {
                console.log('Connected: ' + frame);
                console.log("log: "+stompClient);
                impress().goto(0);
                stompClient.subscribe('/topic/events', function(event){
                    performAction(JSON.parse(event.body).event);
                });
            });
        }

        function disconnect() {
            if (stompClient != null) {
                stompClient.disconnect();
            }
            console.log("Disconnected");
        }

        function performAction(event){
        console.log(event);
             switch(event){
                case "prev" :
                        impress().prev();
                        break;
                case "next" :
                        impress().next();
                        break;
                default :
                        console.log("invalid event");
             }
        }
