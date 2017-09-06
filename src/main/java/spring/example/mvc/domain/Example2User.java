package spring.example.mvc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Example2User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="example2user_generator", sequenceName="example2user_sequence", initialValue = 23)
	@GeneratedValue(generator = "example2user_generator")
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 16, message="{username.size}")
	private String username;

	@NotNull
	@Size(min = 5, max = 25, message="{password.size}")
	private String password;

	@NotNull
	@Email(message="{email.valid}")
	private String email;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
