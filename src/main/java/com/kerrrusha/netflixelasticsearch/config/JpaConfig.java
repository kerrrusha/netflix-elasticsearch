package com.kerrrusha.netflixelasticsearch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.kerrrusha.netflixelasticsearch.repository.jpa"
)
public class JpaConfig {
}
