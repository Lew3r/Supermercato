
public class NextCode {
	private static NextCode nextCode;
	private int code=0;
	
	private NextCode()
	{
		
	}
	public static NextCode creaistanza()
	{
		if(nextCode==null)
			nextCode=new NextCode();
		
		return nextCode;
	}
	public int returncodice()
	{
		this.code++;
		return this.code;
	}
	public static int codice()
	{
		 return	creaistanza().returncodice();
		 
	}
	
	
 

}
