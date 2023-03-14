public class Main
{
	public static void main(String[] args) {
	    int arr[]=new int[]{1,2,4,2,5,7};
	    firstoccurence(arr,0,3);
		System.out.println("Hello World");
	}
	
	public static void firstoccurence(int arr[],int i,int target)
	{
	    if(arr[i]==target || i>arr.length-1)
	    {
	        System.out.println(i);
	        return;
	    }
	    if(i>=arr.length-1)
	    {
	        System.out.println("-1");
	        return;
	    }
	    firstoccurence(arr ,i+1,target);
	}
}

// or

public class Main
{
	public static void main(String[] args) {
	    int arr[]=new int[]{1,2,4,2,5,7};
	    System.out.println(firstoccurence(arr,0,3));
		System.out.println("Hello World");
	}
	
	public static int firstoccurence(int arr[],int i,int target)
	{
	    if(arr[i]==target)
	    {
	        
	        return i;
	    }
	    if(i>=arr.length-1)
	    {
	        
	        return -1;
	    }
	    return firstoccurence(arr ,i+1,target);
	}
}

