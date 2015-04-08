package viaggi;


public class Avventura extends Pacchetto
	{

	private int dispersi;

	public int getDispersi() 
	{
		return dispersi;
	}

	public void setDispersi(int dispersi)
	{
		this.dispersi = dispersi;
		if(dispersi<=0)
		{
			throw new IllegalArgumentException("Il numero deve essere positivo");
		}
	}

	public Avventura(int dispersi)
	{
		super();
		this.dispersi = dispersi;
	}  
	
}
