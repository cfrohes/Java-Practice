package com.SalesSmarts.Project.Entites;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Role role;
	
	@Column
	private LocalDateTime createdAt;
	
	@Column
	private LocalDateTime updatedAt;
	
//	@OneToMany(mappedBy = "user", cascade= CascadeType.ALL, orphanRemoval = true)
//	List<CartItems> cartitems = new ArrayList<>();
	public Users() {
		super();
	}
	
	public Users(String username, String email, String password, Role role, LocalDateTime createdAt,
			LocalDateTime updatedAt) { //, List<CartItems> cartitems
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		//this.cartitems = cartitems;
	}
	public Users(int userId, String username, String email, String password, Role role, LocalDateTime createdAt,
			LocalDateTime updatedAt) { //List<CartItems> cartitems
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		//this.cartitems = cartitems;
	}
	public Users(String username, String email, String password, Role role) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
//	public List<CartItems> getCartitems() {
//		return cartitems;
//	}
//	public void setCartitems(List<CartItems> cartitems) {
//		this.cartitems = cartitems;
//	}
	
	
}
