package com.perscholas.genericmethodsclass;

public class GMultipleDatatype <T, U> {
	private T valueOne;
	private U  valueTwo;
	
	
	public GMultipleDatatype(T valueOne, U valueTwo) {
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}


	public T getValueOne() {
		return valueOne;
	}


	public void setValueOne(T valueOne) {
		this.valueOne = valueOne;
	}


	public U getValueTwo() {
		return valueTwo;
	}


	public void setValueTwo(U valueTwo) {
		this.valueTwo = valueTwo;
	}
	
	
}
