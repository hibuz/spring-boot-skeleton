package com.hibuz.account.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.hibuz.account.dao.jpa")
@EnableElasticsearchRepositories("com.hibuz.account.dao.search")
public class RepositoryConfig {
}
