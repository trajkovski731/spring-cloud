# spring-cloud
Spring-boot cloud example with eureka, feign client, ribbon as load balancer.

Two microservices: client1 and client2 and eureka as service discovery. 


Start the eureka project first. Second start the client1 project and client2 project.
In your browser open http://localhost:8761/ and you should be able to see the eureka ui and that client1 and client2 
are registered in the: Instances currently registered with Eureka - field.

For testing the load balancer - Ribbon you should create a jar from the client2 project. 
You can do that with executing mvn clean install. After that in the project directory there should be a target
folder where you can see the jar file: client2-0.0.1-SNAPSHOT. 

Open here cmd and execute the following command: java -jar client2-0.0.1-SNAPSHOT.jar --server.port=8083.
With this you will start the client2 project on port 8083. Do this again in another cmd and change the port number,
for example:

java -jar client2-0.0.1-SNAPSHOT.jar --server.port=8084
java -jar client2-0.0.1-SNAPSHOT.jar --server.port=8085

You should be able to see all instances registered in the eureka (http://localhost:8761/).

In the client1 there is an endpoint in which a feign client is calling the microservice client2.
You can call this endpoint from your browser with entering the following link: http://localhost:8081/client1/greet.

Execute this many times and observe the cmd windows where you have started the client2 instances.
You should be able to see in the console: "I have been called". The load balancer will call every time a different microservice.
