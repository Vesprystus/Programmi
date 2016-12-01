class equiparazioneArray
{
	static boolean eqIt(int[] a, int[] b) //controlla se a==b per iterazioni successive
	{
		int i=0; boolean uguali=true;	//il caso base è che i due array siano uguali
		
		if(a!=null && b!=null)	//se i due array non sono nulli
		{
			if(a.length==b.length)	//se le lunghezze dei due array sono uguali
			{
				while(i<a.length && uguali)	//finchè l'indice è minore della lunghezza di a && sono fino ad ora uguali
				{
					if(a[i]==b[i])	//se gli elementi [i] dei due array sono uguali
						i++;		//passo agli elementi successivi
					else
						uguali=false;	//altrimenti non sono uguali e quindi esce dal ciclo
				}
			}
			else
				uguali=false;
		}
		else
		{
			if(a==null ^ b==null)	//se uno degli array è nullo e l'altro no (^ = XOR [0 1 1 0])
				uguali=false;		//non sono uguali
		}
		
		return uguali;
	}
	
	static boolean eqRic(int[] a, int[] b)	//controlla se a==b utilizzando eqRicTemp, che è un metodo ricorsivo
	{
		return eqRicTemp(a,b,a.length);		//si usa un metodo temporaneo per non dover immetere nel metodo principale anche la lunghezza degli array
	}
	
	static boolean eqRicTemp(int[] a, int[] b, int i)	//metodo temporaneo per calcolare ricorsivamente con i iniziale = a.length
	{
		if(a!=null && b!=null)	//se i due array non sono nulli
		{
			if(a.length==b.length)	//se le lunghezze dei due array sono uguali
			{
				if(i>0)		//se l'indice è maggiore di 0
					return eqRicTemp(a,b,i-1)&&(a[i-1]==b[i-1]); 	/*return a[i-1]==b[i-1] && il valore della funzione nell'iterazione precedente, notare
																che per i==1 l'iterazione successiva è il caso base di un array con un solo elemento*/
				else
					return a[0]==b[0];	//altrimenti ho comparato tutti gli elementi e quindi sono uguali
			}
			else
				return false;	//altrimenti i due array non sono uguali
		}
		else
		{
			if(a==null ^ b==null)	//se uno degli array è nullo e l'altro no (^ = XOR [0 1 1 0])
				return false;		//non sono uguali
			else
				return true;	//altrimenti sono uguali
		}	
	}
	
	public static void main(String[] args)	//testing
	{
		int[] a={1,2,3,4,5};
		int[] b={1,2,3,4,5};
		
		if(eqIt(a,b))
		{
			System.out.println("I due array sono uguali per iterazioni successive.");
		}
		else
		{
			System.out.println("I due array sono diversi per iterazioni successive.");
		}
		
		if(eqRic(a,b))
		{
			System.out.println("I due array sono uguali per ricorsione.");
		}
		else
		{
			System.out.println("I due array sono diversi per ricorsione.");
		}
	}
}