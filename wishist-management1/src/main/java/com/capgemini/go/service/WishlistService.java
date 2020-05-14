package com.capgemini.go.service;

import java.util.List;

import com.capgemini.go.dto.Wishlist;

public interface WishlistService {
	
	public List<Wishlist> getWishlist(String userId);
	public Wishlist addToWishlist(Wishlist wishlist );
	public void delete(String productId,String userId) ;

}
