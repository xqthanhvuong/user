package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class userController {

	@GetMapping("/")
	public String index() {
		return "User service!";
	}

    @GetMapping("/user")
    public User getUser() {
        return new User("Alice 2");
    }
}

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
