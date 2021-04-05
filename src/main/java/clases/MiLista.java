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
		// Duelve el elemento en la posicion del contenedor. Coger metodo de MiniList que nos valgan como size() para saber el tamaño.
		return null;
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
			contador++;
			aux = aux.next;
		}
		
		return contador;
	}

	private class Container {
		Object obj = null;
		Container next = null;
		// lista.next.obj para el valor 0
		// Se necesita un bucle para los mayores.
		// Container temp = lista;
		// temp = temp.next; Para el bucle. Siempre que temp.next sea distinto de null, podria ser un while.
		public Container(Object obj, Container next) {
			this.obj = obj;
			this.next = next;
		}
		
	}
}
