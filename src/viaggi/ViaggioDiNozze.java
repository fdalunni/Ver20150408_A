package viaggi;


public class ViaggioDiNozze extends Pacchetto
	{
	
		private int divorzi;
		
		
		public int getDivorzi()
		{
				return  divorzi;
		}

		public void setDivorzi(int divorzi) {
			this.divorzi = divorzi;
			if(divorzi<=0)
			{
				throw new IllegalArgumentException("Il numero deve essere positivo");
			}
			
		}

		public ViaggioDiNozze(int divorzi) {
			super(ID, ID, divorzi, divorzi);
			this.divorzi = divorzi;
			
		}
		

	
}

