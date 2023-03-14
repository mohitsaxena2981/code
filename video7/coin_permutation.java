public class Main
{
	public static void main(String[] args) {
	int coin[]=new int[]{2,3,5,6};
	int amount=10;
	coinfpermutation(coin,amount,"");
		System.out.println("Hello World");
	}
	public static void coinfpermutation(int coin[],int amount,String ans)
	{
	    if(amount==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for(int x=0;x<coin.length;x++)
	    {
	        if(amount>=coin[x])
	        {
	            coinfpermutation(coin,amount-coin[x],ans+coin[x]);
	        }
	    }
	}
}
