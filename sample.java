package inheritance;

import java.util.Scanner;

class B
{
    int pid;
    String pname;
    Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the pid is::");
		pid=sc.nextInt();
	}
}
class D1 extends B
{
	void get2()
	{
		System.out.println("Enter the pname is::");
		pname=sc.next();
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your pid is::"+pid+"Your Pname is::"+pname);
	}
}
public class sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}



