package com.kerrrusha.netflixelasticsearch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(
        basePackages = "com.kerrrusha.netflixelasticsearch.repository.elasticsearch"
)
public class ElasticSearchConfig {
}
