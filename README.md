# DSCommerce 🛒

[![NPM](https://img.shields.io/npm/l/react)]([https://github.com/SEU-USUARIO/SEU-REPOSITORIO/blob/main/LICENSE](https://github.com/Wsalvarengadev?tab=repositories)) [![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/) [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-green)](https://spring.io/projects/spring-boot)

## 📖 About the Project

**DSCommerce** is a robust full-stack e-commerce solution built with **Java** and **Spring Boot**. This project simulates a real-world shopping scenario, featuring a RESTful API that manages complex object-relational mappings.

The system handles product catalogs, user management, and the complete lifecycle of an order (from cart to delivery). A key highlight of this project is the security implementation, utilizing **Spring Security with OAuth2 and JWT** to manage rigorous access control between Administrators and Clients. It also follows best practices such as layered architecture and strictly typed Data Transfer Objects (DTOs) to ensure maintainability and scalability.

## ⚙️ Features

* **Product Catalog:** Browse products by categories and names.
* **Order Management:** Full lifecycle tracking (Waiting Payment -> Paid -> Shipped -> Delivered).
* **User Management:** Registration and profile management.
* **Security:**
    * OAuth2 & JWT Authentication.
    * Role-based authorization (Admin vs. Client).
* **Validation:** Strict data validation (Bean Validation) for inputs.
* **Database:** * H2 Database for testing/seeding.
    * PostgreSQL for production.

## 🛠️ Technologies Used

* **Java 17**
* **Spring Boot 3** (Web, Data JPA, Security, Validation)
* **Maven**
* **H2 Database** / **PostgreSQL**
* **Postman** (for API testing)

## 📂 Domain Model

The application is based on the following main entities:
* `Product` & `Category` (Many-to-Many)
* `User` & `Role` (Many-to-Many)
* `Order` & `OrderItem` & `Product` (Complex Association)
* `Payment` (One-to-One with Order)

## 🚀 How to Run

### Prerequisites
* Java 17 or higher
* Maven

### Steps
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/SEU-USUARIO/nome-do-projeto.git](https://github.com/Wsalvarengadev/dscommerce))
    ```
2.  **Navigate to the project folder:**
    ```bash
    cd nome-do-projeto
    ```
3.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
4.  **Access the API:**
    The API will be available at `http://localhost:8080` (or your configured port).
    * H2 Console (if enabled): `http://localhost:8080/h2-console`

## 👨‍💻 Author

**Wesley**
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)]([https://www.linkedin.com/in/SEU-LINKEDIN](https://www.linkedin.com/in/wesley-alvarenga-400215135/))
