import java.io.*;
import java.util.*;
import java.lang.*;

public class LibAritmetica_con_Sln{
	static int sum (int isum1, int isum2){			//somma isum1+isum2
		int isumr=isum1; int isum=isum2;
		
		while (isum > 0){	//indice>0
			isum--;			//indice --
			isumr++;		//risultato ++
		}

		return isumr;	
	}

	static int sub (int isub1, int isub2){			//sottrazione isub1-isub2
		int isubr=isub1; int isub=isub2;
			
		while (isub > 0){	//indice>0
			isub--;			//indice --
			isubr--;		//risultato --
		}
		
		return isubr;
	}

	static int mul (int im1, int im2){				//moltiplicazione im1*im2
		 int imr=0; int im=im2;
		
		while (im > 0){		//indice>0
			im--;			//indice --
			imr=imr+im1;	//risultato=risulato+im1			
		}
		
		return imr;
	}

	static int divres (int id1res, int id2res){		//divisone risultato id1res/1d2res
		 int idresrem=id1res; int idres=0;
		
		while (idresrem >= id2res){		//resto>=divisore
			idres++;					//risultato ++
			idresrem=idresrem-id2res;	//resto=resto-divisore
		}
		
		return idres;
	}

	static int divrem (int id1rem, int id2rem){		//divisione resto id1rem/id2rem=idremrem
		 int idremrem=id1rem; int idrem=0;
		
		while (idremrem >= id2rem){		//resto>=divisore
			idrem++;					//risultato ++
			idremrem=idremrem-id2rem;	//resto=resto-divisore	
		}
		
		return idremrem;	
	}

	public static char readChar()		//legge un carattere come numero intero e lo emette come carattere
    {
        int charAsInt = -1; //To keep the compiler happy
        try
        {
            charAsInt = System.in.read();	//legge il carattere come numero
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Fatal error. Ending Program.");
            System.exit(0);
        }

        return (char)charAsInt;		//emette il numero come carattere
    }
	
	public static String readLine()		//legge una parola
    {
        char nextChar;
        String result = "";
        boolean done = false;

        while (!done)					//finchè non ha finito la lettura
        {
            nextChar = readChar();		//legge un carattere
            if (nextChar == '\n')		//se legge uno spazio esce dal ciclo
               done = true;
            else if (nextChar == '\r')	//se legge invio non fa nulla e in automatico legge spazio>esce dal ciclo
            {
                //Do nothing.
                //Next loop iteration will detect '\n'
            }
            else
               result = result + nextChar;	//se non legge spazi o invii, aggiunge alla stringa il carattere digitato
        }

        return result;
    }
	
	public static int readLineInt()		//legge un numero intero (parola) e eliminia gli spazi vuoti
    {
        String inputString = null;
        int number = -9999;//To keep the compiler happy.
                              //Designed to look like a garbage value.
        boolean done = false;

        while (! done)		//finchè non ha finito la lettura
        {
            try
            {
                inputString = readLine();								//legge una parola
                inputString = inputString.trim();						//toglie gli spazi vuoti
                number = (Integer.valueOf(inputString).intValue());		//assegna a number il valore intero della parola
                done = true;											//finisce la lettura
            }
            catch (NumberFormatException e)		//se il formato è sbagliato dà un messaggio di errore
            {
                System.out.println("Your input number is not correct.");
                System.out.println("Your input number must be");
                System.out.println("a whole number written as an");
                System.out.println("ordinary numeral, such as 42");
                System.out.println("Please, try again.");
                System.out.println("Enter a whole number: ");
            }
        }

        return number;
    }
	
	public static void main (String[] args) {
		int ia; int ib;
		
		System.out.println("Inserisci due numeri interi positivi minori di 2147483647: ");		
		ia = readLineInt();
		ib = readLineInt();
		
		System.out.println("I numeri sono: " + ia + " e " + ib);
		System.out.println("La somma: " + sum (ia,ib));
		System.out.println("La sottrazione: " + sub (ia,ib));
		System.out.println("Il prodotto: " + mul (ia,ib));
		System.out.println("Il quoziente: " + divres (ia,ib) + " resto " + divrem (ia,ib));
		
	}
}