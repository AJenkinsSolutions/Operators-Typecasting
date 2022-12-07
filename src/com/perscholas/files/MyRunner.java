package com.perscholas.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		try {		
		String path = "/Users/apjenkins/Documents/workspace-spring-tool-suite-4-4.16.1.RELEASE/JavaFiles/CourseData.csv";
		File file = new File(path);
		Scanner scn = new Scanner(file);
		ArrayList<Course> data = new ArrayList<>();
		
		while(scn.hasNext()) {
			String line = scn.nextLine();
			String[] splitLine = line.split(",");
			
			Course cObj = new Course(splitLine[0], splitLine[1], splitLine[2]);
			data.add(cObj);
		}
		
		for(Course element: data) {
			System.out.println(element.getCode()+" "+element.getCourse_name()+" "+ element.getInstructor_name());
			System.out.println("==============================================");
		}
		
		
		
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		}
	}

}
