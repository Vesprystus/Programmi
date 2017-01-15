public class MatriciBidimensionali 
{
	public static void StampaMatriceB(int[][] a) //stampa la matrice bidimensionale intera
	{
		int ir=0; int ic=0;
	
		while(ir<a.length) //finchè l'indice riga < del numero di righe del vettore a
		{
			while(ic<a[ir].length) //finchè l'indice colonna < del numero di colonne del vettore a[r]
			{
				System.out.print(a[ir][ic] + "|");
				
				ic++; //passa alla colonna successiva
			}
			System.out.printf("%n"); //va a capo una volta finito di stampare l'array a[r]
			
			ic=0; //resetta contatore colonna
			ir++; //passa alla riga successiva
		}
	}
	public static void StampaMatriceB(boolean[][] a) //stampa la matrice bidimensionale booleana
	{
		int ir=0; int ic=0;
	
		while(ir<a.length) //finchè l'indice riga < del numero di righe del vettore a
		{
			while(ic<a[ir].length) //finchè l'indice colonna < del numero di colonne del vettore a[r]
			{
				System.out.print(a[ir][ic] + "|");
				
				ic++; //passa alla colonna successiva
			}
			System.out.printf("%n"); //va a capo una volta finito di stampare l'array a[r]
			
			ic=0; //resetta contatore colonna
			ir++; //passa alla riga successiva
		}
	}
	
	public static boolean esistonoMaggioriDiK(int[][] a,int k) //true se esitono elementi maggiori di k in a altrimenti false
	{
		int ir=0; int ic=0; boolean bresult=false;
		
		while(ir<a.length) //finchè l'indice riga < del numero di righe del vettore a
		{
			while(ic<a[ir].length) //finchè l'indice colonna < del numero di colonne del vettore a[r]
			{
				if(a[ir][ic]>k) //se l'elemento a[r][c]>k
					bresult=true; //esiste almeno un maggiore di k
					
				ic++; //passa alla riga successiva
			}
			
			ic=0; //resetta il contatore colonna
			ir++; //passa alla riga successiva
		}
		
		return bresult;
	}
	
	public static int[][] ScanMatriceB()
	{
		int iR=0; int iC=0;
		int i1=0; int i2=0;
		
		System.out.print("Numero di righe della matrice? ");
		iR=SIn.readLineInt();
		
		System.out.print("Numero di colonne della matrice? ");
		iC=SIn.readLineInt();
		
		int[][] im=new int[iR][iC];
		
		System.out.println("Immettere la matrice (immettere la riga fino a che non appare -): ");
		
		while(i1<iR)
		{
			while(i2<iC)
			{
				im[i1][i2]=SIn.readLineInt();
				
				i2++;
			}
			System.out.printf("-%n");
			i2=0;
			
			i1++;
		}
		
		return im;
	}
	
	/*TEST
	public static void main(String[] args)
	{
		int k=3;

		int[][] a=ScanMatriceB();
		StampaMatriceB(a);
		
		if(esistonoMaggioriDiK(a,k))
			System.out.println("Esistono maggiori di " + k + " nella matrice");
		else
			System.out.println("Non esistono maggiori di " + k + " nella matrice");
	}
	*/
}