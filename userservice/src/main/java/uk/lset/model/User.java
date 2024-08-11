package uk.lset.model;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userservice")
public class User {

@Id
private String userId;

private String userName;

private String email;


public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
