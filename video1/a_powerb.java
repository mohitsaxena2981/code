// power 
public class Main
{
	public static void main(String[] args) {
	    int base=3;
	    int power=4;
	    System.out.println(pow(base,power));
		System.out.println("Hello World");
	}
	
	public static int pow(int base,int power)
	{
	   if(power==0)
	   {
	       return 1;
	   }
	    int count=pow(base,power-1);
	    return base*count;
	}
}
