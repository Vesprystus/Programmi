class OrdinamentoArray
{
	public static int[] OrdinamentoArray(int[] a) //ordina gli elementi di un array in ordine crescente
	{
		int ihold; int i=0; int il=a.length;
		
		while(il>0)  //ciclo che riordina array mano a mano più piccoli (a[i-1-1-1-1...])
		{
			while(i<il-1)	//ciclo che riordina il numero più grande dell'array es. {3,1,2,1}-->{1,2,1,3}
			{
				if(a[i]>a[i+1]) //se a[i] + più grande di a[i+1]
				{
					ihold=a[i+1]; //ahold usato temporanemente per mantenere il valore di a[i+1]
					a[i+1]=a[i];
					a[i]=ihold;  //scambia a[i] e a[i+1]
				}	//altrimenti lascia gli elementi nella loro posizione
				
				i++;
			}
			
			i=0; //resetta l'indice
			il--;
		}
		
		return a;
	}
	
	public static void main(String[] args)
	{
		int[] a=new int[]{5,8,2,4,78,8,34,3,1561,9}; int i=0;
		
		System.out.println("L'array è: ");
		
		while(i<a.length)	//stampa a
		{
			System.out.println(a[i]);
			
			i++;
		}
		
		System.out.println("Riordinato : ");
		
		OrdinamentoArray(a);
		
		i=0;		
		while(i<a.length)	//stampa a
		{
			System.out.println(a[i]);
			
			i++;
		}
		
		
	}
}