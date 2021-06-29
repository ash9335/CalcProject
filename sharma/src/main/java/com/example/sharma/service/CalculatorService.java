package com.example.sharma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sharma.entity.Calculator;
import com.example.sharma.exception.B2CException;
import com.example.sharma.interf.CalculatorInteface;
@Service
public class CalculatorService {
	
	
	@Autowired
	private CalculatorInteface calcrepo;
	public String add(String n1,String n2)
	{
		Integer n11=Integer.valueOf(n1); 
		
		Integer n22=Integer.valueOf(n2); 
		Integer r1=n11+n22;
		String radd=String.valueOf(r1);
		//calc.setResult(radd);
		calcrepo.save(new Calculator(n1, n2, radd, "+"));
		return radd ;
		
	}
	public String divide(String n1, String n2) throws B2CException {

		Integer n11=Integer.valueOf(n1); 
		
		Integer n22=Integer.valueOf(n2);
		
		Integer r2=0;
		String rdiv=null;
		if(n22==0)
		{
			throw new B2CException("Division not found!");
		}else
		{
			r2=n11/n22;
			rdiv=String.valueOf(r2);
			//calc.setResult(radd);
			calcrepo.save(new Calculator(n1, n2, rdiv, "/"));
		}
		
		
		return rdiv ;
	}
	public List<Calculator> findAll() {
		// TODO Auto-generated method stub
		return calcrepo.findAll();
	}

}
