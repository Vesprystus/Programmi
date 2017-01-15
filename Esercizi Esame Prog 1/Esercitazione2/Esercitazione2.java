public class Esercitazione2
{
    public static int[] es1(boolean[][]m) //data una matrice booleana m[x][y], restituisce un array di interi a[x] tale che a[i]=(numero di elementi della riga m[i] che sono true)
	{
        int[]a = new int[m.length]; //array risultante
        int ntrue=0;
		int x=0; int y=0;
		
        while(x<m.length){          //fino a quando non controllo tutte le righe.
            while(y<m[x].length)	//fino a quando y raggiunge la lunghezza della matrice
			{       
                if(m[x][y]==true)	//se la cella contiene true vado avanti di una cella.
				{           
                    ntrue++;
                }
				
                y++;
            }
			
            a[x]=ntrue;	//metto nella cella x-esima di a il valore di ntrue.
            x++;
            y=0;	//resetta l'indice.
            ntrue=0;	//resetta il numero di true.
        }
       
        return a;
    }
   
 
    public static void main(String[] args)
	{
        boolean[][]m={{true,false,false,true},{true,true,true,true},{false,false,false,false},{false,true,false,true}};
        int x=0; int y=0;
		
		System.out.println("La matrice m: ");
		
            while(x<m.length)
			{
               
                while(y<m[x].length)
				{
                    System.out.print(m[x][y] + "|");     //stampa m[y].
                    y++;                            //stampa quello successivo.
                }
               
                System.out.println();
                y=0;                            //resetta l'indice.
                x++;
            }
       
        int[]a=es1(m);
        System.out.println("Il vettore a: ");
        int l=0;
           
        while(l<a.length)
		{
            System.out.print(a[l] + "|");
            l++;
        }
		System.out.println("");
    }
}