class LibreriaAritmetica{
	static int sum (int isum1, int isum2){			//somma
		int isumr=isum1; int isum=isum2;
		
		while (isum > 0){
			isum--;
			isumr++;
		}

		return isumr;	
	}

	static int sub (int isub1, int isub2){			//sottrazione
		int isubr=isub1; int isub=isub2;
			
		while (isub > 0){
			isub--;
			isubr--;
		}
		
		return isubr;
	}

	static int mul (int im1, int im2){				//moltiplicazione
		 int imr=0; int im=im2;
		
		while (im > 0){
			imr=imr+im1;
			im--;
		}
		
		return imr;
	}

	static int divres (int id1res, int id2res){		//divisone risultato
		 int idresrem=id1res; int idres=0;
		
		while (idresrem > id2res){
			idres++;
			idresrem=idresrem-id2res;		
		}
		
		return idres;
	}

	static int divrem (int id1rem, int id2rem){		//divisione resto
		 int idremrem=id1rem; int idrem=0;
		
		while (idremrem > id2rem){
			idrem++;
			idremrem=idremrem-id2rem;		
		}
		
		return idremrem;	
	}

	public static void main (String[] args) {
		int ia=5; int ib=24;
		
		System.out.println("I numeri sono " + ia + " e " + ib);
		System.out.println("La somma: " + sum (ia,ib));
		System.out.println("La sottrazione: " + sub (ia,ib));
		System.out.println("Il prodotto: " + mul (ia,ib));
		System.out.println("Il quoziente: " + divres (ia,ib) + " resto " + divrem (ia,ib));
		
	}
}