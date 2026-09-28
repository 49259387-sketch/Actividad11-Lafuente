package Futbol;

public class Defensor extends Futbolista {
	private int quites, despejes;

	public Defensor(String apellido, String nombre, int edad, String dorsal, String club, int quites, int despejes) {
		super(apellido, nombre, edad, dorsal, club);
		this.quites = quites;
		this.despejes = despejes;
	}
	
	public int getQuites() {
		return quites;
	}

	public void setQuites(int quites) {
		this.quites = quites;
	}

	public int getDespejes() {
		return despejes;
	}


	public void setDespejes(int despejes) {
		this.despejes = despejes;
	}





	@Override 
	public String getPuesto() {
		return "Defensor";
	}
	
	@Override 
	public String jugarLaPelota() {
		return "Defiende";
		
	}

	@Override 
	public double calcularRendimiento() {
	    return (quites + despejes) / 2.0;
	}
	
	@Override 
	public String resumenPartido() {
	return "\nNombre del jugador: " + getNombre() + "\n Apellido : " + getApellido() + "\n del club :" + getClub()+ "\n con el dorsal: " + getDorsal() + "\n en el puesto de: " + getPuesto() + "\n Accion: " + jugarLaPelota() + "\n Quites completado: " + getQuites() + "\n Despejes hechos: " + getDespejes() +"\n Rendimiento del jugador: " + calcularRendimiento();
	}
}
