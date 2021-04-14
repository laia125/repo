package vacuna;

public class Vacuna {

	private String nom;
	private float efectivitat;
	private int durada;

	// constructor parametritzat
	Vacuna(String nom, float e, int d) {
		this.nom = nom;
		efectivitat = e;
		durada = d;
	}

	// constructor vuit
	Vacuna(){
		     this.nom = "";
		     this.efectivitat = 0;
		     this.durada = 0;
		 }

	//El constructor copiador
	Vacuna(Vacuna v){
		this.nom = v.nom;
		this.efectivitat = v.efectivitat;
		this.durada = v.durada;
	}
	
	//equals
	@Override
		public boolean equals(Vacuna v) {
		boolean igual = false;
		if(this.nom.equals(v.nom) && 
				this.efectivitat == v.efectivitat &&
				this.durada == v.durada) {
			igual = true;
		}
		return igual;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Vacuna [nom=" + nom + ", efectivitat=" + efectivitat + ", durada=" + durada + "]";
	}

	
	
}
