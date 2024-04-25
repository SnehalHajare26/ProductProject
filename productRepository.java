package com.jbkSnehal.Assignment.LeadToRev.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jbkSnehal.Assignment.LeadToRev.Model.Product;
@Repository
public interface productRepository extends MongoRepository<Product, String> {
   
	

}