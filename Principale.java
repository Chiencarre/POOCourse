
public class Principale {

	public static void main(String[] args) {
		Salarie jean = new Salarie("Jean", 1200, 80);
		System.out.println(jean.chargeUtile());
		jean.poids(80);
		System.out.println(jean.chargeUtile());		
	}

}
