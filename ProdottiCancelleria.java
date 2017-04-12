
public class ProdottiCancelleria extends Prodotti{
	private int prezzo;
	public ProdottiCancelleria(String nome,int prezzo)
	{
		super(nome);
		this.prezzo=prezzo;
	}
	public int getPrezzo() {
		return prezzo;
	}

	@Override
	public String informazioni()
	{
		return super.informazioni()+" Il prezzo unitario e' "+this.prezzo;
	}
}
	