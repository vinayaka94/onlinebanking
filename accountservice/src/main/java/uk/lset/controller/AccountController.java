package uk.lset.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uk.lset.model.Account;
import uk.lset.service.AccountService;

@RestController
public class AccountController {
    @Autowired
	private AccountService accountservice;
    
    
	@GetMapping("/account/get/{id}")
	public Account get(@PathVariable("id") String id) {
		return accountservice.get(id);
	}

	@GetMapping("/ping")
	public String ping() {
		return "hello";
	}

	@PostMapping(path = "account/add" , produces = "application/json")
	public Account save(@RequestBody Account account) {
		return accountservice.save(account);
	}

}
