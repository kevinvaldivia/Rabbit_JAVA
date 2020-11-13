package juego;

import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {

	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Conejo conejo;
	private Auto auto;
	
	
	public Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Prueba del Entorno", 800, 600);
		
		// Inicializar lo que haga falta para el juego
		
		// Inicializa el objeto CONEJO
		conejo= new Conejo(400, 550, 50, 50, Color.GREEN, 12, Math.PI/2);
		
		// Inicializa el objeto AUTO
		auto= new Auto(-1, 100, 50, 0, Color.BLUE, 2, 25);
		
		
		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick() {
		// Procesamiento de un instante de tiempo
		// ...
		conejo.dibujar(entorno);
		auto.dibujar(entorno);
		auto.moverDer();

		//auto.moverIzq();
		//conejo.moverA();
	//auto llega a la derecha
	if (auto.superaDer(entorno)) {
		auto.puntoDePartidaAuto();
	}
		//el conejo se mueva cuando se presiona una tecla W
	if (entorno.sePresiono('w')) {
			conejo.moverArriba();
		}
		//el conejo se mueva para abajo cuando se presiona la tecla S
	if (entorno.sePresiono('s')) {
			conejo.moverAbajo();
	}
		//el conejo se mueva para el lado derecho
	if(entorno.sePresiono('d')) {
		conejo.moverDerecha();
	}
		//el conejo se mueva para el lado izquierdo
	if (entorno.sePresiono('a')) {
		conejo.moverIzquierda();
	}
		//el conejo se va para los costados que aparezca en el punto de partida
	if (conejo.chocasteConEntorno(entorno)) {
		conejo.puntoPartida();
	}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}

}

