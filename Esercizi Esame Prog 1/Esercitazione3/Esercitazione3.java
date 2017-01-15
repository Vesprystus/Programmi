public class Esercitazione3
{
   
	private static int pow(int x, int y)
	{
		int ris = 1;
	
        while (y > 0 )
		{
			ris = ris * x;
			y = y - 1;
        }
		
		return ris;
	}
 
/**
 *  ESERCIZIO 1:
    Scrivere un metodo iterativo ex1 con le seguenti caratteristiche:
 *
 * a) ex1 ha un parametro formale m di tipo reference ad array di array di interi
 * ed un parametro formale a di tipo reference ad array interi. L'ipotesi e' che
 * gli elementi m[i] di m (le righe), abbiano uguale lunghezza;
 * b) ex1 restituisce la somma pow(2, rMin) + pow(3, rMax) dove:
 *    - rMin, se determinabile, e' il piu' PICCOLO indice di riga di m tale che
 *      a[i]==m[rMin][i] per i=0,1,...,a.length-1 se a.length<=m[rMin].length.
 *      Ovvero, se esiste, rMin e' l'indice alla prima riga di m a partire da 0
 *      i cui primi a.length elementi coincidano con quelli di egual posizione in a;
 *    - rMax, se determinabile, e' il piu' GRANDE indice di riga di m tale che
 *      a[i]==m[rMax][i] per i=0,1,...,a.length-1 se a.length<=m[rMax].length.
 *      Ovvero, se esiste, rMax e' l'indice alla prima riga di m a partire da m.length-1
 *      i cui primi a.length elementi coincidano con quelli di egual posizione in a.
 * c) ex1 restituisce 0 in ogni altro caso.
 *
 * DOVE SCRIVERE ex1.
 * Il metodo ex1 va scritto immediatamente al di fuori di questo commento.
 * L'aggiunta del metodo ex1 deve mantenere compilabile la classe.
 */
 
 
 
    public static int ex1(int[][]m, int[]a){
       
        if(a!= null && m!=null)
		{
            return (pow(2,rMin(m,a))+pow(3,rMax(m,a)));
        }
        else
            return 0;
    }
 
    public static int rMin(int[][]m, int[]a)
	{
		int i=0;
		int r=i;
		int j=0;
		
        if(a.length<=m[i].length)	//Se lunghezza di a è minore di quella della matrice.
		{      
            while(i<m.length)	//Fino a quando i è minore della
			{      
                while(j<a.length)	//Fino a quando j non arriva alla lunghezza della matrice.
				{       
                    if(m[i][j]==a[j])	//Controllo se l'elemeno i,j è uguale ad a[j];
					{      
                        j++;	//Se si controllo il successivo.
                    }
                    else
					{
                        j=a.length+2;		//altrimenti esco dal ciclo.
                    }
					
					if(j==a.length+1)
					{
						i=m.length;
					}
                }
                
                i++;	//Cambio Riga e resetto l'indice j.
				r--;
                j=0;
            }
			
            return r;
        }
        else
		{
            return 0;
        }
    }
   
    public static int rMax(int[][]m, int[]a)
	{
        int i=m.length-1;
		int r=i;
        int j=0;
           
        if(a.length<=m[i].length)
		{
            while(i>0)
			{
                while(j<a.length)
				{
                    if(m[i][j]==a[j])
					{
                        j++;
                    }
                    else
					{
						j=a.length+2;     //esce dal ciclo.
                    }
					
					if(j==a.length+1)
					{
						i=0;
					}
                }
				
                i--;
				r--;
                j=0;
            }
			
            return r;
        }
        else
		{
            return 0;
        }
    }
	
	public static void main(String[] args)
	{
		int[] v={1,2,3,4};
		
		System.out.println("Matrice di partenza: ");
		int[][] a=MatriciBidimensionali.ScanMatriceB();
		
		System.out.println("Vettore di partenza: ");
		
		System.out.println("Risultato: " + ex1(a,v));
	}
}

