public class VarieArray
{
	public static int minimo(int[] a) //return il minino valore nell'array
	{
		if(a.length!=1)
			return minimo(a,0,a.length-1);
		else
			return 0;
	}
	
	private static int minimo(int[] a, int l, int r) //return il minino valore nell'array
	{
		if(l==r)
		{
			return a[l]; //se l=r return a[l] (minimo di un array con un elemento)
		}
		else
		{
			int imS=minimo(a,l,(l+r)/2); 
			int imD=minimo(a,(l+r)/2+1,r); //si divide l'array in due parti, che richiamandosi verranno divise in due parti ecc.
			
			return ((imS<imD)?imS:imD); //return il minimo tra gli elementi con indice pari e quelli con indice dispari
		}
	}
	
	
	public static int contaMaggioriDiK(int[] a, int k) //return il numero di valori dell'array maggiori di K
	{
		if(a.length!=1)
			return contaMaggioriDiK(a,k,0,a.length-1);
		else
			return 0;
	}
	
	private static int contaMaggioriDiK(int[] a, int k, int l, int r) //return il numero di valori dell'array maggiori di K
	{
		if(l==r)
		{
			if(a[l]>k) //se a[l] maggiore di k
				return 1; //il risultato aumenta di 1
			else
				return 0; //altrimenti non aumenta
		}
		else
		{			
			return contaMaggioriDiK(a,k,l,(l+r)/2)+contaMaggioriDiK(a,k,(l+r)/2+1,r); //return la somma del numero di istanze in cui a[l] è maggiore di k
		}
	}
	
	public static boolean esistonoMaggioriDiK(int[] a, int k) //return true se esistono maggiori di K altrimenti false
	{
		if(a.length!=1)
			return esistonoMaggioriDiK(a,k,0,a.length-1);
		else
			return false;
	}
	
	private static boolean esistonoMaggioriDiK(int[] a, int k, int l, int r) //return true se esistono maggiori di K altrimenti false
	{
			if(l==r)
			{
				return (a[l]>k); //true se a[l] maggiore di k
			}
			else
			{
				boolean iexS=esistonoMaggioriDiK(a,k,l,(l+r)/2); 
				boolean iexR=esistonoMaggioriDiK(a,k,(l+r)/2+1,r); //si divide l'array in due parti, che richiamandosi verranno divise in due parti ecc.
				
				return iexS||iexR; //true se in una metà "or" nell'altra esistono maggiori di k
			}
	}
	
	
	public static boolean tuttiMaggioriDiK(int[] a, int k) //return true se tutti maggiori di K altrimenti false
	{
		if(a.length!=1)
			return tuttiMaggioriDiK(a,k,0,a.length-1);
		else
			return false;
	}
	
	private static boolean tuttiMaggioriDiK(int[] a, int k, int l, int r) //return true se tutti maggiori di K altrimenti false
	{
			if(l==r)
			{
				return (a[l]>k); //true se a[l] maggiore di k
			}
			else
			{
				boolean iS=esistonoMaggioriDiK(a,k,l,(l+r)/2);
				boolean iR=esistonoMaggioriDiK(a,k,(l+r)/2+1,r); //si divide l'array in due parti, che richiamandosi verranno divise in due parti ecc.
				
				return iS&&iR; //true se iS tutti maggiori di k && iR tutti maggiori di k
			}
	}
	
	
	public static int tuttiZeroUno(int[] a) //return 1 se tutti 1, 0 se tutti 0 e -1 altrimenti
	{
		if(a.length!=1)
			return tuttiZeroUno(a,0,a.length-1);
		else
			return -1;
	}
	
	private static int tuttiZeroUno(int[] a, int l, int r) //return 1 se tutti 1, 0 se tutti 0 e -1 altrimenti
	{
			if(l==r)
			{
				if(a[l]==1)
				{
					return 1;
				}
				else
				{
					if(a[l]==0)
					{
						return 0;
					}
					else
					{
						return -1;
					}
				}
			}
			else
			{
				int iS=tuttiZeroUno(a,l,(l+r)/2);
				int iR=tuttiZeroUno(a,(l+r)/2+1,r); //si divide l'array in due parti, che richiamandosi verranno divise in due parti ecc.
				
				return (iS==iR)?iS:-1; //return iS se iS==iR (tutti 0 o tutti 1) altrimenti -1
			}
	}
	

	
	public static void main(String[] args)
	{
		int[] a=new int[]{5,6,10,43,32,15,78,100,2,0,4};
		int[] b=new int[]{1,0,0,1,0,1,0,1,0,1};
		int[] c=new int[]{1,1,1,1,1,1,1,1,1,1};
		int k=10;
		
		System.out.println("Il minimo valore di a è " + minimo(a));
		
		if(esistonoMaggioriDiK(a,k))
		{
			System.out.println("Esistono maggiori di 10");
		}
		
		System.out.println("Il numero di maggiori di 10 è " + contaMaggioriDiK(a,k));
		
		
		if(tuttiMaggioriDiK(b,0))
		{
			System.out.println("{1,1,1,1,1,1,1,1,1,1} Tutti maggiori di 0");
		}

		
		if(tuttiZeroUno(b)==1)
		{
			System.out.println("Tutti 1");
		}
		else
		{
			if(tuttiZeroUno(b)==0)
				System.out.println("Tutti 0");
			else
				System.out.println("Non tutti uguali");
		}
		
		if(tuttiZeroUno(c)==1)
		{
			System.out.println("Tutti 1");
		}
		else
		{
			if(tuttiZeroUno(c)==0)
				System.out.println("Tutti 0");
			else
				System.out.println("Non tutti uguali");
		}
	}
}