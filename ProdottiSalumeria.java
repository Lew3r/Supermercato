import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class ProdottiSalumeria  extends Prodotti{
	private int prezzoalkg;
	private GregorianCalendar scadenza;
	public ProdottiSalumeria(String nome,int prezzo,GregorianCalendar scadenza)
	{
		super(nome);
		this.prezzoalkg=prezzo;
		this.scadenza=scadenza;
		
	}
	
	public int getPrezzoalkg() {
		return prezzoalkg;
	}

	public GregorianCalendar getScadenza() {
		return scadenza;
	}
	@Override
	public String informazioni()
	{
		return super.informazioni()+" Il prezzo al kg e' "+this.prezzoalkg+" scade il "+ returnDate();
	}
	public String returnDate()
	{ 	
		return this.scadenza.get(Calendar.DAY_OF_MONTH)+"/"+(this.scadenza.get(Calendar.MONTH)+1)+"/"+this.scadenza.get(Calendar.YEAR);
	}
	
	
}
