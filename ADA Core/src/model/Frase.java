package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Frase {

	private ArrayList<Palabra> palabras;

	public Frase() {
		this.palabras = new ArrayList<Palabra>();
	}
		
	public ArrayList<Palabra> getPalabras() {
		return palabras;
	}

	public void agregarPalabras(Palabra palabra) {
		this.palabras.add(palabra);
	}
	
	public void quitarPalabra(Palabra palabra) {
		this.palabras.remove(palabra);
	}

	public void quitarPalabra(int index) {
		this.palabras.remove(index);
	}
	
	@Override
	public String toString() {
		String frase = "";
		Iterator<Palabra> it = this.palabras.iterator();
		while (it.hasNext()) {
			Palabra aux = it.next();
			frase += aux.getSeleccionado();
		}
		return frase;
	}

}
