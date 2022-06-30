package LineComp;

import java.util.Scanner;

public class Computation {
	int x1,y1,x2,y2,x3,y3,x4,y4;
	double line1_length,line2_length;

	public void welcome() {
		System.out.println("Welcome to Line Comparison Computation program");
	}
	public void input() {
		System.out.println("Enter x1,y1,x2 and y2 for line 1");
		Scanner sc = new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("Enter x3,y3,x4 and y4 for line 2");
		x3=sc.nextInt();
		y3=sc.nextInt();
		x4=sc.nextInt();
		y4=sc.nextInt();
		sc.close();
	}

	public void distance() {
		line1_length = Math.floor(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		line2_length = Math.floor(Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)));
		System.out.println("Length of a First Line is " + line1_length);
		System.out.println("Length of a Second Line is " + line2_length);
	}
	public void compare() {
		if(line1_length == line2_length) {
			System.out.println("The Two Lines are Equal");
		}
		else {
			System.out.println("They are not Equal");
		}
	}


}





