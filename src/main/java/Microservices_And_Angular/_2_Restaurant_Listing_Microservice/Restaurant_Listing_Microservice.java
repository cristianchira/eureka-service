package Microservices_And_Angular._2_Restaurant_Listing_Microservice;

// Code Decode  - Restaurant listing microservices
// https://www.udemy.com/course/master-spring-boot-microservice-angular-with-k8s-cicd-aws/learn/lecture/38836138#questions

/*                          Tech Stack for Restaurant Listing Microservice


    ○ Restaurant listing Microservice is responsible to List all Restaurants
                  * on the front end Page / UI

    ○ So this microservice will going to have all those Crud operations and rest endpoints
      which will be used to fetch all the restaurants and show it on the front end.

    ○ Also, it will have get restaurant by ID, which will be used by food listing service
      when we want to fetch all the food items for that particular restaurant.


                                  ▬▬ Tech stack used ▬▬


    1. Microservice architecture
    2. Rest APIs
    3. Java 17
    4. MySql Relational DB as Datasource
                * We are going to use the relational one, which will be also be used in the
                              - food listing service.
                * But we will be using the NoSQL database
                              - in the order service in that microservice only.
                * We will see why we are using the NoSQL database there.
    5. Spring Boot
    6. Lombok
    7. Eureka Client
                * to make it register to the Eureka Server
                            - because we are using the microservice architecture.
    8. mapstruct
                * This is just a way to map your entities to details(Data Transfer Object)
                 and detail(DTO) to entities
                 because in real time world you will never work or play with entities.


                                     ▬▬ Steps to configure ▬▬


    1. Create Spring Boot application
                * https://start.spring.io/

    2. Add starter dependencies for web, eureka, lombok, mysql connector, Data jpa

    3. Configure application.yaml properties

    4. Create web MVC Architecture
                * Controller layer
                * Service layer
                * Repo layer
                * Entity
                * DTO layer




 */

public class Restaurant_Listing_Microservice {
}
