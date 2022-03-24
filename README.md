## User-Register Service**

This Project API is used by the Client to add and retrieve user details matching a requested surname.

API Functionality -

POST API - /users/ - This API is used to populate or add users to the system.

GET API - /users/{surname} - This API is used retrieve users matching a requested surname.

## Running Application locally

-With Intellij:

-Clone the project and open in Intellij. Create a run configuration with com/project/userservice/userservice/UserServiceApplication.java as its main class.

-With Running from Command Line:

select Maven->install from IntelliJ to build the snapshot inside the target folder and then go to target directory where the jar file is located and open the commandline,

In the commandline window, pass the following command to run the application,

java -jar user-service-0.0.1-SNAPSHOT.jar

## Testing Application using PostMan

once the application is started the application will be accessible through port 8081 and then,

open Postman and use the follwing URL to test the Functionality,

http://localhost:8081/users/ - to add or populate user details into DB

Note - select Method as POST and pass the input body as Json. eg-

{
"firstName": "John",
"surName": "Brad",
"emailAddress": "John.brad@gmail.com"
}

http://localhost:8081/users/brad/

Note - select Method as GET and retrieve the users matching a requested surname.