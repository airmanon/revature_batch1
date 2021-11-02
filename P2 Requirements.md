
Project 2
Overview
Project 2 should be a small full stack application using frameworks (Angular & Spring Boot ). Associates should choose a p2 idea of their own. They should use BDD to design the application and test it.
Testing Requirements
•	All endpoints should be tested with Postman
o	This includes having them verify the status code returned from the endpoint.
•	All DAO methods must have tests showing that they work.
•	Any service method that has logic in it must be tested
o	These tests should use mocking
•	Feature files for all features
•	Step implementations for those features
•	Tests should be documented
•	All user stories should be documented
Goals
•	Associates should learn how BDD is used to build applications and features
•	Associates should learn how to test and work on different parts and levels of the application
•	Associates should learn how to create basic testing documents


Front End: 
Angular APP (SPA)
Login Form (Component) – Login Validation (with backend data) – Rest end point (http client)
Home Page Component (Event Details related to this particular client) - CRUD


Backend:
Spring Boot (Restful Webservice)

DB Layer:
Postgres running on AWS RDS 


Testing
Junit
Mockito
Selenium IDE Test
Cucumber BDD
Jasmine, Karma & Protractor (SPA)

Team (Max Size: 3)
Scrum Master (1)
Scrum Team (2) 

(Front End, Back End, DB & Testing)

Product Owner – My role (I’m giving the requirements) – Product Backlog, (order & prioritize the must have, should have, could have features of the requirement) – 2 Sprint (4 days each)
Sprint backlog 


All the REST end points (web Service) needs to be tested using postman, swagger and selenium IDE. 
Adding BDD Feature File, Junit test cases, Testing using Mockito 
Testing using jasmine, karma, selenium ide is also important for front end layer
DB Scripts should be located inside the resources folder (All table creation query, sample record insert query for all the tables)


Package structure for the back end
 Com.revature.<app_name>
Com.revature.<app_name>.controller
Com.revature.<app_name>.model
Com.revature.<app_name>.repo
Com.revature.<app_name>.service
Com.revature.<app_name>.util
Com.revature.<app_name>.exception
Com.revature.<app_name>.config

Needed Dependencies
1)	Spring Starter Web
2)	Spring Boot Starter (default)
3)	Postgres Driver
4)	Spring data jpa
5)	Swagger2 dep (external)
6)	Swagger2 ui (external)
7)	Devtools
8)	Lombok
9)	Mockito
10)	Thymeleaf 
11)	H2/MySQL (Optional)


Packages for the front end

Src – app – component1, component2, etc., 

Database – follow db naming convention
Java – Follow java coding standards

Add sufficient comments to your code. Properly align the code before you submit.
Configure Logging and use Lombok

Associate Name	Module	Role	Project Title
One	Front End	Scrum Master	
Two	BackEnd DB		
Three	Testing, Documentation		

