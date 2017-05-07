package example;

public class Dealer {

	public static void main(String[] args)
	{
		TwoWheeler t1=new TwoWheeler();
		System.out.println("The cost of Two Wheeler is "+t1.getcost());
		System.out.println("The speed of Two Wheeler is "+t1.getspeed());
		ThreeWheeler t2=new ThreeWheeler();
		System.out.println("The cost of Three Wheeler is "+t2.getcost());
		System.out.println("The speed of Three Wheeler is "+t2.getspeed());
		FourWheeler t3=new FourWheeler();
		System.out.println("The cost of Four Wheeler is "+t3.getcost());
		System.out.println("The speed of Four Wheeler is "+t3.getspeed());
	}
}
