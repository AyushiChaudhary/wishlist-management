package com.capgemini.go.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//mark class as an Entity 

	@Entity
	
//defining class name as Table name
	
	@Table(name="wishlist")

public class Wishlist {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long wishlistId;
		
		@Column(name="product_id")
		private String productId;
	    
	    @Column(name="product_price")
		private double productPrice;
	    
	    @Column(name="user_name")
		private String userName;
	    
	   
	    @Column(name="user_id")
		private String userId;
	    
	    @Column(name="product_name")
		private String productName;
	    
	    

		public long getWishlistId() {
			return wishlistId;
		}

		public void setWishlistId(long wishlistId) {
			this.wishlistId = wishlistId;
		}

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String  productName) {
			this.productName = productName;
		}

		public Wishlist(long wishlistId, String productId, double productPrice, String userName, String userId,
				String productName) {
			super();
			this.wishlistId = wishlistId;
			this.productId = productId;
			this.productPrice = productPrice;
			this.userName = userName;
			this.userId = userId;
			this.productName = productName;
		}

		public Wishlist() {
			super();
		}



	
	   
	}

		