package clases;

public class MiLista implements MiniList {

	private Container lista = null;

	@Override
	public boolean add(Object a) throws NullPointerException {

		if (a == null) {
			throw new NullPointerException("No se admiten nulos");
		} else {
			if (lista == null) {
				lista = new Container(a, lista);
			} else {
				Container aux = lista;
				while (aux.next != null) {
					aux = aux.next;
				}
				aux.next = new Container(a, null);
			}
		}

		return true;
	}

	@Override
	public Object get(int posicion) {
		// Duelve el elemento en la posicion del contenedor. Coger metodo de MiniList
		// que nos valgan como size() para saber el tamaño.
		Container aux = lista;
		Object elemento = null;
		int contador = -1;

		while (aux.next != null && elemento == null) {
			contador++;
			if (posicion == contador) {
				elemento = aux.obj;
			}
			aux = aux.next;
		}

		return elemento;
	}

	@Override
	public void imprimir() {

		Container aux = lista;

		while (aux != null) {
			System.out.println(aux.obj.toString());
			aux = aux.next;
		}

	}

	@Override
	public void clear() {
		lista = null;
	}

	@Override
	public int size() {
		Container aux = lista;
		int contador = 0;

		while (aux != null) {
			aux = aux.next;
			contador++;
		}

		return contador;
	}

	@Override
	public boolean contains(Object elemento) {

		Container aux = lista;
		boolean validador = false;

		while (aux.next != null && elemento != aux.obj) {
			aux = aux.next;
		}

		if (elemento == aux.obj) {
			validador = true;
		}

		return validador;
	}

	@Override
	public boolean delete(Object elemento) {

		Container aux = lista;
		Container before = lista;
		boolean validador = false;

		while (aux.next != null && elemento != aux.obj) {
			before = aux;
			aux = aux.next;
		}

		if (elemento == aux.obj) {
			before.next = aux.next;
			validador = true;
		}

		return validador;
	}

	@Override
	public boolean delete(int posicion) {

		Container aux = lista;
		Container before = lista;
		int contador = 0;
		boolean validador = false;

		while (aux != null && posicion != contador) {
			before = aux;
			aux = aux.next;
			contador++;
		}

		if (posicion == contador) {
			before.next = aux.next;
			validador = true;
		}

		return validador;
	}

	@Override
	public boolean set(int posicion, Object elemento) {

		Container aux = lista;
		int contador = 0;
		boolean validador = false;

		while (aux.next != null && posicion != contador) {
			aux = aux.next;
			contador++;
		}

		if (contador == posicion) {
			aux.obj = elemento;
			validador = true;
		}

		return validador;
	}

	private class Container {

		private Object obj = null;
		private Container next = null;

		public Container(Object obj, Container next) {
			this.obj = obj;
			this.next = next;
		}

	}
}
