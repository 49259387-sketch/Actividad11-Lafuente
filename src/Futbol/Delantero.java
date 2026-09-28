package Futbol;

public class Delantero extends Futbolista {
	
	private int goles, remates;

	public Delantero(String apellido, String nombre, int edad, String dorsal, String club, int goles, int remates) {
		super(apellido, nombre, edad, dorsal, club);
		this.goles = goles;
		this.remates = remates;
	}

	public int getGoles() {
		return goles;
	}

	
	public void setGoles(int goles) {
		this.goles = goles;
	}


	public int getRemates() {
		return remates;
	}


	public void setRemates(int remates) {
		this.remates = remates;
	} 
	
	@Override 
	public String getPuesto() {
		return "Delantero";
	}
	
	@Override 
	public String jugarLaPelota() {
		return "Dispara al arco";
		
	}

	@Override 

	public double calcularRendimiento() {
	    if (remates == 0) {
	        return 0;
	    }

	    return Math.min(10, ((double) goles / remates) * 10);
	    
	    
	}
	
	@Override 
	public String resumenPartido() {
	return "\n Nombre del jugador: " + getNombre() + "\n Apellido : " + getApellido() + "\n del club :" + getClub()+ "\n con el dorsal: " + getDorsal() + "\n en el puesto de: " + getPuesto() + "\n Accion: " + jugarLaPelota() + "\n Remates completados: " + getRemates() + "\n Goles hechos: " + getGoles() +"\n Rendimiento del jugador: " + calcularRendimiento();
	}
	 	
}
