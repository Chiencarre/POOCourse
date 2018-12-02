
public class Course {
	private double poidsRepas; //en kg
	private double distanceAR; //en km
	private Salarie transporteur;
	private Vehicule moyenTransport;
	private double chargeUtile; //en kg
	
	
	Course(double poidsRepas, double distanceAR, Salarie transporteur, Vehicule moyenTransport){
		this.poidsRepas = poidsRepas;
		this.distanceAR = distanceAR;
		this.transporteur = transporteur;
		this.moyenTransport = moyenTransport;
		chargeUtile = max(moyenTransport.chargeUtile, transporteur.chargeUtile());
	}
	
	public double tempsTransport() {
		return moyenTransport.vitesseMoyenne * distanceAR;
	}
	
	public double quantiteCO2() {
		return moyenTransport.emissionCO2 * distanceAR;
	}
	
	public double prixSalarie() {
		return tempsTransport()*transporteur.salaire();
	}
	
	public double prixCourse() {
		return prixSalarie() + (moyenTransport.coutUtil()/distanceAR);
	}
	
	public boolean estPossible() {
		return (this.chargeUtile>=this.poidsRepas) 
				&& (tempsTransport())<=1);
	}
	
}
