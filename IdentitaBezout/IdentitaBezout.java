class IdentitaBezout
{
	public static int BezoutRic(int a, int b)	//calcola il MCD(a,b) usando l'identità di Bezout in modo ricorsivo
	{
		int ia=a; int ib=b;
		
		if(a==b*(a/b)+a%b)	//se l'identità è verificata
		{
			if(a%b>0) // se il resto della divisione a/b non è nullo
			{
				ia=b;	
				ib=a%b;		
				return BezoutRic(ia,ib); //MCD(b,resto di a/b)
			}
			else	
				return b; //nel caso base in cui a%b nullo, return b
		}
		else	//altrimenti c'è un errore
			return 0;
	}
	
	public static int BezoutIt(int a, int b)  //calcola il MCD(a,b) usando l'identità di Bezout in modo iterativo
	{
		int ia=a; int ib=b; int ibtemp=0;
		
		if(ia==ib*(ia/ib)+ia%ib) //se l'identità è verificata
		{
			while(ia%ib>0) // se il resto della divisione a/b non è nullo
			{
				ibtemp=ib; //itemp viene utilizzato per tenere temporaneamente il valore di ib
				ib=ia%ib; //MCD(b,resto di a/b)
				ia=ibtemp; //ia=valore precedente di ib
			}
		}
		else
			return 0; //altrimenti c'è un errore
		
		return ib;
	}
	
	public static void main(String[] args)
	{
		int a=4193; int b=599;
		
		System.out.println("Ricorsiva MCD(" + a + "," + b + ") = " + BezoutRic(a,b));
		System.out.println("Iterativa MCD(" + a + "," + b + ") = " + BezoutIt(a,b));
	}
}