package com.example.demo.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repositorisJpa.JpaUsers;

@RestController
@CrossOrigin(origins="*")
public class ControllerHome {
	@Autowired
	private JpaUsers JpaUsers;
	@GetMapping("/hola")
	public String hola(@RequestParam("id") int id) {
	    System.out.println(id);
	    List<Users>u = JpaUsers.listarUsers(id);
		return u.get(0).getName_user();
	}
	
	

}
