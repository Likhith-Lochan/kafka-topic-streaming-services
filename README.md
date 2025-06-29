# Kafka Messaging System with Spring Boot, Docker, and Docker Compose

This project demonstrates a Kafka-based messaging system using **two Spring Boot microservices** – a **Producer** and a **Consumer**. The Producer sends messages to a Kafka topic via a REST endpoint, and the Consumer listens to that topic and processes the messages. All components are containerized using Docker and orchestrated via Docker Compose.

---

## 📌 Features

- REST API in Producer to publish messages to Kafka
- Kafka Consumer listens and processes messages
- Kafka and Zookeeper setup via Docker
- Microservices containerized with Docker
- Seamless orchestration using Docker Compose

---

## 🧱 Project Structure
```text
kafka-stream/
├── producer_service/ # Spring Boot Kafka Producer
│ └── Dockerfile
├── consumer_service/ # Spring Boot Kafka Consumer
│ └── Dockerfile
├── docker-compose.yml # Orchestrates Kafka, Zookeeper, Producer, Consumer
└── README.md # Project documentation



---

## ⚙️ Services Overview

### 🔹 Kafka Producer (Spring Boot)
- Exposes an HTTP endpoint to receive a message.
- Publishes the message to a Kafka topic.
  
**Endpoint Example:**


### 🔹 Kafka Consumer (Spring Boot)
- Subscribes to the same Kafka topic.
- Logs every received message to the console.

---

## 📦 Dockerized Components

The project uses Docker Compose to manage and run the following containers:

| Service     | Description                        | Port Mapping          |
|-------------|------------------------------------|------------------------|
| zookeeper   | Kafka dependency                   | 2181:2181              |
| kafka       | Kafka broker                       | 9092:9092              |
| producer    | REST API to send Kafka messages    | 8081:8081              |
| consumer    | Kafka consumer microservice        | 8082:8082              |

---

## 🛠️ How to Run the Project

### 🧾 Prerequisites

- Docker
- Docker Compose
- (Optional) Java 17+ and Maven for local testing

---

### 🚀 Steps to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-repo/kafka-stream.git
   cd kafka-stream


``docker-compose up --build``
