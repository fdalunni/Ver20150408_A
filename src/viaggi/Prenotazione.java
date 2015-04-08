package viaggi;


public class Prenotazione extends Cliente
	{
		
	   private String ID;
	   private int posti;
	   private int cliente;
	   
	   
	public String getID() 
	{
		return ID;
	}
	public void setID(String iD) 
	{
		ID = iD;
		if(ID.length()<=0)
		{
			throw new IllegalArgumentException("Il numero deve essere positivo");
		}
	}
	
	public Prenotazione(String iD, int posti, int cliente) {
		super();
		ID = iD;
		this.posti = posti;
		this.cliente = cliente;
	}
	
	public int getPosti() 
	{
		return posti;
	}
	public void setPosti(int posti)
	{
		this.posti = posti;
		if(posti<=0)
		{
			throw new IllegalArgumentException("Il numero deve essere positivo");
		}
	}
	
	public int getCliente()
	{
		return cliente;
	}
	
	public void setCliente(int cliente)
	{
		this.cliente=cliente;
	}
	
	@Override
	public String toString()
	{
		return "Prenotazione [ID=" + ID + ", posti=" + posti + "]";
	}
	
	
}
