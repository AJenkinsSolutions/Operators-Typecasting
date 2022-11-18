package com.perscholas.operators;

public class AritheticOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic Operators\n");
		
		int x, y = 10, z = 5;
		
		x = y + z;
		System.out.println("+ Operator results in " + x);
		
		x = y - z;
		System.out.println("- Operator results in " + x);
		
		x = y * z;
		System.out.println("* Operator results in " + x);
		
		x = y / z;
		System.out.println("/ Operator results in " + x);
		
		x = y % z; 
		System.out.println("% Operator results in " + x);
		
		x = y++;
		System.out.println("Postfix ++ Operator results in " + x);

		x = ++z;
		System.out.println("Prefix ++ Operator results in " + x);

		x = -y;
		System.out.println("Unary Operator results in " + x + "\n");

		//some examples of special cases
		int tooBig = Integer.MAX_VALUE + 1;
		int tooSmall = Integer.MIN_VALUE - 1;
		
		System.out.println("tooBig becomes " + tooBig);
		System.out.println("toSmall becomes " + tooSmall);
		System.out.println(4.0 / 0.0);
		System.out.println(-4.0 / 0.0);
		System.out.println(0.0 / 0.0 + "\n");
		
		double d1 = 12 /8;
		double d2 = 12.0f / 8;
		System.out.println("d1 is " + d1);
		System.out.println("d2 is " + d2);
	}

}
