package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class TestFutsal {

	@Test
	public void queSePuedaCrearUnEquipo() {
		Equipo equipo = new Equipo("Racing Club");
		
		assertNotNull(equipo);
	}
	
	@Test
	public void queSePuedaCrearUnJugador() {
		Jugador jugador = new Jugador("Enzo", "Copetti", 250000.0, 25);
		
		assertNotNull(jugador);
	}
	
	@Test
	public void queSePuedaCrearUnPartido() {
		Equipo local = new Equipo("Racing Club");
		Equipo visitante = new Equipo("River Plate");
		
		Partido partido = new Partido(local, visitante);
		
		assertNotNull(partido);
	}
	
	@Test
	public void queSePuedaAgregarUnJugadorAUnEquipo() {
		Equipo equipo = new Equipo("Racing Club");
		Jugador jugador = new Jugador("Enzo", "Copetti", 250000.0, 25);
		
		Boolean valorObtenido = equipo.agregarJugador(jugador);
		
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queNoSePuedaAgregarMasDe5Jugadores() {
		Equipo equipo = new Equipo("Racing Club");

		Jugador jugador1 = new Jugador("Enzo", "Copetti", 250000.0, 25);
		Jugador jugador2 = new Jugador("Enzo", "Copetti", 250000.0, 25);
		Jugador jugador3 = new Jugador("Enzo", "Copetti", 250000.0, 25);
		Jugador jugador4 = new Jugador("Enzo", "Copetti", 250000.0, 25);
		Jugador jugador5 = new Jugador("Enzo", "Copetti", 250000.0, 25);
		Jugador jugador6 = new Jugador("Enzo", "Copetti", 250000.0, 25);
		
		equipo.agregarJugador(jugador1);
		equipo.agregarJugador(jugador2);
		equipo.agregarJugador(jugador3);
		equipo.agregarJugador(jugador4);
		equipo.agregarJugador(jugador5);
		Boolean valorObtenido = equipo.agregarJugador(jugador6);

		assertFalse(valorObtenido);
	}
	
	@Test
	public void queSePuedaCalcularElValorTotalDeUnEquipo() {
		Equipo equipo = new Equipo("Racing Club");
		
		Jugador copetti = new Jugador("Enzo", "Copetti", 250000.0, 25);
		Jugador moreno = new Jugador("Anibal", "Moreno", 250000.0, 25);
		Jugador chancalay = new Jugador("Tomas", "Chancalay", 250000.0, 25);
		Jugador miranda = new Jugador("Leonel", "Miranda", 250000.0, 25);
		Jugador mena = new Jugador("Eugenio", "Mena", 250000.0, 25);
		
		Double valorEsperado = 5 * 250000.0;
		
		equipo.agregarJugador(mena);
		equipo.agregarJugador(miranda);
		equipo.agregarJugador(chancalay);
		equipo.agregarJugador(moreno);
		equipo.agregarJugador(copetti);
		
		Double valorObtenido = equipo.calcularValorEquipo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaCalcularLaEdadPromedioDeUnEquipo() {
		Equipo equipo = new Equipo("Racing Club");
		
		Jugador copetti = new Jugador("Enzo", "Copetti", 250000.0, 25);
		Jugador moreno = new Jugador("Anibal", "Moreno", 250000.0, 28);
		Jugador chancalay = new Jugador("Tomas", "Chancalay", 250000.0, 20);
		Jugador miranda = new Jugador("Leonel", "Miranda", 250000.0, 25);
		Jugador mena = new Jugador("Eugenio", "Mena", 250000.0, 33);
		
		Double valorEsperado = 26.2;
		
		equipo.agregarJugador(mena);
		equipo.agregarJugador(miranda);
		equipo.agregarJugador(chancalay);
		equipo.agregarJugador(moreno);
		equipo.agregarJugador(copetti);
		
		Double valorObtenido = equipo.calcularEdadPromedioEquipo();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaHacerUnGolEnElPartido() {
		Equipo local = new Equipo("Racing Club");
		Equipo visitante = new Equipo("River Plate");
		Partido partido = new Partido(local, visitante);
		Jugador copetti = new Jugador("Enzo", "Copetti", 250000.0, 25);
		
		local.agregarJugador(copetti);
				
		Boolean valorEsperado = partido.registrarUnGol(copetti, 85.0);
		
		
		assertTrue(valorEsperado);
	}
	
	@Test
	public void queSePuedaSaberAQuienMetioUnGolYAQueMinuto() {
		Equipo local = new Equipo("Racing Club");
		Equipo visitante = new Equipo("River Plate");
		Partido partido = new Partido(local, visitante);
		Jugador copetti = new Jugador("Enzo", "Copetti", 250000.0, 25);
		Jugador mena = new Jugador("Eugenio", "Mena", 250000.0, 33);
		
		
		local.agregarJugador(copetti);
		local.agregarJugador(mena);
				
		partido.registrarUnGol(copetti, 85.0);
		partido.registrarUnGol(mena, 86.0);

		Integer valorEsperado = 0;
		Integer valorObtenido = partido.getListaGoleador().indexOf(copetti);
		
		Integer minutoEsperado = 0;
		Integer minutoObtenido = partido.getListaMinutos().indexOf(85.0);
		
		
		assertEquals(valorEsperado, valorObtenido);
		assertEquals(minutoEsperado, minutoObtenido);
		}
	
	@Test
	public void queSePuedaAmonestarEnUnPartido() {
		Equipo local = new Equipo("Racing Club");
		Equipo visitante = new Equipo("River Plate");
		Partido partido = new Partido(local, visitante);
		Jugador copetti = new Jugador("Enzo", "Copetti", 250000.0, 25);
		
		local.agregarJugador(copetti);
				
		Boolean valorEsperado = partido.amonestarAUnJugador(copetti, 85.0);
		
		
		assertTrue(valorEsperado);
	}

}
