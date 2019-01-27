package de.jonashackt.springbootvuejs.configuration;

import com.mongodb.MongoClient;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@Configuration
public class MongoConfig {
    @Bean
    public MongoClient mongo(final MongoProperties mongoProperties) {
        return new MongoClient(mongoProperties.getHost(), mongoProperties.getPort());
    }

    @Bean
    public MongoTemplate mongoTemplate(final MongoProperties mongoProperties) throws Exception {
        return new MongoTemplate(mongo(mongoProperties), mongoProperties.getDatabase());
    }
}
