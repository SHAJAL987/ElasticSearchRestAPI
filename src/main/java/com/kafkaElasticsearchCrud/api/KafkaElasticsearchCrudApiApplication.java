package com.kafkaElasticsearchCrud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
public class KafkaElasticsearchCrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaElasticsearchCrudApiApplication.class, args);
	}

}
