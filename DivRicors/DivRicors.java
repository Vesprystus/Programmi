class DivRicors
{
	static int div(int ia,int ib)
	{
		int ires=ia;
		
		if((ires==0)||(ires<ib))
		{
			return 0;
		}
		else
		{
			return div(ires-ib,ib)+1;
		}
		
	}

	public static void main(String[] args)
	{
		int a=50; int b=3;
		System.out.println("Il risultato di " + a + "/" + b + " e' :" + div(a,b));
	}
}