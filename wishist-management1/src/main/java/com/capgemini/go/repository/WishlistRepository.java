package com.capgemini.go.repository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.capgemini.go.dto.Wishlist;

	

	public interface WishlistRepository extends CrudRepository<Wishlist, Long>
	{
		public List<Wishlist> findAllByUserId(String userId);

		@Modifying
	    @Transactional
		@Query("DELETE  FROM Wishlist w WHERE w.productId =:product_id   and w.userId=:user_id")
		void deleteWishlistByUserIdAndProductId(@Param("user_id")String user_id,@Param("product_id")String product_id);


	}


