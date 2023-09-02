package com.exersice.day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exersice.day7.model.CarEntity;
import com.exersice.day7.repository.CarRepo;

@Service
public class CarService {
@Autowired
private CarRepo carrepo;
public List<CarEntity>getcar(int id,String name){
	return carrepo.getCarInfo(id,name);
}
public int delcar(int id) {
	return carrepo.deleteCarinfo(id);
	
}
public int updatecar(int id,int id1) {
	return carrepo.updateCarInfo(id, id1);
}
}
