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

	@Override
	public String informazioni()
	{
		return super.informazioni()+" Il prezzo al kg e' "+this.prezzoalkg+" scade il "+this.scadenza.get(Calendar.DAY_OF_MONTH)+"/"+this.scadenza.get(Calendar.MONTH)+"/"+this.scadenza.get(Calendar.YEAR);
	}
	
}
