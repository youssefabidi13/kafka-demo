# Kafka Demo Application

This is a Kafka demo application built using Spring Boot and Apache Kafka.

## Table of Contents

* [Project Structure](#project-structure)
* [Dependencies](#dependencies)
* [Kafka Configuration](#kafka-configuration)
* [Producer and Consumer](#producer-and-consumer)
* [Usage](#usage)

## Project Structure

The project is structured as follows:

* [src/main/java/com/abidiyoussef/kafka](cci:7://file:///C:/Users/Youssef/Downloads/kafka-demo/kafka-demo/src/main/java/com/abidiyoussef/kafka:0:0-0:0): Main application package
	+ `KafkaDemoApplication.java`: Spring Boot application configuration
	+ `produce`: Package for Kafka producer configuration
		- `KafkaJsonProducer.java`: Kafka producer configuration
	+ `payload`: Package for Kafka message payload
		- `Student.java`: Student message payload class

## Dependencies

The project uses the following dependencies:

* `org.springframework.boot:spring-boot-starter-kafka`
* `org.apache.kafka:kafka-clients`
* `lombok`

## Kafka Configuration

Kafka configuration is done using the `application.properties` file.

## Producer and Consumer

The project uses a Kafka producer to send messages to a Kafka topic, and a Kafka consumer to consume messages from the topic.

## Usage

To run the application, use the following command:

```bash
mvn spring-boot:run
