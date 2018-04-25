package org.acrotrend.profile_generator.profile_generator.config;

import org.acrotrend.profile_generator.profile_generator.document.ProfileStructure;
import org.acrotrend.profile_generator.profile_generator.profiles.UserProfiles;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserProfiles.class)
@Configuration

public class MongoDBConfig {
	@Bean
    CommandLineRunner commandLineRunner(UserProfiles userProfiles) {
        return strings -> {
        	userProfiles.save(new ProfileStructure(3, "Rishi Raj", "Gupta"));
        	userProfiles.save(new ProfileStructure(1, "Spiderman", "Parker"));
        	userProfiles.save(new ProfileStructure(4, "Mayur", "Shahasane"));
        };
}

}
