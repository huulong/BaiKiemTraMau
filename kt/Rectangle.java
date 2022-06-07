package kt;

public class Rectangle extends Shape{
double A,B;
Rectangle(String ten,double A,double B){
	super(ten);
	this.A=A;
	this.B=B;
}
public double chuVi() {
	return (A+B)*2;
}
public double dienTich() {
	return A*B;
}
public String toString() {
	return "ten: "+ten+"\scanh a: "+A+"\scanh b: "+B;
}
}
