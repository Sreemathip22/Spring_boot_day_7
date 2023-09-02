package com.exersice.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exersice.day7.model.CarEntity;
import com.exersice.day7.service.CarService;

@RestController
public class ApiController {
@Autowired
private CarService carservice;
@PostMapping("addquery")
public List<CarEntity> getdetails(@PathVariable int id,@PathVariable String name)
{
	return carservice.getcar(id, name);
}
@GetMapping ("showquery/{id}/{name}")
public List<CarEntity> showdetails(@PathVariable int id,@PathVariable String name){
	return carservice.getcar(id, name);
}
@DeleteMapping("deletequery/{id}")
public String delstudetails(@PathVariable int id) {
	return carservice.delcar(id)+" data deleted";
}
@PutMapping("updatequery/{newid}/{oldid}")
public String updatestudetails(@PathVariable int newid,@PathVariable int oldid) {
	return carservice.updatecar(newid, oldid)+" data updated";
}
}
