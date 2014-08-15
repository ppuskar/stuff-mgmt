package com.stuff.mgmt.dal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class DALTestConfig {

	@Value("${jpa.persistenceUnit}")
    private String persistenceUnit;
	
	@Bean
	public EntityManager entityManager() {
		EntityManager entityManager = entityManagerFactory()
				.createEntityManager();

		return entityManager;
	}

	@Bean
	public EntityManagerFactory entityManagerFactory() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory(persistenceUnit);
		if (factory == null) {
			throw new IllegalStateException(
					"EntityManagerFactory failed to initialize.");
		}
		return factory;
	}

	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Configuration
    @PropertySource(value = { "classpath:dal.properties" })
    static class PropertiesContextConfiguration {
    }

}
