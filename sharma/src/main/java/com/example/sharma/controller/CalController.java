package com.example.sharma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sharma.entity.Calculator;
import com.example.sharma.exception.B2CException;
import com.example.sharma.service.CalculatorService;

@RestController
public class CalController {
	
	@Autowired
  CalculatorService calcService;
	
	@PostMapping("/calculator/add/{n1}/{n2}")
	public String add(@PathVariable String num1,@PathVariable String num2 )
	{
		return calcService.add(num1, num2);
		
	}
	
	@PostMapping("/calculator/divide/{n1}/{n2}")
	public String divide(@PathVariable String num1,@PathVariable String num2 ) throws B2CException
	{
		return calcService.divide(num1, num2);
		
	}
	
	@GetMapping("/records")
	public ResponseEntity<List<Calculator>> findAll() throws B2CException
	{
		List<Calculator> records=calcService.findAll();
		if(records==null || records.isEmpty())
		{
			throw new B2CException("Records not found!");
		}
		return new ResponseEntity<List<Calculator>>(records,new HttpHeaders(),HttpStatus.OK);
	}

}
