
public class Salarie {
	private String nom;
	private double poids; //en kg
	private double salaire; //en euro/heure
	private double chargeUtile;
	
	Salarie(String nom, double poids, double salaire){
		this.nom = nom;
		this.poids = poids;
		this.salaire = salaire;
		chargeUtile = poids / 8;
	}
	
	public double chargeUtile() {
		return chargeUtile;
	}
	
	private void actuChargeUtile() {
		chargeUtile = poids/8;
	}
	
	public void poids(double nouveauPoids) {
		poids = nouveauPoids;
		actuChargeUtile();
	}
	
	public double salaire() {
		return salaire;
	}
	
}
