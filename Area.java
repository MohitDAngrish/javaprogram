
public class Area {
	void circle()//without return type and without arguments
	{
		int r=4;
		double area=3.14*r*r;
		System.out.println("area of circle is "+ area);
	}
	void square(int a)//without return type and with arguments
	{
		int area=a*a;
		System.out.println("area of square is "+ area);
	}
	int rectanlge()//with return type and without arguments
	{
		int l=4;
		int b=5;
		int area=l*b;
		return area;
	}
	double triangle(int b,int h)//with return type and with arguments
	{
		double area=0.5*b*h;
		return area;
	}
	
	public static void main(String[] arg)//main method
	{
		Area a1=new Area();
		a1.circle();
		a1.square(5);
		int r=a1.rectanlge();
		System.out.println("area of recantgle is "+ r);
		double t=a1.triangle(5, 4);
		System.out.println("area of triangle is "+ t);	
	}
}
