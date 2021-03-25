package clases;

public class MiLista implements MiniList {
	
	private Object obj = null;
	private Container lista = null;

	@Override
	public boolean add(Object a) throws NullPointerException {
		
		if (a == null) {
			throw new NullPointerException("No se admiten nulos");
		} else {
			// Apunta al nuevo contenedor. Siempre null, cada vez que se hace add se crea un contenedor.
			Container contenedor = new Container(a, null);
		}

		return true;
	}

	@Override
	public Object get(int posicion) {
		// Duelve el elemento en la posicion del contenedor. Coger metodo de MiniList que nos valgan como size() para saber el tamaño.
		return null;
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
		public Object getObj() {
			return obj;
		}
		public void setObj(Object obj) {
			this.obj = obj;
		}
		public Container getNext() {
			return next;
		}
		public void setNext(Container next) {
			this.next = next;
		}
		
	}
}
