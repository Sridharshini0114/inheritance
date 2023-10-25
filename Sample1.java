package inheritance;
import java.util.Scanner;

class demo
{
	int pid,pprice;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		pid=sc.nextInt();
		pprice=sc.nextInt();
	}
}
class D extends demo
{
	void get2()
	{
		System.out.println("Your pid is::"+pid+"Your pprice::"+pprice);
	}
}
public class Sample1 {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
