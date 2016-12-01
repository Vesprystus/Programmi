import java.io.*;
import java.lang.*;

public class LibreriaEuleroPigreco
{
	static int fact (int in)
	{
		int ifact=1;
		
		for (int i=1; i<=in; i++)
		{
			ifact*=i;
		}
		
		return ifact;
	}
	
	static double pi (int ipil)
	{
		double ddiv=1.0; int i=0; double dpi=1;
		
		while (i<ipil)
		{
			ddiv=ddiv+2.0;
			dpi=dpi-(1.0/ddiv);
			ddiv=ddiv+2.0;
			dpi=dpi+(1.0/ddiv);
			i++;
		}
		
		return dpi*4;
	}
	
	static double eul (int ieull)
	{
		int idiv=1; int i=0; double deul=1.0;
		
		while (i<ieull)
		{
			deul=deul+1.0/(fact(idiv));
			idiv++;
			i++;
		}
		
		return deul;
	}
	
	public static void main (String[] args)
	{
		int iread=0;
		
		System.out.println("Inserire il coefficente di approssimazione: ");
		iread = SIn.readLineInt();
		System.out.println("Pi è approssimativamente: " + pi(iread));
		System.out.println("Il numero di eulero è approssimativamente: " + eul(iread));
	}
}