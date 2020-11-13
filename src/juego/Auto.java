package juego;

	import java.awt.Color;

	import entorno.Entorno;

	public class Auto {
		//variables del auto
		private double x;
		private double y;
		private double alto;
		private double ancho;
		private Color color;
		private double velocidad;
		private double direccion;
		
		
		//constructor del auto
		public Auto(double x, double y, double alto, double ancho, Color color, double velocidad, double direccion) {
			this.x = x;
			this.y = y;
			this.alto = alto;
			this.ancho = ancho;
			this.color = color;
			this.velocidad = velocidad;
			this.direccion = direccion;
		}
 
		//metodo para que se dibuje el auto
		public void dibujar(Entorno entorno) {
			entorno.dibujarRectangulo(x, y, direccion, alto, ancho, color);
		}
		
		//metodo para que se mueva a la derecha
		public void moverDer() {
			x+=velocidad;
		}
		//metodo para cuando el auto supere a la derecha
		public boolean superaDer(Entorno entorno) {
			return x<0 ||x>entorno.ancho();
		}
		//punto de partida de auto
		public void puntoDePartidaAuto() {
			x=-1;
			y=100;
		}

}
