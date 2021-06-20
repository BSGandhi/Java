package fib;
public class Fibonacci {
	public static void main(String []args) {
		int i,num=7,f=0,s=1;
		System.out.print(f+""+s);
		for(i=0;i<num;i++) {
			int fib=f+s;
			f=s;
			s=fib;
			System.out.print(fib);
		}
  }
}
