public class MatriciBidimensionali 
{
	public static void StampaMatriceB(int[][] a) //stampa la matrice bidimensionale
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
   
	public static void main(String[] args)
	{
		int[][] a={{1},{2,3},{4}};
		int k=3;

		StampaMatriceB(a);
		
		if(esistonoMaggioriDiK(a,k))
			System.out.println("Esistono maggiori di " + k + " nella matrice");
		else
			System.out.println("Non esistono maggiori di " + k + " nella matrice");
	}
}