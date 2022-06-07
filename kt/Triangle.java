package kt;

public class Triangle extends Shape{
double A,B,C;
Triangle(String ten,double A,double B,double C){
	super(ten);
	this.A=A;
	this.B=B;
	this.C=C;
}
@Override
public double chuVi() {
	return A+B+C;
}

@Override
public double dienTich() {
	double p=(A+B+C)/2;
	return Math.sqrt(p*(p-A)*(p-B)*(p-C));
}
public String toString() {
	return "ten: "+ten+"\s"+A+"\s"+B+"\s"+C;
}

}
