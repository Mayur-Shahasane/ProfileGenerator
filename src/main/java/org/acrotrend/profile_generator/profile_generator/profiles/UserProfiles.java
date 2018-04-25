package org.acrotrend.profile_generator.profile_generator.profiles;
import java.util.Optional;

import org.acrotrend.profile_generator.profile_generator.document.ProfileStructure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfiles extends MongoRepository<ProfileStructure, Integer>{

	
	

}
