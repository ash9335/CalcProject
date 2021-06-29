package com.example.sharma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CALCULATOR")
public class Calculator {
@Id
@Column(name="ID")
private Integer id;
@Column(name="FNUMBER")
private String fNumber;
@Column(name="SNUMBER")
private String sNumber;
@Column(name="RESULT")
private String result;
@Column(name="OPERATOR")
private String operator;


public Calculator() {
	super();
}
public Calculator(String fNumber, String sNumber, String result, String operator) {
	super();
	this.fNumber = fNumber;
	this.sNumber = sNumber;
	this.result = result;
	this.operator = operator;
}
public String getfNumber() {
	return fNumber;
}
public void setfNumber(String fNumber) {
	this.fNumber = fNumber;
}
public String getsNumber() {
	return sNumber;
}
public void setsNumber(String sNumber) {
	this.sNumber = sNumber;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public String getOperator() {
	return operator;
}
public void setOperator(String operator) {
	this.operator = operator;
}
@Override
public String toString() {
	return "Calculator [fNumber=" + fNumber + ", sNumber=" + sNumber + ", result=" + result + ", operator=" + operator
			+ "]";
}


}
