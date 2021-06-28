package pagos;

import funcional.Fecha;

public class Tarjeta extends Pago{
	
	
	private long Nrotjeta;
	private String tipo;
	private Fecha hastafecha;
	private Fecha desdefecha;
	private int codseguridad;
	
	public Tarjeta(double montoapagar, double montoigresado, double montovuelto, long nrotjeta, String tipo,Fecha hastafecha, Fecha desdefecha, int codseguridad) {
		super(montoapagar, montoigresado, montovuelto);
		Nrotjeta = nrotjeta;
		this.tipo = tipo;
		this.hastafecha = hastafecha;
		this.desdefecha = desdefecha;
		this.codseguridad = codseguridad;
	}
	
	
}
