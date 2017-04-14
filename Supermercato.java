import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supermercato {
	private ArrayList<ProdottiSalumeria> prodottiSal;
	private ArrayList<ProdottiCancelleria> prodottiCanc;	

public Supermercato()
{
	this.prodottiSal = new ArrayList<ProdottiSalumeria>();
	this.prodottiCanc = new ArrayList<ProdottiCancelleria>();

}
public ArrayList<ProdottiSalumeria> getProdottiSal() {
	return prodottiSal;
}

public void setProdottiSal(ProdottiSalumeria prodottoSal) {
	this.prodottiSal.add(prodottoSal);
	System.out.println("Prodotto inserito");
	
}
public ArrayList<ProdottiCancelleria> getProdottiCanc() {
	return prodottiCanc;
}

public void setProdottiCanc(ProdottiCancelleria prodottoCanc) {
	this.prodottiCanc.add(prodottoCanc);
	System.out.println("Prodotto inserito");
}
public void aggiungiprodotto(String nomeProdotto,List prodotti,int operazione)
{	
	int var=0;
	if(var!=-1)
	{	
		var=scorriArrayList(nomeProdotto,prodottiSal,operazione); 
		if(var!=-1)
			scorriArrayList(nomeProdotto,prodottiCanc,operazione);
		if(var!=-1)
			System.out.println("prodotto non esistente");
	}  

}




public void removeProd(String nomeProdotto,int operazione)
{	int var=0;
		if(var!=-1)
		{	
			var=scorriArrayList(nomeProdotto,prodottiSal,operazione); 
			if(var!=-1)
				var=scorriArrayList(nomeProdotto,prodottiCanc,operazione);
			if(var!=-1)
				System.out.println("prodotto non esistente");
			
		}			  
}
public int scorriArrayList(String nomeProdotto,List prodotti,int operazione)
{	
	Scanner in = new Scanner(System.in);
	int trovato=-1;
	for(int i=0;i<prodotti.size()&&trovato==-1;i++)		  
	{
	  if(nomeProdotto.equalsIgnoreCase(((Prodotti) prodotti.get(i)).getNome()))
	  {
		  if(operazione==0)
		  {	
			  System.out.println("Prodotto trovato,sono disponibili "+((Prodotti) prodotti.get(i)).getLotti()+ " pezzi");
			  System.out.println("inserisci numero di pezzi da decrementare");
			  int numero = in.nextInt();
			  if(((Prodotti) prodotti.get(i)).decrementa(numero)==1)
			  {
				  switch(((Prodotti) prodotti.get(i)).getLotti())
				  {
				  case 0:	prodotti.remove(i);
					  		System.out.println("Prodotto Rimosso");
					  		trovato=i;
					  		break;
				  default:	System.out.println("Prodotto decrementato");
				  			trovato=i;
				  }			  
			  }
		  }
		  else
		  {		
			  ((Prodotti) prodotti.get(i)).incrementa();
			  trovato=i;
			  
		  }
	  }
	}
	  return trovato;
}	






}
