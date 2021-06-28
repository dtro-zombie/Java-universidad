package funcional;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	Fecha() {
		this.dia = 0;
		this.mes = 0;
		this.anio = 0;

	}

	public void mostrar() {
		System.out.println("dia: " + this.dia + "mes: " + this.mes + "a�o: " + this.anio);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean controlarfecha()

	{

		boolean validoFecha = false;

		if (dia < 1 && dia > 31) {
			validoFecha = true;
		}
		else
		{
			return false;
		}

		if (mes < 1 && mes > 12) {
			validoFecha = true;
		}
		else
		{
			return false;
		}

		if (mes == 2 && dia == 29 && anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
			validoFecha = true;
		}
		else
		{
			return false;
		}
		return validoFecha;
	}

}
