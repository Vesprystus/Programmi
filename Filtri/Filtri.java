public class Filtri {

    public static void soloDispari(int n)
	{
		int i = 0; int x;
		while (i < n)
		{
			System.out.println("Numero?");
			x = SIn.readInt();
			if (Aritmetica.pari(x))
			{
				System.out.println("Il numero " + x + " e' pari.");
			}
			i++;
		}
    }
   
	/*
	public static void soloMaggioriDi(int s) {
	}

	public static void soloDoppioDi(int s) {
	}
   
	public static void soloMinoriOMaggiori(int inf, int sup) {
	}

	public static void soloInIntervallo(int inf, int sup) {
	}
	*/
   
	public static double media(int n) {
		double s = 0;
		int i = 0;
		while (i < n) {
			System.out.println("Numero?");
			s = s + SIn.readDouble();
			i++;
		}
		double m = s/n;
		return m;
	}

	public static void main (String[] args) {
   
		int inf = 0;
		int sup = 0;
      
		System.out.println("-- Stampa solo dispari");
		System.out.println("Di quanti numeri?");
		soloDispari(SIn.readInt());

		/*
		System.out.println("-- Stampa solo maggiori di ...");
		System.out.println("Limite inferiore?");
		soloMaggioriDi(SIn.readInt());

		System.out.println("-- Stampa solo doppio di ...");
		System.out.println("Numero di riferimento?");
		soloDoppioDi(SIn.readInt());

		System.out.println("-- Stampa solo minori o maggiori di ...");
		System.out.println("Limite inferiore?");
		inf = SIn.readInt();
		System.out.println("Limite superiore?");
		sup = SIn.readInt();
		soloMinoriOMaggiori(inf, sup);

		System.out.println("-- Stampa solo in intervallo ...");
		System.out.println("Limite inferiore?");
		inf = SIn.readInt();
		System.out.println("Limite superiore?");
		sup = SIn.readInt();
		soloInIntervallo(inf, sup);
		*/     
 
		System.out.println("-- Media");
		System.out.println("Di quanti numeri?");
		System.out.println("La media e' " + media(SIn.readInt()) + ".");
	}
}