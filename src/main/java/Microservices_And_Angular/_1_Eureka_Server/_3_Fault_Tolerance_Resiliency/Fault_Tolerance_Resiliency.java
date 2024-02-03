package Microservices_And_Angular._1_Eureka_Server._3_Fault_Tolerance_Resiliency;

/*                               Fault Tolerance/Resiliency


    ○ Heartbeat and Health Check:
                * The Eureka Server regularly sends heartbeats to registered services
                            - to ensure they're still up and running.
                * If a service fails to respond, it's deregistered,
                            - preventing requests from being sent to a failed service.
    ○ Clustered Deployment:
                * You can set up Eureka Server in a clustered configuration to ensure
                  high availability.
                          - If one instance fails, others can continue to provide service registry
                            and discovery.
    ○ Resilience in Failure Scenarios:
                * By dynamically updating the registry and working in conjunction with
                            - client-side tools, Eureka helps the system gracefully handle failures
                            - in individual services or network partitions.
                * Eureka Server clusters can be set up for high availability.
                * Even if one Eureka Server instance goes down,
                          - others in the cluster can continue to function,
                                      • maintaining the service registry.



 */

public class Fault_Tolerance_Resiliency {
}
