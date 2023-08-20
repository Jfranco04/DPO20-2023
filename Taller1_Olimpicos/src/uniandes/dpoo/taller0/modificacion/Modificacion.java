package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//Asignación #3 de la modificación 2 del taller
		System.out.println("Hola, mundo!");
		
		// Asignación #5 de la modificación 2 del taller, código que carga la información de los atletas y además imprime el país con más medallas. 
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
	}

}
