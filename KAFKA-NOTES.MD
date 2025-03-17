# Apache Kafka Overview

## Kafka Producer
- Produces data to the queue.

## Kafka Consumer
- Consumes data from the queue and distributes it accordingly.
- Implements a distribution strategy.

## Partitions
- Data is divided into multiple copies.
- **Brokers**: Store and manage partitions.
- **Records**: Individual messages within partitions.
- **Topics**: A collection of similar records.
- **Partition Number & Offset**: Used to track messages.
- **Partition Key & Number**: Determines how data is distributed.

### Consumer Characteristics
- Lightweight and scalable.
- Multiple consumers can be created for parallel processing.

## Kafka APIs
Kafka is powered by four main APIs:

1. **Producer API** - Produces and sends data to consumers via the Stream API.
2. **Consumer API** - Subscribes to topics and consumes messages.
3. **Stream API** - Processes data from producers and forwards it to consumers.
4. **Connector API** - Connects to databases and transfers data between producers and consumers.

## How to Consume Data from Topics
- To start consuming data from the beginning of a topic:
```  kafka-console-consumer.sh --bootstrap-server <broker-ip> --topic <topic-name> --from-beginning ```

# Apache Kafka 🚀

## 📌 Overview
**Apache Kafka** is a distributed event streaming platform used for **high-throughput, real-time data processing**. It is designed to handle **millions of messages per second** efficiently and is widely used for event-driven architectures, real-time analytics, and data pipelines.

---

## 📂 Core Concepts for Kafka:

### **1️⃣ Topics & Partitions**
- **Topics**: Categories where records (messages) are stored.
- **Partitions**: Each topic is divided into multiple partitions for parallel processing.
- **Partition Key**: Determines which partition a message goes to.

### **2️⃣ Producers**
- Responsible for sending messages to Kafka topics.
- Decide how to distribute messages across partitions.

### **3️⃣ Consumers & Consumer Groups**
- **Consumers** read messages from topics.
- **Consumer Groups** allow multiple consumers to share a topic’s workload.
- Each message goes to only **one consumer per group**.

### **4️⃣ Brokers**
- Kafka servers that store and manage topics.
- Work together as a **Kafka cluster** for fault tolerance.

### **5️⃣ Offsets**
- Kafka assigns a **unique offset** to each message in a partition.
- Consumers use offsets to track progress.

---

## 📡 How Kafka Works
1. **Producers publish messages** to Kafka topics.
2. **Brokers store the messages** in partitions.
3. **Consumers subscribe to topics** and read messages.
4. **Offsets track consumer progress** to ensure order.

---

## ⚙️ Kafka Architecture
- Uses a **Pub-Sub (Publish-Subscribe) model**.
- Messages are stored on disk for reliability.
- Uses **Zookeeper** for metadata management.
- Works well with **Big Data & Event-driven applications**.

---

## 🛠️ Kafka CLI Commands

### 🔹 **List all topics**

```kafka-topics.sh --bootstrap-server localhost:9092 --list ```

#### **Create a topic** : 

```kafka-topics.sh --bootstrap-server localhost:9092 --create --topic my_topic --partitions 3 --replication-factor 1 ```

#### **Describe a Topic**:
```kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic my_topic ```

#### **Consume a Topic**:

``` kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic my_topic --from-beginning ```

#### **Delete a Topics**:
``` kafka-topics.sh --bootstrap-server localhost:9092 --delete --topic my_topic ```

####  **Use Cases of Kafka**
- Log Aggregation – Collect and store logs from multiple sources.
- Real-time Analytics – Process streaming data instantly.
- Event-driven Microservices – Decouple services using Kafka.
- Messaging Queue – Reliable and fault-tolerant messaging.

#### **Producer Produces the message**
``` kafka-console-producer.sh --bootstrap-server localhost:9092 --topic my_topic ```
- Write a message to store on topics 




