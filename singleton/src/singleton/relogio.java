package singleton;

import java.util.Calendar;

public class relogio {

	private static volatile relogio instancia;

	private relogio() {

	}

	public static synchronized relogio getInstancia() {
		if (instancia == null) {
			synchronized (relogio.class) {
				if (instancia == null) {
					instancia = new relogio();
				}
			}
		}
		return instancia;
	}

	public data getData() {
		return new data(Calendar.getInstance());
	}

	public hora getHorario() {
		return new hora(Calendar.getInstance());
	}

}
