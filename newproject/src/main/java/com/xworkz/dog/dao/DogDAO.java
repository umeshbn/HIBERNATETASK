package com.xworkz.dog.dao;

import com.xworkz.dog.Dog;

public interface DogDAO {
	void save(Dog dog);
	void getByID(int DogId);
}