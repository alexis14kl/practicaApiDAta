package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	@Id
	@GeneratedValue
	private int Id_User;
	private String name_user;
	private String last_name_user;
	public int getId_User() {
		return Id_User;
	}
	public void setId_User(int id_User) {
		Id_User = id_User;
	}
	public String getName_user() {
		return name_user;
	}
	public void setName_user(String name_user) {
		this.name_user = name_user;
	}
	public String getLast_name_user() {
		return last_name_user;
	}
	public void setLast_name_user(String last_name_user) {
		this.last_name_user = last_name_user;
	}
	@Override
	public String toString() {
		return "Users [Id_User=" + Id_User + ", name_user=" + name_user + ", last_name_user=" + last_name_user + "]";
	}
	
	

}
