package net.david.fernandez.oblogatorio.dda.server.motor_reglas;

public class ReglasFactory {

	public static Regla crear() {
		return null;

	}

	public static void main(String[] args) {

		Regla r = ReglasFactory.crear();
		OpcionesParaJugador opcionesParaJugador = new OpcionesParaJugador();
		Opcion h = Opcion.A;
		r.accion(opcionesParaJugador, h);

		if (h == Opcion.A) {

		}
	}

	enum Opcion {

		A(1), B(2), C(3);

		private int value;

		private Opcion(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

	}

}
