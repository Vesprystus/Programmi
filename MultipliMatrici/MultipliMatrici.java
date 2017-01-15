class MultipliMatrici
{
	public static boolean[][] multipliMatrici(int[][] a, int[][] b) //restituisce un array bidimensionale i cui elementi r[x][y] sono true se a[x][y] divide b[x][y] o viceversa, altrimenti sono false
	{
		int iR=0; int iC=0; //indicatori Riga e Colonna
		int i=0; int i1=0; int i2=0; //indice
		boolean[][] bresult; //risultato
		
		if(a.length>=b.length) //controlla il numero di righe maggiore
		{
			iR=a.length;
		}
		else
		{
			iR=b.length;
		}
		
		while(i<iR-1) //finchè non ha controllato tutte le righe
		{
			if(a[i].length>=b[i].length) //se il numero di colonne di a[i] è maggiore
			{
				if(iC<a[i].length) //se le righe precedenti avevano numero di colonne minore di quella attuale
					iC=a[i].length;
			}
			else //altrimenti il numero di colonne di b[i] è maggiore
			{
				if(iC<b[i].length) //se le righe precedenti avevano numero di colonne minore di quella attuale
					iC=b[i].length;
			}
			
			i++;
		}
		
		bresult=new boolean[iR][iC]; //definisce le dimensioni della matrice risultante

		while(i1<bresult.length) //finchè non controlla tutte le righe
		{
			while(i2<bresult[i1].length) //finchè non controlla tutte le colonne
			{
				if(a.length>i1 && b.length>i1 && a[i1].length>i2 && b[i1].length>i2 && (a[i1][i2]!=0) && (b[i1][i2]!=0)) //se esistono a[i1][i2] e b[i1][i2] e sono diversi da 0 (non si può dividere per 0)
					bresult[i1][i2]= (a[i1][i2]%b[i1][i2])==0 || (b[i1][i2]%a[i1][i2])==0; //controlla se a[x][y] è divisible per b[x][y] o viceversa
				else
					bresult[i1][i2]=false;
				
				i2++;
			}
			i2=0;
			
			i1++;
		}
		
		return bresult;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Immettere la prima matrice: ");
		int[][] a=MatriciBidimensionali.ScanMatriceB();
		
		System.out.println("Immettere la seconda matrice: ");
		int[][] b=MatriciBidimensionali.ScanMatriceB();
		
		MatriciBidimensionali.StampaMatriceB(a);
		System.out.printf("%n");
		MatriciBidimensionali.StampaMatriceB(b);
		
		System.out.println("La matrice risultante: ");
		MatriciBidimensionali.StampaMatriceB(multipliMatrici(a,b));
	}
}