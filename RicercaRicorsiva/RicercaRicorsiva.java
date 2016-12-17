class RicercaRicorsiva
{
	public static int ricercaricorsiva(int[] a, int k)
	{
		if(a!=null)
		{
			return ricercaricorsiva(a,k,0,a.length);
		}
		else
		{
			return -1;
		}
	}
	
	private static int ricercaricorsiva(int[] a,int k,int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			
			if(a[m]==k)
				return m;
			else if(a[m]<k)
					return ricercaricorsiva(a,k,m+1,r);
				else
					return ricercaricorsiva(a,k,l,m);
		}
		else
		{
			return -1;
		}
	}
	
	public static void main(String[] args)
	{
		int[] a=new int[]{4,1,2,3,4,5,6,3,8,9};
		int k=4;
		
		//if(ricercaricorsiva(a,k)!=-1)
			System.out.println("L'array contiene il numero " + k + " nella posizione: " + ricercaricorsiva(a,k));
		//else
		//	System.out.println("Array non valido");
	}
}