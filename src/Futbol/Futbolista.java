package Futbol;

public  abstract class Futbolista extends Persona {
	
	private String dorsal, club;

	public Futbolista(String apellido, String nombre, int edad, String dorsal, String club) {
		super(apellido, nombre, edad);
		this.dorsal = dorsal;
		this.club = club;
		// TODO Auto-generated constructor stub
	}

	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	  public abstract String getPuesto();
	
	  public abstract String jugarLaPelota();
	  
	  public abstract double calcularRendimiento();
	  
	  
	  public abstract String resumenPartido();
}
