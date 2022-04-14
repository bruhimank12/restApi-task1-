package com.serversnew.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.serversnew.model.Server;

public interface ServerRepository extends MongoRepository<Server,String>{
	
	 @Query("{ 'serverName' : ?0 }")
	 List<Server> findByName(String serverName);
}
