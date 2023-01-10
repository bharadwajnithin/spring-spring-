package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.repository.Repo;

@RestController
@RequestMapping("/users")
public class Controller {


@Autowired
private Repo repo;

@GetMapping
public List<Model> getAllUser()
{
	return this.repo.findAll();
}

@GetMapping("/{id}")
public Model getUserById(@PathVariable(value="id") long userId) {
	return this.repo.findById(userId)
			.orElseThrow();

}
@PostMapping
public Model createUser(@RequestBody Model model)
{
	return this.repo.save(model);
}
@PutMapping("/{id}")
public Model updateUser(@RequestBody Model model,@PathVariable("id") long userId)
{
	//return this.userRepository.save(user);
	Model ex=this.repo.findById(userId)
			.orElseThrow();
	ex.setFirstname(model.getFirstname());
	ex.setLasttname(model.getLasttname());
	return this.repo.save(ex);
}
}



