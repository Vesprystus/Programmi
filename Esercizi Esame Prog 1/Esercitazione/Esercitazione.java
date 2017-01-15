import java.util.Arrays;

class Esercitazione
{
	private static boolean P(int x)
	{
		return(x%2==0);
	}
	
	public static int[] ex1(int[] a, int l)
	{
		int i=l+1; int ahold;
		
		if(a!=null&&l>=0&&l<a.length-1)	//per a non null e l compreso tra a.length-1 e 0
		{
			while(i<a.length)
			{
				if(P(a[i]))
				{
					ahold=a[l]; //insertion sort
					a[l]=a[i];	//insertion sort
					a[i]=ahold;	//insertion sort
					
					l++;
				}
			
			i++;
			}
		
			return a; 
		}
		else
			return null;
	}
	
	public static int[] ex2(int[] a)
	{
		if(a!=null&&a.length>0)
		{
			int[] b=new int[a.length];
			return ex2(a,0,a.length-1);
		}
		else
		{
			if(a.length==0)
				return a;
			else
				return null;
		}
	}
	
	private static int[] ex2(int[] a, int l, int r)
	{
		if(l==r)
		{
			if(P(a[l]))
			{
				a[l]=1;
			}
			else
			{
				a[l]=0;
			}
			
			return a;
		}
		else
		{
			int[] imS=ex2(a,l,(l+r)/2);
			int[] imD=ex2(a,(l+r)/2+1,r); //si divide l'array in due parti, che richiamandosi verranno divise in due parti ecc.
			
			return a;
		}
	}
	
	public static void main(String[] args)
	{
		int i=0;
		int[] a={0,2,5,1,4,6}; int[] b={0,2,5,1,4};
		int l=2;
		
		//ex1
		System.out.print("Array di partenza ex1: ");
		while(i<a.length)
		{
			System.out.print(a[i] + "|");
			i++;
		}
		
		ex1(a,l);
		
		System.out.println("");
		
		System.out.print("Array risultante ex1: ");
		i=0;
		while(i<a.length)
		{
			System.out.print(a[i] + "|");
			i++;
		}

		//ex2
		System.out.println("");
		i=0;
		
		System.out.print("Array di partenza ex2: ");
		while(i<b.length)
		{
			System.out.print(b[i] + "|");
			i++;
		}
		
		ex2(b);
		
		System.out.println("");
		
		System.out.print("Array risultante ex2: ");
		i=0;
		while(i<b.length)
		{
			System.out.print(b[i] + "|");
			i++;
		}
	}
}