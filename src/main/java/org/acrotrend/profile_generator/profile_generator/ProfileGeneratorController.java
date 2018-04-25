package org.acrotrend.profile_generator.profile_generator;
import java.util.List;

import org.acrotrend.profile_generator.profile_generator.document.ProfileStructure;
import org.acrotrend.profile_generator.profile_generator.profiles.UserProfiles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class ProfileGeneratorController
{
	    private UserProfiles userProfiles;
	    public ProfileGeneratorController(UserProfiles userProfiles)
	    {
			this.userProfiles = userProfiles;
		}
	    @GetMapping("/all")
	    public List<ProfileStructure> getAll() 
	    {
	        return userProfiles.findAll();
	    }
}
