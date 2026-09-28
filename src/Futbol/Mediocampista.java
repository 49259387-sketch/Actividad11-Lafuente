package Futbol;

public class Mediocampista extends Futbolista {
	
	private int pasesCompletados, asistencia;

	public Mediocampista(String apellido, String nombre, int edad, String dorsal, String club, int pasesCompletados,
			int asistencia) {
		super(apellido, nombre, edad, dorsal, club);
		this.pasesCompletados = pasesCompletados;
		this.asistencia = asistencia;
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}


	public int getAsistencia() {
		return asistencia;
	}


	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	} 
	
	@Override 
	public String getPuesto() {
		return "Medio campista";
	}
	
	@Override 
	public String jugarLaPelota() {
		return "Pasa la pelota";
		
	}

	@Override 

	public double calcularRendimiento() {
	    return (pasesCompletados + asistencia) / 2.0;
	}
	
	@Override 
	public String resumenPartido() {
	return "\nNombre del jugador: " + getNombre() + "\n Apellido : " + getApellido() + "\n del club :" + getClub()+ "\n con el dorsal: " + getDorsal() + "\n en el puesto de: " + getPuesto() + "\n Accion: " + jugarLaPelota() + "\n Pases completado: " + getPasesCompletados() + "\n Asistencias hechas: " + getAsistencia() +"\n Rendimiento del jugador: " + calcularRendimiento();
	}
}
