import java.lang.*;

class Aritmetica
{
	static int somma(int ia, int ib)
	{
		int isomma=ia; int i=ib;
		
		if(ib>=0)
		{
			while(i>0)
			{
				isomma++;
				i--;
			}
		}
		else
		{
			while(i<0)
			{
				isomma--;
				i++;
			}
		}
		
		return isomma;
	}
	
	static int sottrazione(int ia, int ib)
	{
		int isott=ia; int i=ib;
		
		if(ib>=0)
		{
			while(i>0)
			{
				isott--;
				i++;
			}
		}
		else
		{
			while(i<0)
			{
				isott++;
				i++;
			}
		}
		
		return isott;
	}
	
	static int moltiplicazione(int ia, int ib)
	{
		int imolt=Math.abs(ia); int ibabs=Math.abs(ib); int i=ibabs;
		
		while(i>0)
		{
			imolt=somma(imolt , ib);
			i--;
		}
		
		if(ia>0&&ib<0 || ia<0&&ib>0)
		{
			imolt=-imolt;
		}
		
		return imolt;
	}
	
	static int divisione(int ia, int ib)
	{
		int idiv=0; int irest=Math.abs(ia);
		
		while(irest>ib){
			irest=sottrazione(irest , Math.abs(ib));
			idiv++;
		}
		
		if(ia>0&&ib<0 || ia<0&&ib>0)
		{
			idiv=-idiv;
		}
		
		return idiv;
	}
	
	static int divisioneresto(int ia, int ib)
	{
		int idiv=0; int irest=Math.abs(ia);
		
		while(irest>ib){
			irest=sottrazione(irest , Math.abs(ib));
			idiv++;
		}
		
		if(ia>0&&ib<0 || ia<0&&ib>0)
		{
			idiv=-idiv;
		}
		
		return irest;
	}
	
	static int esponenziale(int ia, int ib)
	{
		int iesp=ia;
		
		while(ib>0)
		{
			iesp=moltiplicazione(iesp,ia);
			ib--;
		}
		
		if(ib>0)
			return iesp;
		else
			return 0;
	}
	
	static long fattoriale(int ia)
	{
		long lfatt=1; int i=ia;
		
		while (i>0)
		{
			lfatt=lfatt*i;
			i--;
		}
		
		return lfatt;
	}
	
	static boolean pari(int ia)
	{
		if(divisioneresto(ia,2)==0)
			return true;
		else
			return false;
	}
	
	static void stampapari(int ia)
	{
		if(pari(ia))
			System.out.println("Il numero " + ia + " e' pari");
		else
			System.out.println("Il numero " + ia + " e' dispari");
	}
	
	public static void main(String[] args)
	{
		int a=5; int b=-2;
		System.out.println("La somma: " + somma(a,b));
		System.out.println("La sottrazione: " + sottrazione(a,b));
		System.out.println("Il prodotto: " + moltiplicazione(a,b));
		System.out.println("Il quoziente: " + divisione(a,b) + " resto " + divisioneresto(a,b));
		System.out.println("L'esponenziale: " + esponenziale(a,Math.abs(b)));
		System.out.println("Il fattoriale: " + fattoriale(a));
		stampapari(a);
		stampapari(b);
	}
}