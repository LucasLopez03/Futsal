package ar.edu.unlam.pb2;

public class Amonestacion {
	
	private Jugador jugador;
	private Double minuto;

	public Amonestacion(Jugador jugador , Double minuto) {
		this.jugador = jugador;
		this.minuto = minuto;
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

}
