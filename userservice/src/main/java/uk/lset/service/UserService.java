package uk.lset.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.lset.model.User;
import uk.lset.repository.UserRepository;



@Service
public class UserService {

	@Autowired
private UserRepository userrepository ;

public User get(String id) {
	return userrepository.findById(id).orElse(null);
}

public User save(User user) {
	return userrepository.save(user);
}
}
