package spring.example.mvc.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Example1User {

	@NotNull
	@Size(min = 5, max = 16)
	private String username;

	@NotNull
	@Size(min = 5, max = 25)
	private String password;

	@NotNull
	@Size(min = 2, max = 30)
	private String firstName;

	@NotNull
	@Size(min = 2, max = 30)
	private String lastName;

	@NotNull
	@Email
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
