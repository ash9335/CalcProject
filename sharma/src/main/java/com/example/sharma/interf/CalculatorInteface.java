package com.example.sharma.interf;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sharma.entity.Calculator;

public interface CalculatorInteface extends JpaRepository<Calculator, Integer> {

}
