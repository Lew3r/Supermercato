
public  abstract class Prodotti {
	protected String nome;
	protected int codice;
	protected int lotti=1;
	public Prodotti(String nome)
	{
		this.nome=nome;
		codice=NextCode.codice();
	}
	public String getNome() {
		return nome;
	}
	public int getCodice() {
		return codice;
	}
	public int getLotti() {
		return lotti;
	}
	public void incrementa()
	{
		this.lotti++;
	}
	public int decrementa(int numero)
	{
		if(this.lotti-numero>=0)
		{
			this.lotti=this.lotti-numero;
			return 1;
		}
		
		else
		{
			System.out.println("Lotti non disponibili");
			return 0;
		}
	}
	public String informazioni(){
		return "il nome del prodotto è "+getNome()+" il suo codice è "+getCodice()+" ne sono rimasti "+getLotti() ;
	}



	
}

