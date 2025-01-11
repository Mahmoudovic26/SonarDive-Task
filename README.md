# Spring Boot MapStruct Example

This project demonstrates how to use **MapStruct** with **Spring Boot** to map entities to Data Transfer Objects (DTOs). It includes entities for `Country` and `Company`, along with corresponding DTOs, mappers, and services.

## Prerequisites

- **Java 22** or higher
- **Spring Boot 3.4.x** or higher
- **Maven** (for dependency management)
- **MapStruct** (latest version)
## How to Run

1. Clone the repository:
    
    ```bash
    git clone git@github.com:Mahmoudovic26/SonarDive-Task.git
    ```
    
2. Build the project:
    
    ```bash
    ./mvnw clean install
    ```
    
3. Run the application:
    
    ```bash
    ./mvnw spring-boot:run
    ```
    
4. Run the tests:
    
    ```bash
    ./mvnw test
    ```
    # Note
    make Sure to see 3 runs while running test such as that 
    ![image](https://github.com/user-attachments/assets/bcb94ed9-fcd3-4e22-9e33-bfd5b8c893f9)


## Conclusion

This project demonstrates the integration of **MapStruct** in a Spring Boot application for efficient entity-to-DTO mapping. The unit tests ensure that the mappers and services work correctly, and the application structure is clean and modular.
