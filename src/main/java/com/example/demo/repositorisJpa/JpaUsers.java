package com.example.demo.repositorisJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Users;

@Repository
public interface JpaUsers extends JpaRepository<Users, Integer> {
	
	@Query(value="select * from Users where Id_User =:id",nativeQuery=true)
	List<Users>listarUsers(int id);

}
