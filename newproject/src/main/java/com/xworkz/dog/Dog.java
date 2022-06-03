package com.xworkz.dog;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "dog_table")
@Entity
public class Dog {
	@Column(name = "DOGID")
	@Id
	private int dogId;
	@Column(name = "DOGNAME")
	private String dogName;
	@Column(name = "DOGBREED")
	private String dogBreed;
	@Column(name = "DOGGENDER")
    private String dogGender;
	@Column(name = "DOGCOLOR")
	private String dogColor;
	@Column(name = "DOGWEIGHT")
	private String dogWeight;
	
	public Dog() {
		super();
	}

	
	public Dog(int dogId, String dogName, String dogBreed, String dogGender, String dogColor, String dogWeight) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.dogBreed = dogBreed;
		this.dogGender = dogGender;
		this.dogColor = dogColor;
		this.dogWeight = dogWeight;
	}

	public int getDogId() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	public String getDogGender() {
		return dogGender;
	}

	public void setDogGender(String dogGender) {
		this.dogGender = dogGender;
	}

	public String getDogColor() {
		return dogColor;
	}

	public void setDogColor(String dogColor) {
		this.dogColor = dogColor;
	}

	
	public String getDogWeight() {
		return dogWeight;
	}

	public void setDogWeight(String dogWeight) {
		this.dogWeight = dogWeight;
	}

	@Override
	public String toString() {
		return "DogEntity [dogId=" + dogId + ", dogName=" + dogName + ", dogBreed=" + dogBreed + ", dogGender="
				+ dogGender + ", dogColor=" + dogColor + ", dogWeight=" + dogWeight + "]";
	}


}
