package kt;

public class Cricde extends Shape{
double r;
Cricde(String ten,double r){
	super(ten);
	this.r=r;
}
public double chuVi() {
	return 3.14*2*r;
}
public double dienTich() {
	return 3.14*r*r;
}
public String toString() {
	return "Ten: "+ten+"\sbankinh: "+r;
}
}
