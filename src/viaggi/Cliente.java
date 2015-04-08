package viaggi;


public class Cliente {
	
		private String nome;
		private String cognome;
		private String email;
		
		
		public String getNome()
		{
			return nome;
		}
		public void setNome(String nome) 
		{
			this.nome = nome;
			if(nome.length()<=0)
			{
				throw new IllegalArgumentException("Inserisci il nome dell'utente: ");
			}
		}
		public String getCognome()
		{
			return cognome;
		}
		
		public void setCognome(String cognome) {
			this.cognome = cognome;
			if(cognome.length()<=0)
			{
				throw new IllegalArgumentException("Inserisci il cognome dell'utente: ");
			}
		}
		
		public String getEmail() 
		{
			return email;
		}
		public void setEmail(String email) 
		{
			this.email = email;
			if(email.length()<=0)
			{
				throw new IllegalArgumentException("Inserisci l'email dell'utente: ");
			}
		}
		

}
