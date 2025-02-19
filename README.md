# AWS-SQS-with-spring-boot
Creating a simple Spring Boot project that integrates with AWS SQS (Simple Queue Service) is a great way to understand how to use messaging in a cloud environment. Below are the steps to create a basic Spring Boot application that sends and receives messages from an AWS SQS queue.


**Step 1:** Set Up a Spring Boot Project
Use Spring Initializr to generate a Spring Boot project with the following dependencies:

Spring Web (for REST APIs)

Spring Cloud AWS Messaging (for AWS SQS integration)

Lombok (optional, for reducing boilerplate code)

Download the project and import it into your favorite IDE (e.g., IntelliJ IDEA or Eclipse).

**Step 2:** Add AWS SDK Dependency
Add the AWS SDK dependency to your pom.xml file:

**Step 3:** Configure AWS Credentials
Add your AWS credentials and region to the application.properties file:

**Step 4:** Create an SQS Queue
Go to the AWS Management Console.

Navigate to SQS and create a new queue named my-queue.

Note the queue URL (e.g., https://sqs.us-east-1.amazonaws.com/123456789012/my-queue).

**Step 5:** Create a Message Sender
Create a service to send messages to the SQS queue:


**Step 6:** Create a Message Listener
Create a listener to receive messages from the SQS queue:

**Step 7:** Create a REST Controller
Create a REST controller to expose an endpoint for sending messages:

**Step 8:** Run the Application
Start your Spring Boot application.

Use a tool like Postman or curl to send a POST request to the /send endpoint:

**Step 9:** Verify in AWS Console
Go to the AWS SQS console.

Check the my-queue queue to see the message count and confirm the message was processed.

