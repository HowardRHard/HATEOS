# CI346 - Assignment 2
In the first project I have achieved:


* A HATEOS API.
* A ReactJS front end.
* A storage layer that persists data (Postgres).
* Automated JUnit tests.


and in the second:
* Authentication in the form of Keycloak.
* Integrated with Wildfly.




## First project - HATEOSReactPostgresJUnit
In order to complete this project I have been following a set of tutorials/resources:


* [HATEOS/React](https://spring.io/guides/tutorials/react-and-spring-data-rest/) - In this tutorial I learnt how to create a RESTful service with the constraint of HATEOS. I also learnt how to use Facebook's React to improve my front end development.

* [Postgres](http://javasampleapproach.com/spring-framework/use-spring-jpa-postgresql-spring-boot) - In this tutorial I learnt how to use JPA and more advanced Java techniques, utilising Spring.

* [JUnit](https://www.youtube.com/watch?v=gNUm14kL7sI) - In this YouTube tutorial I learnt how to test my application. Although I had used JUnit before, I didn't use spring to build the application I was testing.

* [Bootstrap](http://getbootstrap.com/) - To style some of my website I used Bootstrap.


### Screenshots
In this section I will provide screenshots to support my claims.

*The tests are named in alphabetic order, this ensures they run in order.

![Testing completed](https://cloud.githubusercontent.com/assets/9169793/25676975/11fa8e4c-303c-11e7-9306-804afbfa956b.png)

*The screenshots below demonstrate the HATEOS API working correctly.


![React/HATEOS demo 1](https://cloud.githubusercontent.com/assets/9169793/25676976/1357d51a-303c-11e7-894d-16b5250f1c17.png)

![React/HATEOS demo 2](https://cloud.githubusercontent.com/assets/9169793/25676978/14446998-303c-11e7-936a-53c6a476f78e.png)

![React/HATEOS demo 3](https://cloud.githubusercontent.com/assets/9169793/25676979/152e1480-303c-11e7-9d6e-79052dca39b2.png)

![React/HATEOS demo 4](https://cloud.githubusercontent.com/assets/9169793/25676980/161909c2-303c-11e7-9989-cb2f7b6b0b06.png)

![React/HATEOS demo 5](https://cloud.githubusercontent.com/assets/9169793/25676982/16fa042c-303c-11e7-8298-694b31e6465d.png)

![React/HATEOS demo 6](https://cloud.githubusercontent.com/assets/9169793/25676983/17fcdd86-303c-11e7-884b-31a3f244476c.png)



## Second project - keycloak-quickstarts-kc-3.0.0
In order to complete this project I have been following a set of tutorials:


* [Keycloak](
https://keycloak.gitbooks.io/documentation/server_installation/index.html) - From this tutorial I learnt how to set up Keycloak and provide the configuration needed to allow users to login.

* [Wildfly Part 1](https://docs.jboss.org/author/display/WFLY10/Getting+Started+Guide)
* [Wildfly Part 2](http://www.mastertheboss.com/jboss-frameworks/spring/spring-boot-hello-world-on-wildfly) - From these tutorials I learnt how to first set up Wildfly, then how to run a war on that server. It integrates quite nicely with Keycloak. 


### Screenshots
In this section I will provide screenshots to support my claims.

*The following are a demo of the Keycloak interface:


![Login Page](https://cloud.githubusercontent.com/assets/9169793/25676992/1c59563e-303c-11e7-8c3e-0a7e942b739a.png)

![Login Page, user login](https://cloud.githubusercontent.com/assets/9169793/25677000/1e9876a0-303c-11e7-8e56-18a376edb6ea.png)

![Logged in](https://cloud.githubusercontent.com/assets/9169793/25677005/20678674-303c-11e7-97c1-d9c2be8bcfea.png)


## Extra time
If I had more time to complete this assignment I would have tried to condense the projects into one, provide more functionality for the HATEOS (Update a users record), include a many to many relationship for the model, provide tests for the authentication and would have made the page more interactive for the user.