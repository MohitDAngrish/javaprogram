
public class Program {
		static int j=10;//static variable(global scope)
		int k=30;//non-static variable(global scope)
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int m=20;//non-static variable(local scope)
			Program o=new Program();
			System.out.println("j="+ j);
			System.out.println("m="+ m);
			System.out.println("k="+ o.k);
		}

	}


