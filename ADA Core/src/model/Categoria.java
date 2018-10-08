package model;

import java.util.ArrayList;

public class Categoria {

	private String descripcion;
	private ArrayList<Palabra> palabras;

	public Categoria(String descripcion) {
		this.descripcion = descripcion;
		this.palabras = new ArrayList<Palabra>();
	}

	public Categoria(String descripcion, ArrayList<Palabra> palabras) {
		this.descripcion = descripcion;
		this.palabras = palabras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Palabra> getPalabras() {
		return palabras;
	}

	public void setPalabras(ArrayList<Palabra> palabras) {
		this.palabras = palabras;
	}

	public void agregarPalabra(Palabra palabra) {
		this.palabras.add(palabra);
	}

	public void quitarPalabra(Palabra palabra) {
		this.palabras.remove(palabra);
	}

	public void quitarPalabra(int index) {
		this.palabras.remove(index);
	}

}
