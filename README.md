# Template for Spring Boot Micro services with Eureka LoadBalancer in Kotlin

Building uppon Spring boot the simplest setup to enabled Eureka, load-balancing and micro services in a spring boot applicationt. 

## How to run
To run the project cd into the individual modules and run `clean spring-boot:run`. The order does not matter as services will retry to connect to Eureka on failure. 
