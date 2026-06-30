# Summer PEP - Day 5

## 📌 Topic
**Spring Boot Microservices with Eureka Server, Synchronous and Asynchronous Communication**

## 📖 Overview
This repository contains the projects completed during **Day 5** of Summer PEP. The objective was to build multiple Spring Boot microservices, register them with Eureka Server, and understand both synchronous and asynchronous communication between services.

---

## 📂 Projects Included

### 🔹 EurekaServer-4
- Service Registry
- Registers all microservices
- Enables service discovery

### 🔹 CartService
- Cart-related REST APIs
- Communicates with other services

### 🔹 PaymentService
- Handles payment requests
- Calls external banking service

### 🔹 icici
- Dummy bank microservice
- Returns payment response

### 🔹 ProductServiceAsync
- Demonstrates asynchronous API processing
- Uses `@Async`

### 🔹 ProductClientAsync
- Consumes asynchronous APIs
- Demonstrates background execution

### 🔹 SyncAsyncCombo
- Comparison of Synchronous vs Asynchronous execution
- Shows response time differences

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Cloud Netflix Eureka
- Maven
- RestTemplate
- Async (`@Async`)
- STS / IntelliJ IDEA

---

## 📚 Concepts Learned

- Microservices Architecture
- Eureka Server
- Service Registration & Discovery
- REST API Communication
- Synchronous Processing
- Asynchronous Processing
- Background Thread Execution
- Inter-service Communication

---

## ▶️ How to Run

1. Start **EurekaServer-4**
2. Run all microservices.
3. Verify registration in Eureka Dashboard.
4. Test APIs using Browser or Postman.
5. Compare Sync and Async API execution.

---

## 🎯 Learning Outcome

After completing this project, I learned how to:
- Build multiple Spring Boot microservices.
- Register services with Eureka Server.
- Implement synchronous and asynchronous APIs.
- Enable background processing using `@Async`.
- Develop scalable service-based applications.

---

## 👨‍💻 Author

**Suraj Kumar Prajapati**

B.Tech CSE | Lovely Professional University

⭐ Summer PEP Day 5
