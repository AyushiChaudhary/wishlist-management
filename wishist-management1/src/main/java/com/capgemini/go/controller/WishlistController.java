package com.capgemini.go.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.go.dto.Wishlist;
import com.capgemini.go.exception.ProductException;
import com.capgemini.go.service.WishlistService;


	@RestController
	@RequestMapping("/wishlist")
	@CrossOrigin("http://localhost:4200")
	public class WishlistController 
	{
		@Autowired
		private WishlistService wishlistService;

	
		 /*
		    * This method will return List of Product Liked by the particular user
		    
		 */
		
		
		@GetMapping("/{userId}")
		private ResponseEntity<List<Wishlist>> getWishlist(@PathVariable("userId") String userId) 
		{
			 
			ResponseEntity<List<Wishlist>> response=null;
			List<Wishlist> list=wishlistService.getWishlist(userId);
			if(list==null) {
				response=new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			else {
				response=new ResponseEntity<>(list,HttpStatus.OK);
			
			}
			return response;
		}
		
		
		
		 /*
		    * This method will delete the particular Product from wishlist with respect to the particular user.
		 */

		
		
		@DeleteMapping("/{userId}/{productId}")
		private ResponseEntity<?>  deleteWishlistedItem(@PathVariable("userId") String userId,@PathVariable("productId") String productId) 
		{
		wishlistService.delete(productId, userId);
		return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
		 /*
		    * This method will like the product with respective user and save it to the wishlist.
		 */


		@PostMapping("/productId")
		private ResponseEntity<Wishlist> saveProduct(@RequestBody Wishlist wishlist) throws ProductException
		{
		
		return new ResponseEntity<>(wishlistService.addToWishlist(wishlist),HttpStatus.OK);
		}



		}

	


