package model;

import java.util.ArrayList;

public class Palabra {
	private String infinitivo;
	private String seleccionado;
	private ArrayList<String> conjugados;
	private String imagen;

	public Palabra(String infinitivo) {
		this.infinitivo = infinitivo;
		this.conjugados = new ArrayList<String>();
		this.imagen = "";
		this.seleccionado = infinitivo;
	}

	public Palabra(String infinitivo, ArrayList<String> conjugados) {
		this.infinitivo = infinitivo;
		this.conjugados = conjugados;
		this.imagen = "";
		this.seleccionado = infinitivo;
	}

	public Palabra(String infinitivo, String imagen) {
		this.infinitivo = infinitivo;
		this.conjugados = new ArrayList<String>();
		this.imagen = imagen;
		this.seleccionado = infinitivo;
	}

	public Palabra(String infinitivo, ArrayList<String> conjugados, String imagen) {
		this.infinitivo = infinitivo;
		this.conjugados = conjugados;
		this.imagen = imagen;
		this.seleccionado = infinitivo;
	}

	public String getInfinitivo() {
		return infinitivo;
	}

	public void setInfinitivo(String infinitivo) {
		this.infinitivo = infinitivo;
	}

	public ArrayList<String> getConjugados() {
		return conjugados;
	}

	public void setConjugados(ArrayList<String> conjugados) {
		this.conjugados = conjugados;
	}

	public void agregarConjugado(String conjugado) {
		this.conjugados.add(conjugado);
	}

	public void quitarConjugado(String conjugado) {
		this.conjugados.remove(conjugado);
	}

	public void quitarConjugado(int index) {
		this.conjugados.remove(index);
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void quitarImagen() {
		this.imagen = "";
	}

	public String getSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(String seleccionado) {
		this.seleccionado = seleccionado;
	}
	
	

}
