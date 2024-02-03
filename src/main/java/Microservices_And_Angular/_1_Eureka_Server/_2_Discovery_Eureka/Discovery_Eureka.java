package Microservices_And_Angular._1_Eureka_Server._2_Discovery_Eureka;

/*                                    Eureka discovery


    ▬▬▐ Discovery:
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
    ○ In microservices architecture, there are two approaches to service discovery:
                1. client-side discovery and
                2. server-side discovery.


                        ▬▬ Client side Or server side Discovery will we use? ▬▬


    1. Client-side discovery:
                * In client-side discovery, the responsibility of service discovery lies
                  with the client.
                            - Each client is aware of the service registry and is responsible for
                              locating and communicating with the desired services

    2. Server-side discovery:
                * In server-side discovery, the responsibility of service discovery is shifted to
                            - a dedicated component called a service registry or discovery server.
        The service registry acts as a centralized repository where
                *  services register themselves when they start up.
        Client applications make requests to the service registry to obtain
                * the network locations of the desired services.
        The registry performs
                * load balancing and
                * routing
        based on its internal algorithms and returns the appropriate service instance to the client.



                           ▬▬ Eureka as a Discovery Tool ▬▬


    ○ Eureka is a popular service discovery tool, particularly in the Spring Cloud ecosystem.

                                 ▬ In a Eureka-based system: ▬

    1. Service Registration:
                2. When a service instance starts, it registers itself with the Eureka server and periodically sends heartbeats to keep its registration alive.
      Service Discovery: Other services or clients query the Eureka server to find active service instances. Eureka provides a simple REST interface for these queries.
      Fault Tolerance: Eureka clients cache registry information, so they can continue operating even if the Eureka server is temporarily unavailable.
      Alternatives to Eureka


                   ▬▬ There are several other service discovery tools and platforms, such as: ▬▬


    1. Consul: Offers service discovery along with health checking, key/value storage, and a web UI.
      Zookeeper: Often used with Apache Kafka, but also supports general service discovery.
      Kubernetes Service Discovery: In Kubernetes, service discovery is handled by the platform, using services and DNS.
      In summary, discovery in a distributed system, especially in microservices architectures, is crucial for enabling services to find and interact with each other efficiently and reliably. Tools like Eureka simplify this process by managing the registration and discovery of service instances.



 */


public class Discovery_Eureka {
}
