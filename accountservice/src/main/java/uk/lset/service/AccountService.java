package uk.lset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.lset.model.Account;
import uk.lset.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
private AccountRepository accountrepository ;

public Account get(String id) {
	return accountrepository.findById(id).orElse(null);
}

public Account save(Account account) {
	return accountrepository.save(account);
}

public List<Account> getAccountByUserId(String userId){
	return accountrepository.findByuserId(userId);
}


}
