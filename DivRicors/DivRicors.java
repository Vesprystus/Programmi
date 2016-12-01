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
			if(ires<ib)
			{
				return 0;
			}
		}
		return div(ires-ib,ib)+1;
	}

	public static void main(String[] args)
	{
		int a=10; int b=3;
		System.out.println("Il risultato di 10/3 e' :" + div(a,b));
	}
}