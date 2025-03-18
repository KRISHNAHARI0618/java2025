package com.haricodes.haridemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HaridemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaridemoApplication.class, args);
	}

}

/*
Spring.Io --> uses Projects related to Spring Cloud,Spring Security , etc .


What is maven ?
- Maven is a Project Management Tool
- Maven popular use of Maven is for build management and dependencies

What problem does maven solve:
- Checks the Maven Local Repository
- Checks for Maven Remote Repository
- Will Maintain standard directory structures

Maven key Concepts:
- POM File --> pom.xml
  - Module version
  - Pom File Structure
  - Project Meta-Data
  - dependencies
  - plugins

Project Co-Ordinates: <GroupID><ArtifactID><Version>
- GroupID --> Company Name/Group/Organization
- Artifact ID --> Name of the project
- Version --> Version of the project

Adding Dependencies Section:

- <dependencies>
	<dependency>
		Hibernate,spring boot
	</dependency>
</dependencies>

Maven Wrapper files
- mvnw --> mac/linux machines
- mvnw.cmd --> for window machines
- ./mvnw package
- ./mvnw clean package

Spring Boot Application Properties: project structure
- Application.properties --> stored all related to project
- static folder --> mostly related to front end files
- templates folder --> Some Templates is required
- test folder --> stored all unit test folder

The Spring Boot Starters: Spring Initializer

- Curated List of starters
- collection of dependencies grouped together
- tested and verified by the spring development team
- makes it much easier for the developer to get started with spring
- reduces amount of the maven configuration

What is in the starter:

- POM.xml file which contains all dependencies

Starter Parent:
- <parent> </parent>
- mvn spring-boot:run

Spring Boot Dev Tools:
- automatically restarts the code is changed
- add the dependency related to


## Spring Boot Actuator

- How can i manage and monitor my application ?
- How can i check the application health ?
- How can i access application metrics ?

add dependency to maven file /actuator/info, actuator/health
- spring boot actuator
- /health --> checks the health of application
- /info --> endpoint can provide te information about your application
- To Expose info add below lines in application.properties file
	- management.endpoints.web.exposure.include=health,info
	- management.info.env.enabled=true
- info.app.name=My secret Cool App information
- /audit events
- /beans
- /mappings
- /etc..

-- Exposing End Points
- wildcard = * to expose all end points

1: EDit Pom.xml
2: View actuator endpoints
3; edit application properties

Accessing Actuator end points
-



 */
