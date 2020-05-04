package com.capgemini.go.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.go.dto.Wishlist;
import com.capgemini.go.repository.WishlistRepository;


	@Service
	public class WishlistServiceImpl implements WishlistService
	{

		@Autowired
		  WishlistRepository wishlistRepository;

		@Override
		public List<Wishlist> getWishlist(String userId) 
		{
		return wishlistRepository.findAllByUserId(userId);
		}



		@Override
		public Wishlist addToWishlist(Wishlist wishlist ) 
		{
		      wishlist=wishlistRepository.save(wishlist);
		      return wishlist;
		}
		


		@Override
		public void deleteAll(String userId) {
			
			wishlistRepository.deleteAllWishlistByUserId(userId);
			
		}



		@Override
		public void delete(String productId, String userId) {
			
			wishlistRepository.delteWishlistByUserIdAndProductId(userId, productId);
		}
		

		

}