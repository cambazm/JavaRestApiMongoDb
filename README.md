# Sample Java Rest Api Application whic does CRUD to/from MongoDb

You can start by generating a sample Java Spring project from [Spring Initializr](https://start.spring.io/) <br/>
<br/>
 
After project is ready it is pretty simple to install MongoDb, I used Ubuntu and docker to install. See [sample steps](https://www.thepolyglotdeveloper.com/2019/01/getting-started-mongodb-docker-container-deployment/) <br/> <br/>

Project's main idea is to create REST APIs to handle CRUD operations and execute any business logic. The use case is to insert IoT alerts coming from various clients which will be saved at MongoDb as documents. <br/> <br/> Disclaimer: This is just sample stubs to show how easily and fast to create REST API functions for CRUD operations. It is not a production ready code.<br/> <br/>

[Spring documentation](https://spring.io/guides/gs/accessing-mongodb-data-rest/) and [medium article](https://medium.com/javarevisited/building-a-rest-service-with-spring-boot-and-mongodb-3aa5cd2dce73) I leveraged. 
