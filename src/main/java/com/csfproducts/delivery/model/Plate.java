package com.csfproducts.delivery.model;


import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 

public class Plate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int id;  
	@Column  
	private String name;  
	@Column  
	private int cookTime;  
	@Column  
	private String  price;
	@Column  
	private Boolean  favorite;
	@Column  
	private int  stars;
	@Column  
	private String  imageUrl;
	  
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idrestaurant", referencedColumnName="id")
	private Restaurant restaurant;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCookTime() {
		return cookTime;
	}
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Boolean getFavorite() {
		return favorite;
	}
	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public String toString() {
		return "Plate [id=" + id + ", name=" + name + ", cookTime=" + cookTime + ", price=" + price + ", favorite="
				+ favorite + ", stars=" + stars + ", imageUrl=" + imageUrl + ", restaurant=" + restaurant + "]";
	}
	

	
}