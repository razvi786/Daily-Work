package com.cts.training.sectorservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.training.sectorservice.entity.User;

//@FeignClient("user-service")
@FeignClient("netflix-zuul-api-gateway-server")
public interface UserServiceProxy {
	
//	@GetMapping(value="/user",produces="application/json")
	@GetMapping("/user-service/user")
	public List<User> getAllUsers();

}
