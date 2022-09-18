package com.example.demo.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositorisJpa.JpaUsers;

@RestController
@CrossOrigin(origins="*")
public class ControllerHome {
	@Autowired
	private JpaUsers JpaUsers;
	@GetMapping("/hola")
	public String hola(@RequestParam("id") int id) {
		return "hola " + JpaUsers.listarUsers(id);
	}
	
	

}
