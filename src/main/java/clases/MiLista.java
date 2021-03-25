package clases;

public class MiLista implements MiniList {
	
	private Object obj = null;
	private Container lista = null;

	@Override
	public boolean add(Object a) throws NullPointerException {
//		if (a == null) {
//			throw new NullPointerException("No se admiten nulos");
//		}
//		obj = a;
		return true;
	}

	@Override
	public Object get(int posicion) {
		// Duelve la posicion del contenedor. Coger metodo de MiniList que nos valgan como size() para saber el tamaño.
		return null;
	}

	private class Container {
		Object obj = null;
		// Apunta al nuevo contenedor. Siempre null, cada vez que se hace add se crea un contenedor.
		// lista.next.obj para el valor 0
		// Se necesita un bucle para los mayores.
		// Container temp = lista;
		// temp = temp.next; Para el bucle. Siempre que temp.next sea distinto de null, podria ser un while.
		Container next = null;
	}
}
