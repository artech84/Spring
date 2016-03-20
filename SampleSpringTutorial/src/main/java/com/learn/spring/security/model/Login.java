package com.learn.spring.security.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Login {
	
	@NotNull
	@Size(min=4,max=15)
	private String username;
	@NotNull
	@Size(min=4,max=15)
	private String password;

}
