package vacuna;

public class Covid19 extends Vacuna {

	
	private String efectesSecundaris;
	
	
	// constructor parametritzat
	Covid19(String elefctesSecundaris) {
			this.efectesSecundaris = efectesSecundaris;
		}

		// constructor vuit
		Covid19() 
		{
			   this.efectesSecundaris  = "";
			    
		 }

		//El constructor copiador
		Covid19 (Covid19 c){
			this.efectesSecundaris  = c.efectesSecundaris;
			
		}
		
		//equals
		public boolean equals(Covid19 c) {
			boolean igual = false;
			if(this.efectesSecundaris.equals(c.efectesSecundaris)){
				igual = true;
			}
			return igual;
		}
		
		//toString
		@Override
		public String toString() {
			return "EfectesSecundaris:"+this.efectesSecundaris;
		}

	
}
