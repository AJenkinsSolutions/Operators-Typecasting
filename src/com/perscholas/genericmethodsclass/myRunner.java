package com.perscholas.genericmethodsclass;

public class myRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass obj = new DemoClass();
		
		obj.genericMethod(5);
		obj.genericMethod("Per Scholas");
		obj.genericMethod(2564.2);
		obj.genericMethod('H');
		
		
		GMultipleDatatype<Integer, String> mobj = new GMultipleDatatype<>(5, "hello world");
		System.out.println(mobj.getValueOne());
		System.out.println(mobj.getValueTwo());
		
		
		GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype<>("Per scholas", "Non profit");
		
		System.out.println(mobj2.getValueOne());
	    System.out.println(mobj2.getValueTwo());

	}

}
