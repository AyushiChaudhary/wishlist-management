package com.capgemini.go.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.go.dto.Wishlist;
import com.capgemini.go.exception.ProductException;
import com.capgemini.go.repository.WishlistRepository;


	@Service
	public class WishlistServiceImpl implements WishlistService
	{

		@Autowired
		  WishlistRepository wishlistRepository;
		

		
		/* 
		 * this method is created for getting the products wishlisted by user 
		 */
		
		@Override
		public List<Wishlist> getWishlist(String userId)
		{
		return wishlistRepository.findAllByUserId(userId);
		}


		/*
		 * this method is created for adding the products into the wishist 
		 */

		@Override
		public Wishlist addToWishlist(Wishlist wishlist ) {
			
		      wishlist=wishlistRepository.save(wishlist);
		      return wishlist;
		}
		


        /* 
         * this method is created for deleting the particular product from the wishlist of the user
         */
		
		@Override
		public void delete(String productId, String userId) {
			
			wishlistRepository.deleteWishlistByUserIdAndProductId(userId, productId);
		}
		

		

}