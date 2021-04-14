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

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getEfectivitat() {
		return efectivitat;
	}

	public void setEfectivitat(float efectivitat) {
		this.efectivitat = efectivitat;
	}

	public int getDurada() {
		return durada;
	}

	public void setDurada(int durada) {
		this.durada = durada;
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

	public static void main (String[]args) {
		
		Vacuna v1 = new Vacuna();
		
	}
	
}
