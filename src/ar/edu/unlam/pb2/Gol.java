package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Gol {
	
	private Jugador jugador;
	private Double minuto;
	private Equipo local;
	private Equipo visitante;
	private ArrayList<Gol> goles;
	private ArrayList<Jugador> listaGoleador;
	
	public Gol (Jugador jugador, Double minuto) {
		this.jugador = jugador;
		this.minuto = minuto;
		this.goles = new ArrayList<Gol>();
		this.listaGoleador = new ArrayList<Jugador>();
		
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	public ArrayList<Gol> getGoles() {
		return goles;
	}

	public void setGoles(ArrayList<Gol> goles) {
		this.goles = goles;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Double getMinuto() {
		return minuto;
	}

	public void setMinuto(Double minuto) {
		this.minuto = minuto;
	}

	public Boolean agregarGol(Gol nuevo) {

		goles.add(nuevo);
		
		return false;
	}

}
