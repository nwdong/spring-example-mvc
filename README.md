# Overview

Demo to show how to use Spring Boot to bootstrap web application, persistence, security.

# Development Environment

- Spring Tools Suite 3.8.2.RELEASE
- Maven 3.2.1
- JDK 1.8.0_111

# Spring Tools Suite

Check Maven settings

- Go to Window > Preferences > Maven > Installations, add the maven to use (by default, embedded one is used)
- Go to Window > Preferences > Maven > User Setting, change “User Settings” to point to the right settings.xml which might have internal repository and proxy settings

Check Java compiler setting

- Go to Windows->Preference->Java->Installed JREs, it should be the same version in pom.xml of project

check proxy setting if required

- Windows: go to Control Panel -> Internet Options -> Connections -> Lan settings, add Proxy Server
- STS: go to Window -> Preferences -> General -> Network Connections, select Native for Active Provider.


# Project creation steps

Go to File->New->Spring Starter Project

- type: maven
- packaging: war (for war, webapp folder will be generated in skeleton, otherwise there won't have it)
- java version: the same as setting in STS java compiler

And select Web -> Web as dependency (Boot Version 1.5.6 for this example)

# How to run

There are couple of ways to run it

- in STS, from project context menu, select “Run As -> Spring Boot App” (it contains Embedded Tomcat server)

- run from command (make sure to use the war file without original extension, the original one doesn't have self-contained server) 

- deploy to web server (in STS, from project context menu, select “Run As -> Run on Server”)

# Tags

Each tag shows independent code using certain Spring Boot feature (mvc, persistence, security)

## skeleton

The skeleton generated through Spring Boot

## first-jsp

Example to show 

- JSP dependencies 

- simple controller (GET)

- how controller links JSPs

visit link: http://localhost:8080/


## jsp-form

example 1 to show
 
- link JSPs

- form data transfer

visit link: http://localhost:8080/example1-register

## jsp-validation-persistence

example 2 to show

- JSP Spring tags and form validation

- Messages

- Persistence (w/ H2 in-memory database)

- Log (Spring Logging Framework)

- Spring testing

visit link: [http://localhost:8080/example2-register](http://localhost:8080/example2-register)
