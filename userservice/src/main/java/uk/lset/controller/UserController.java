package uk.lset.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uk.lset.model.User;
import uk.lset.service.UserService;


@RestController
public class UserController {
     @Autowired
	private  UserService userservice;
	@PostMapping(path = "user/add" , produces = "application/json")
	public User save(@RequestBody User user) {
		return userservice.save(user);
	}
}
