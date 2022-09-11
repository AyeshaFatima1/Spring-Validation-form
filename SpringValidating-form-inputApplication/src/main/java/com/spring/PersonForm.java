package com.spring;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class PersonForm {
	
	  @NotNull
	  @Size(min = 1,max=15)
	  @NotEmpty(message = "You can't leave firstname empty.")
	  private String firstName;
	  
	  @NotNull
	  @Size(min=1,max=15)
	  @NotEmpty(message = "You can't leave lastname empty.")
	  private String lastName;
	  
	  @NotEmpty(message="Email may not be empty")
	  @Email(message="Email should be valid",regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	  private String email;
	  
	  @NotNull
	  @Pattern(regexp="^[a-zA-Z0-9]{6,10}$")
	  private String password;
	  
	  @NotNull(message="Age must be greater than 18")
	  @Min(value=18)
	  @Max(value=100)
	  private Integer age;
	  
	  @NotNull
	  private String gender;
	  
	  @NotNull
	  @DateTimeFormat(pattern="MM/dd/yyyy")
	  private Date birthday;
	  
	  @NotNull
	  @Pattern(regexp="^[0-9]+$")
	  private String phNo;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
}
