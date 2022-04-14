package com.serversnew.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serversnew.model.Server;
import com.serversnew.repository.ServerRepository;


@RestController
public class ServerController {
	
	
	@Autowired
	private ServerRepository serverRepository;
	
	//to get the servers
	@GetMapping("/servers")
	public List<Server> getServers(){
		return serverRepository.findAll();
	}
	//get server by serverId
	@GetMapping("/servers/{serverId}")
	public Optional<Server> getServer(@PathVariable String serverId){
		return serverRepository.findById(serverId);
	}
	
	
	//get server by serverName
	@GetMapping("/servers/name/{serverName}")
	public List<Server> getServerByName(@PathVariable String serverName){
		return serverRepository.findByName(serverName);
	}
	
	
	
	
	//add server 
	@PutMapping("/servers")
	public Server addServer(@RequestBody Server server) {
		return serverRepository.save(server);
	}
	
	//delete a server
	@DeleteMapping("/servers/{serverId}")
	public void deleteServer(@PathVariable String serverId) {
		serverRepository.deleteById(serverId);
	}
	
}
