class RicercaRicorsiva
{
	public static int ricercaricorsiva(int[] a, int k) //cerca k in a e restituisce la posizione se esiste altrimenti -1
	{
		if(a!=null)
			return ricercaricorsiva(a,k,0,a.length-1);
		else
			return -1;
	}
	
	private static int ricercaricorsiva(int[] a, int k, int l, int r) //cerca k in a e restituisce la posizione se esiste altrimenti -1
	{
		if(l==r)
		{
			if(a[l]==k) //se a[l]==k
				return l; //restituisce la posizione
			else 
			{
				return -1; //altrimenti restituisce -1
			}
		}
		else
		{
			int iS=ricercaricorsiva(a,k,l,(l+r)/2);
			int iD=ricercaricorsiva(a,k,(l+r)/2+1,r); //si divide l'array in due parti, che richiamandosi verranno divise in due parti ecc.
			
			return ((iS!=-1)?iS:((iD!=-1)?iD:-1)); //se iS contiene k restituisce iS, altrimenti se iD contiene k restituisce iD altrimenti restituisce -1
		}
	}
	
	public static void main(String[] args)
	{
		int[] a=new int[]{3,1,2,3,5,5,4,3,8,9};
		int k=4;
		
		System.out.println("L'array contiene il numero " + k + " nella posizione (da 0 a n inclusi): " + ricercaricorsiva(a,k));
	}
}