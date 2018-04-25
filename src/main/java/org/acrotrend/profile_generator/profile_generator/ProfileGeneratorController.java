package org.acrotrend.profile_generator.profile_generator;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.acrotrend.profile_generator.profile_generator.document.ProfileStructure;
import org.acrotrend.profile_generator.profile_generator.profiles.UserProfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class ProfileGeneratorController
{
        @Autowired	
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
	    
	    @GetMapping("/userprofile/{id}")
	    public  Optional<ProfileStructure> getProfile(@PathVariable("id") Integer id){
	    	return userProfiles.findById(id);
	    }
	    
	    
	    @PostMapping("/userprofile")
	    public ProfileStructure createProfile(@Valid @RequestBody ProfileStructure profilestructure)
	    {
	    	return userProfiles.save(profilestructure);
	    }
	    
}
