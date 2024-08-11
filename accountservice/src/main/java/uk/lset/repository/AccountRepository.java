package uk.lset.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import uk.lset.model.Account;


public interface AccountRepository extends JpaRepository<Account, String>{
	Optional<Account> findById(String id);
	
	}
