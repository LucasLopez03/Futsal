package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;

public class Equipo {

	private String nombre;
	private HashSet<Jugador> listaJugadores;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.listaJugadores = new HashSet<Jugador>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarJugador(Jugador nuevo) {
		if (listaJugadores.size()<5) {
			
			listaJugadores.add(nuevo);

			return true;
		}
				
			return false;
	}

	public HashSet<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(HashSet<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public Double calcularValorEquipo() {
	Double valorEquipo = 0.0;
		
		for (Jugador jugador : listaJugadores) {
			valorEquipo += jugador.getValor();
		}
		
		return valorEquipo;
	}

	public Double calcularEdadPromedioEquipo() {
	Double promedioEdad = 0.0;	
		
		for (Jugador jugador : listaJugadores) {
			promedioEdad += jugador.getEdad();
		}
		
		return promedioEdad / listaJugadores.size();
	}
	
	
	
}
