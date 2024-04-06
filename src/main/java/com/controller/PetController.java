package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
	// http://localhost:9090/		
		@RequestMapping(value = "/",method = RequestMethod.GET)
		public String openPage() {
			System.out.println("WELCOME TO Dr.SHAWNS PET CLINIC BY MANIMOZHI");
			return "<div style='color:blue;font-size:60pt'>WELCOME TO Dr.SHAWNS PET CLINIC BY MANIMOZHI<div>";			
		}

}
