# Spring WebSocket Chat Client

A sample implementation demonstrating usage of Spring WebSockets for
the client. For a compatible server implementation, see
[https://github.com/jaysridhar/spring-websocket-server]. The server
includes a web-based client (HTML/JS), however this client
demonstrates usage of WebSockets from Java in the Spring context.

Build the project using:

    mvn clean package

And run it as follows:

    java -jar target/chat-client-0.1.0.jar

The client connects to the server on the localhost at port 9090, send
a starting message and shows a prompt on the console which can be used
to send further messages. Any messages sent to the server (maybe from
a second console or the web client) is also received and echoed on the
console.
