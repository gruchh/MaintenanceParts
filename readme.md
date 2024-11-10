# Shop - Microservices Learning Project

## Description

This project aims to learn microservices through an example system for ordering parts required for Maintenance Operations. The application consists of several microservices that work together to process orders and check part availability in the warehouse.

## Architecture

The project consists of the following microservices:

- **Order Service**: A microservice responsible for managing orders. It creates new orders and communicates with the warehouse service to verify part availability.
- **Warehouse Service**: A microservice responsible for managing the warehouse. It stores information about available parts and responds to inquiries about their availability.
- **Service Registry** (Eureka Server): A central registry server that enables service discovery for other microservices.

## Technology

The project is built using the following technologies:

- **Java 21**
- **Spring Boot 3.3.5**
- **Spring Cloud 2023.0.3**
- **Eureka Server** (for service registry)
- **Spring Cloud Netflix** (for inter-service communication)
- **Docker** (for containerizing the application)

## Running the Project

1. **Run the Eureka Server**:
   ```bash
   java -jar service-registry/target/service-registry-0.0.1-SNAPSHOT.jar
