package com.org.intellect.assesment.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.intellect.assesment.model.User;

@RestController
public class UserResource {
	@RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
	
	@RequestMapping(value="/testApi", method = RequestMethod.GET)
	 public ResponseEntity<User> getUserDetails() {
		User user = new User();
		user.setId("11");
		user.setFname("ABC");
		user.setEmail("abc@gmail.com");
	      return new ResponseEntity(user,HttpStatus.OK);
	 }
}

