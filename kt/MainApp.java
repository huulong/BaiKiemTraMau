package kt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainApp {
static Scanner sc=new Scanner(System.in);
public static void inputCri(List<Shape>list) {
	System.out.print("Nhap ten: ");
	String ten=sc.next();

	System.out.print("Nhap bk: ");
	double r=sc.nextDouble();
	list.add(new Cricde(ten,r));
}
public static void inputRec(List<Shape>list) {
	System.out.print("Nhap ten: ");
	String ten=sc.next();
	sc.nextLine();
	System.out.print("Nhap A: ");
	double A=sc.nextDouble();
	System.out.print("Nhap B: ");
	double B=sc.nextDouble();
	list.add(new Rectangle(ten,A,B));
}
public static void inputTri(List<Shape>list) {
	System.out.print("Nhap ten: ");
	String ten=sc.next();
	System.out.print("Nhap A: ");
	double A=sc.nextDouble();
	System.out.print("Nhap B: ");
	double B=sc.nextDouble();
	System.out.print("Nhap C: ");
	double C=sc.nextDouble();
	list.add(new Triangle(ten,A,B,C));
}
public static void printCri(List<Shape>list) {
	for(Shape x:list) {
		System.out.println(x);
	}
}
public static void printRec(List<Shape>list) {
	for(Shape x:list) {
		System.out.println(x);
	}
}
public static void printTri(List<Shape>list) {
	for(Shape x:list) {
		System.out.println(x);
	}
}
public static Shape findCricde(List<Shape>list) {
	double c=0;
	Shape t=null;
	for(Shape x:list) {
		if(x.dienTich()>c) {
			c=x.dienTich();
			t=x;
		}
	}
	return t;
}
public static Shape findRectangle(List<Shape>list) {
	double c=0;
	Shape t=null;
	for(Shape x:list) {
		if(x.dienTich()>c) {
			c=x.dienTich();
			t=x;
		}
	}
	return t;
}
public static Shape findTriangle(List<Shape>list) {
	double c=0;
	Shape t=null;
	for(Shape x:list) {
		if(x.dienTich()>c) {
			c=x.dienTich();
			t=x;
		}
	}
	return t;
}
	public static void main(String[] args) {
		List<Shape>list=new ArrayList<Shape>();
		inputCri(list);inputCri(list);inputCri(list);
		
		printCri(list);
		list.sort(Comparator.comparing(Shape::dienTich));
		printCri(list);
		//printCri(list);
//		System.out.print(findCricde(list));
//		//
//		inputRec(list);inputRec(list);inputRec(list);
//		//printRec(list);
//		System.out.print(findRectangle(list));
//		//
//		inputTri(list);inputTri(list);inputTri(list);
//		//printTri(list);
//		System.out.print(findTriangle(list));

	}

}
