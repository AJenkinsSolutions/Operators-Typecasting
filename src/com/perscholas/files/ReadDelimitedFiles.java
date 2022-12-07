package com.perscholas.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ReadDelimitedFiles {

	public static void main(String[] args) {
		
		String path = "/Users/apjenkins/Documents/workspace-spring-tool-suite-4-4.16.1.RELEASE/JavaFiles/cars.csv";
		
		File csvFile = new File(path);
		
		try {
			Scanner scn = new Scanner(csvFile);
			ArrayList<String[]> data = new ArrayList<>();
			while(scn.hasNext()) {
				
				String line = scn.nextLine();
				String[] splitLine = line.split(",");
				data.add(splitLine);
			}
			for(String[] line: data) {
				System.out.println("Car Name :" + line[0] );
                System.out.println("MPG :" + line[1] );
                System.out.println("Cylinder :" + line[2] );
                System.out.println("Displacement :" + line[3]);
                System.out.println("Horsepower :" + line[4]);
                System.out.println("Weight :" + line[5]);
                System.out.println("Acceleration :" + line[6]);
                System.out.println("Model :" + line[7]);
                System.out.println("Origin :" + line[8]);
                System.out.println("===============================");

			}

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
