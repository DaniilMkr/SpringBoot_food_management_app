package com.daniil.makarov.myApp;

import com.daniil.makarov.myApp.entity.Fruits;
import com.daniil.makarov.myApp.entity.Vegetables;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodManagementAppApplication.class, args);

		Vegetables vegetables = new Vegetables();
		Fruits fruits = new Fruits();
		fruits.getDateOfExpiration();
	}

}
