package Futbol;

public class Arquero extends Futbolista{
	private int atajadas, golesRecibidos;

	public Arquero(String apellido, String nombre, int edad, String dorsal, String club, int atajadas, int golesRecibidos) {
		super(apellido, nombre, edad, dorsal, club);
		this.atajadas = atajadas;
		this.golesRecibidos = golesRecibidos;
	}

	public int getAtajadas() {
		return atajadas;
	}

	public void setAtajadas(int atajadas) {
		this.atajadas = atajadas;
	}

	public int getGoles() {
		return golesRecibidos;   
	}

	public void setGoles(int goles) {
		this.golesRecibidos = golesRecibidos;
	}
	
	@Override 
	public String getPuesto() {
		return "Arquero";
	}
	
	@Override 
	public String jugarLaPelota() {
		return "Ataja";
		
	}
	
	@Override
	public double calcularRendimiento() {
	    if (golesRecibidos == 0) {
	        return 10.0;
	    }

	    return Math.min(10.0, 10 / ((double) atajadas * golesRecibidos) * 10);
	}
	
	@Override 
	public String resumenPartido() {
	return "\n Nombre del jugador: " + getNombre() + "\n Apellido : " + getApellido() + "\n del club :" + getClub()+ "\n con el dorsal: " + getDorsal() + "\n en el puesto de: " + getPuesto() + "\n Accion: " + jugarLaPelota() + "\n Atajadas hechas: " + getAtajadas() + "\n Goles recibidos: " + getGoles() +"\n Rendimiento del jugador: " + calcularRendimiento();
	}
	
	
}
