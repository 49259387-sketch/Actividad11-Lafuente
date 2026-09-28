package Futbol;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		//Creando arquero
	    Arquero A1 = new Arquero("Rodriguez", "Gustavo", 20, "1", "Real Potosi", 5, 2);
	    Arquero A2 = new Arquero("Ramos", "Amadeo", 23, "69", "Coco Colo ", 10, 9);
	    
	  //Creando Defensa
	    Defensor D1 = new Defensor("Rodriguez", "Gustavo", 20, "4", "Real Potosi", 7, 1);
	    
	    //Creando MedioCampista
	    Mediocampista M1 = new Mediocampista("Van jij", "Bombasten", 23, "7", "Colon", 3, 6);
	    
	    //Creando Delantero 
	    Delantero DL1 = new Delantero("Cloaco", "Roman", 30, "9", "River", 2, 6);
	    
	    List<Futbolista> jugadores = new ArrayList<>();
	    jugadores.add(A1);
	    jugadores.add(A2);
	    jugadores.add(D1);
	    jugadores.add(M1);
	    jugadores.add(DL1);	
	    
	    for (Futbolista f : jugadores) {
	    	
	    	imprimirFutbolista(f); 
        }
        int arquero = 0;
        int defensa = 0;
        int mediocampista = 0;
        int delantero = 0;
        for (Futbolista f : jugadores) {
            if (f instanceof Arquero) {
                arquero++;
            } else if (f instanceof Defensor) {
                defensa++;
            } 
            else if (f instanceof Mediocampista) {
                mediocampista++;
            }
            else if (f instanceof Delantero) {
                delantero++;
            }
        }
        System.out.println("\nTotal de arqueros: " + arquero);
        System.err.println("---------  --------\n");
        System.out.println("Total de defensores: " + defensa);
        System.err.println("-----------------\n");
        System.out.println("Total de mediocampistas: " + mediocampista);
        System.err.println("-----------------\n");
        System.out.println("Total de delanteros: " + delantero);
    }

	
	
	
	
	  

	  public static void imprimirFutbolista(Futbolista f) {
	        System.out.println("-> " + f.resumenPartido());
	    }
	
	
}
