package Prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int inputPoint1,inputPoint2;
		System.out.println("Enter 2 point values of x and y to start: ");
		Scanner sc=new Scanner(System.in);
		inputPoint1=sc.nextInt();
		inputPoint2=sc.nextInt();
		Point x=new Point(inputPoint1);
		Point y=new Point(inputPoint2);
		if(x.checkPoint()&&y.checkPoint())
			System.out.println("Intersection of points "+x+" "+y+" is:"+computePointofIntersection(x, y) );
		else
			System.out.println("Not valid points");
	}
	
	public static Point computePointofIntersection(Point p1, Point p2)
	{
		int n=12;
		while(p1.getVal()!=p2.getVal())
		{
			p1.setVal((p1.getVal()+2)%n);
			p2.setVal((p2.getVal()+1)%n);
		}
		p1.setVal(p1.getVal());
		return p1;
	}
}
