//Programma che calcola il risultato di 3x2+2x3

class SommaMolt{
		static int somma (int i_s1, int i_s2){		//Somma procedurale
			int i_somma=i_s1; int i_b=i_s2;
			
			while (i_b>0){
				i_somma++;
				i_b--;
			}
			return i_somma;
		}
	
		static int molt (int i_m1, int i_m2){		//Prodotto procedurale
			int i_prod=0; int i_c=i_m1; int i_d=i_m2;
			
			while (i_d>0){
				i_prod=somma (i_prod,i_c);
				i_d--;
			}
			return i_prod;
		}

	public static void main (String[] args){
		int result;
		
		result=somma (molt (3,2), molt (2,3));		//Risultato
		System.out.println("Il risultato di 2x3+3x2 è ");
		System.out.println(result);
		System.out.println(".");
	}
}