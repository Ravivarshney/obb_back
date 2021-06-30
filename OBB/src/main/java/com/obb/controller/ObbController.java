package com.obb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.obb.Entity.Obb;
import com.obb.Service.ObbService;

@CrossOrigin("*")
@RestController
public class ObbController {

	
	@Autowired
	ObbService obbService;
	
	@GetMapping(value = "/getAll")
	public List<Obb> getAll(){
		return obbService.getAll();
	}
	
	@PostMapping(value = "customersignup")
	public boolean signUp(@RequestBody Obb obb){
		
		return obbService.signUp(obb);
	}

	
	@GetMapping(value = "login/{id}/{pass}")
	public  List<Obb> login(@PathVariable("id") String id, @PathVariable("pass") String pass){

		return obbService.login(id, pass);
	}
	
	@GetMapping(value = "adminlogin/{id}/{pass}")
	public boolean adminLogin(@PathVariable("id") String id, @PathVariable("pass") String pass){

		return obbService.adminLogin(id, pass);
	}
	
	@PostMapping("/edit/{id}")
	public Obb edit(@RequestBody Obb obb,@PathVariable("id") String id) {
	    return obbService.edit(obb, id);
	}
	
	@GetMapping(value = "/autoDelete")
	public String delete() {
	    return obbService.delete();
	}
	
}
