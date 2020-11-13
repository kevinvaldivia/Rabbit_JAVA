package juego;

import java.awt.Color;

import entorno.Entorno;

public class Conejo {
	//variables del conejo
		private double x;
		private double y;
		private double alto;
		private double ancho;
		private Color color;
		private double velocidad;
		private double direccion;
		
		//constructor del conejo
		public Conejo(double x, double y,double alto, double ancho, Color color, double velocidad, double direccion) {
			this.x = x;
			this.y = y;
			this.alto=alto;
			this.ancho=ancho;
			this.color = Color.GREEN;
			this.velocidad = velocidad;
			this.direccion=direccion;
		}
		//Metodo dibujar del conejo
		public void dibujar(Entorno entorno) {
			entorno.dibujarRectangulo(x, y, alto, ancho, 0, color);
		}
		
		//Metodo para que el conejo se mueva arriba apretando una tecla
		public void moverArriba() {
			x += velocidad * Math.cos(direccion);
			y -= velocidad * Math.sin(direccion);
			
			
		}
		//Metodo para que el conejo se vaya para abajo constantemente REQUISITO DE TP
		public void moverA() {
			//x += Math.cos(direccion);
			//y +=Math.sin(direccion);
			x++;
		}
		//Metodo para que el conejo se mueva hacia abajo apretando una tecla
		public void moverAbajo() {
			x -= velocidad * Math.cos(direccion);
			y += velocidad * Math.sin(direccion);
			
		}
		//Metodo para que el conejo se mueva a la derecha apretando una tecla
		public void moverDerecha() {
			x +=velocidad;
		}
		//Metodo para que el conejo se mueva a la izquierda apretando una tecla
		public void moverIzquierda() {
			x -=velocidad;
		}
		//Metodo cuando el conejo llegue a la meta
		//falta metodo para cuando el conejo llegue a la meta
		
		//Metodo para cuando el conejo se vaya para los laterales aparezca en el punto de partida
		public void puntoPartida() {
			x=400;
			y=550;
		}
		//Metodo para el conejo choca a en los laterales
		public boolean chocasteConEntorno(Entorno entorno) {
			return x < 0 || x > entorno.ancho();
		}
	}


