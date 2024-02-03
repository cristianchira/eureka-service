package Microservices_And_Angular._1_Eureka_Server;

// Code decode  Why Eureka server
// https://www.udemy.com/course/master-spring-boot-microservice-angular-with-k8s-cicd-aws/learn/lecture/38835042#questions


// Eureka Server
// https://cloud.spring.io/spring-cloud-netflix/reference/html/#service-discovery-eureka-clients


/*                                    Eureka server(discovery tool)


    ▬▬▐ The Eureka Server is an essential component in a microservices architecture,
         and it plays a vital role in providing the following functionalities: ▬▬

    1. Registry:
                * Service Registration:
                            - Microservices register themselves with the Eureka Server when they start up.
                            - This information includes details like the
                                        • host,
                                        • port,
                                        • and health indicator URL.
                * Centralized Information:
                            - By having a centralized registry, the system has one source of truth
                                        • for the location and status of all microservices.
                            - This simplifies configuration and enables dynamic routing.
                * Dynamic Updates:
                            - As services come online,
                            - go offline, or change their locations,
                    these updates are dynamically reflected in the Eureka registry.
    2. Discovery:
                * Service Lookup:
                           - When a microservice needs to communicate with another service, it queries the Eureka Server to find the current network locations of the target service.
                * Load Balancing:
                           - Together with client-side tools like Ribbon,
                           - Eureka enables load balancing across multiple instances of a microservice,
                             distributing traffic evenly.
                * Facilitating Communication:
                           - By providing an easy way for services to find each other,
                           - Eureka facilitates inter-service communication without the need for
                                         • hard-coded URLs
                                         • or manual configuration.
    3. Fault Tolerance/Resiliency:
                * Heartbeat and Health Check:
                            - The Eureka Server regularly sends heartbeats to registered services
                                          •to ensure they're still up and running.
                            - If a service fails to respond, it's deregistered,
                              preventing requests from being sent to a failed service.
                 * Clustered Deployment:
                            - You can set up Eureka Server in a clustered configuration to ensure
                              high availability.
                            - If one instance fails, others can continue to provide service registry
                              and discovery.
                  * Resilience in Failure Scenarios:
                            - By dynamically updating the registry and working in conjunction with
                              client-side tools, Eureka helps the system gracefully handle failures
                              in individual services or network partitions.
                  * Eureka Server clusters can be set up for high availability.
                  * Even if one Eureka Server instance goes down,
                            - others in the cluster can continue to function,
                                        • maintaining the service registry.

    4. Integration with Other Tools:
                * Eureka Server integrates well with other components of the Spring Cloud ecosystem,
                  such as
                            - Zuul for API Gateway,
                            - Ribbon for client-side load balancing, and
                            - Feign for declarative REST clients.


                                          ▬▬ Conclusion: ▬▬


    ○ Eureka Server's functionality around
                * registry,
                * discovery,
                * and fault tolerance makes it an
                            - invaluable tool for managing microservices in a distributed system.
         It allows for
                 * more agile development,
                 * facilitates scaling,
                 * and enhances the overall reliability and resilience of the system.


                               ▬▬ How to Set Up a Eureka Server: ▬▬


    ○ Using Spring Boot, setting up a Eureka Server is relatively simple:
                1. Create a Spring Boot project
                   and add the spring-cloud-starter-netflix-eureka-server dependency.
                2. Annotate the main application class
                   with @EnableEurekaServer.
                3. Configure the application properties with the desired settings, such as
                            - default port,
                            - hostname, and
                            - other Eureka-specific properties.
                4. Run the application,
                            - and your Eureka Server will be up and running,
                            - ready to accept registrations from microservices.


                                      ▬▬ Conclusion: ▬▬


    ○ The Eureka Server is a crucial part of building scalable and resilient microservices architectures,
                 * especially within the Spring Cloud ecosystem.
         It simplifies the challenges associated with
                 * service discovery
                 * and registration,
         allowing for more agile and adaptive systems.



 */

public class Eureka_Server {
}
