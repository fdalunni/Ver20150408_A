package viaggi;

import java.util.Vector;


public class Pacchetto {

	private String ID;
	private String descrizione;
	private int postiTotali;
	private int postiDisponibili;
	
	
	public int getPostiDisponibili() 
	{
		return postiDisponibili;
	}

	public void setPostiDisponibili(int postiDisponibili) 
	{
		this.postiDisponibili = postiDisponibili;
		if(postiDisponibili>postiTotali)
		{
			throw new IllegalArgumentException("Non è possibile");
		}
	}

	public Pacchetto(String iD, String descrizione, int postiTotali, int postiDisponibili) 
	{
		super();
		ID = iD;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
	}

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
	
	public String getDescrizione() 
	{
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) 
	{
		this.descrizione = descrizione;
	}
	
	public int getPostiTotali() 
	{
		return postiTotali;
	}
	
	public void setPostiTotali(int postiTotali) 
	{
		this.postiTotali = postiTotali;
		if(postiTotali<=0)
		{
			throw new IllegalArgumentException("Il numero deve essere positivo");
		}
	}
	
	public addPrenotazione(Prenotazione p)
	{
		if(postiDisponibili==0)
		{
			System.out.println("Nessuna prenotazione disponibile");
		}
		else
		if (postiDisponibili>0)
		{
			System.out.println("Sono disponibili +postiTotali");
		}
		
	}
	
	public Vector getPrenotazioni()
	{
		 return prenotazioni;
	}
	
	public void setPrenotazioni()
	{
		this.prenotazioni=prenotazioni;
	}
	
	
	
}
