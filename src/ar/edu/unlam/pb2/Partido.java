package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;

public class Partido {
	

	private Equipo local;
	private Equipo visitante;
	private Gol nuevoGol;
	private Integer contadorGolesLocal;
	private Integer contadorGolesVisitante;
	private Integer contadorAmonestacionLocal;
	private Integer contadorAmonestacionVisitante;
	private ArrayList<Jugador> listaGoleador;
	private ArrayList<Double> listaMinutos;

	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
		this.contadorGolesLocal = 0;
		this.contadorGolesVisitante = 0;
		this.contadorAmonestacionLocal = 0;
		this.contadorAmonestacionVisitante = 0;
		this.listaGoleador = new ArrayList<Jugador>();
		this.listaMinutos = new ArrayList<Double>();
	}
	
	

//	public Gol getNuevoGol() {
//		return nuevoGol;
//	}
//
//	public void setNuevoGol(Gol nuevo) {
//		this.nuevoGol = nuevo;
//	}


	public ArrayList<Jugador> getListaGoleador() {
		return listaGoleador;
	}



	public void setListaGoleador(ArrayList<Jugador> listaGoleador) {
		this.listaGoleador = listaGoleador;
	}



	public ArrayList<Double> getListaMinutos() {
		return listaMinutos;
	}



	public void setListaMinutos(ArrayList<Double> listaMinutos) {
		this.listaMinutos = listaMinutos;
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
	
	public Integer getContadorGolesLocal() {
		return contadorGolesLocal;
	}

	public void setContadorGolesLocal(Integer contadorGolesLocal) {
		this.contadorGolesLocal = contadorGolesLocal;
	}

	public Integer getContadorGolesVisitante() {
		return contadorGolesVisitante;
	}

	public void setContadorGolesVisitante(Integer contadorGolesVisitante) {
		this.contadorGolesVisitante = contadorGolesVisitante;
	}

	public Boolean registrarUnGol(Jugador jugador, Double minuto) {

		if (local.getListaJugadores().contains(jugador)) {
			
			listaGoleador.add(jugador);
			listaMinutos.add(minuto);
			
			contadorGolesLocal++;
			
			return true;

		}else if (visitante.getListaJugadores().contains(jugador)){
			
			listaGoleador.add(jugador);
			listaMinutos.add(minuto);

			contadorGolesVisitante++;
			
			return true;
			
		}
		
		return false;
		
	}

	public Boolean amonestarAUnJugador(Jugador jugador, Double minuto) {
		
		
		if (local.getListaJugadores().contains(jugador)) {
			
			Amonestacion amonestacion = new Amonestacion (jugador, minuto);
			contadorAmonestacionLocal++;
			
			return true;

		}else if (visitante.getListaJugadores().contains(jugador)){
			
			Amonestacion amonestacion = new Amonestacion (jugador, minuto);
			contadorAmonestacionVisitante++;
			
			return true;

		}
		
		
		return null;
	}
	
}
