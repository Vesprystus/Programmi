class Aritmetica{
	static int somma (int isum1, int isum2){			//somma
		int isumr=isum1; int isum=isum2;
		
		while (isum > 0){
			isum--;
			isumr++;
		}

		return isumr;	
	}

	static int sottrazione (int isub1, int isub2){			//sottrazione
		int isubr=isub1; int isub=isub2;
			
		while (isub > 0){
			isub--;
			isubr--;
		}
		
		return isubr;
	}

	static int moltiplicazione (int im1, int im2){		//moltiplicazione
		int imr=0; int im=im2;
		
		while (im > 0){
			imr=imr+im1;
			im--;
		}
		
		return imr;
	}

	static int divisione (int id1res, int id2res){		//divisone risultato
		int idresrem=id1res; int idres=0;
		
		while (idresrem > id2res){
			idres++;
			idresrem=idresrem-id2res;		
		}
		
		return idres;
	}

	static int divisioneresto (int id1rem, int id2rem)   //divisione resto
	{		
		int idrem=id1rem;
			
		while (idrem > id2rem)
		{
			idrem=idrem-id2rem;		
		}
			
		return idrem;	
	}
	
	static boolean pari (int ipar)			//parità
	{
		if (ipar%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static long fattoriale(int n) {		//fattoriale intero
      long r = 1;
      int i = n;
      while (i > 0) {
         r = r * i;
         i = i - 1;
      }
      return r;
   }

   public static double fattoriale(double n) {		//fattoriale virgola
      double r = 1.0d;
      double i = n;
      while (i > 0) {
         r = r * i;
         i = i - 1;
      }
      return r;
   }
}