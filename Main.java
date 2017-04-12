import java.util.Scanner;

import java.util.GregorianCalendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Supermercato supermercato=new Supermercato();
		int scelta=-1;
		Scanner in = new Scanner(System.in);
		
		do
		{
			System.out.println("1=inserisci prodotto,2=elimina prodotto,3=stampainformazioni,0=Esci");
			scelta= in.nextInt();
			switch(scelta)
			{
				case 1: inserisciprodotto(in,supermercato);
					break;
				case 2: eliminaprodotto(in,supermercato);
					break;
				case 3: stampa(supermercato);
					break;
			}
		}
			while(scelta!=0);
		
				
	
	}
		public  static void inserisciprodotto(Scanner in,Supermercato supermercato)
		{	int var=0;
			String nome;			
			System.out.println("inserisci nome prodotto");
			nome= in.next();
			
			if(var==0)
			{	
				System.out.println("inserisci tipologia prodotto");
				System.out.println("1=Salumeria, 2=Cancelleria");
					switch(in.nextInt())
					{
					case 1: scadenza(in,nome,supermercato);
						break;
					case 2: aggiungi(in,nome,supermercato);					
					break;					
					}
			}
				
		}
	
		public static  void scadenza(Scanner in,String nome,Supermercato supermercato)
		{		
				int giorno=0,mese=0,anno=0,prezzo=0;	
				GregorianCalendar calendario=new GregorianCalendar(anno,mese,giorno);
				if(supermercato.scorriArrayList(nome,supermercato.getProdottiSal(),1)!=1)
				{		
					System.out.println("prezzo");
					prezzo = in.nextInt();					
					System.out.println("inserisci giorno scadenza");
					giorno= in.nextInt();
					System.out.println("inserisci mese scadenza");
					mese= in.nextInt();
					System.out.println("inserisci anno scadenza");
					anno= in.nextInt();
					ProdottiSalumeria prodottoSal=new ProdottiSalumeria(nome,prezzo,calendario);
					supermercato.setProdottiSal(prodottoSal);					
				}									
							
		}	
		public static  void aggiungi(Scanner in,String nome,Supermercato supermercato)
		{		if(supermercato.scorriArrayList(nome,supermercato.getProdottiCanc(),1)!=1){
					System.out.println("prezzo");
					int prezzo = in.nextInt();
					ProdottiCancelleria prodottoCanc=new ProdottiCancelleria(nome,prezzo);
					supermercato.setProdottiCanc(prodottoCanc);	
				}			
			
			
		
		}		
		public  static void eliminaprodotto(Scanner in,Supermercato supermercato)
		{
			System.out.println("inserisci nome prodotto da eliminare");
			String nome= in.next();			
			supermercato.removeProd(nome,0);		
		}
		public static void stampa(Supermercato supermercato)
		{
			for(ProdottiCancelleria prodotto : supermercato.getProdottiCanc()) {
				System.out.println(prodotto.informazioni());
	        }
			for(ProdottiSalumeria prodotto : supermercato.getProdottiSal()) {
				System.out.println(prodotto.informazioni());
	        }
			
		}
}


