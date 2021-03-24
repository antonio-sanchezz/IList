package clases;

/**
 * 
 * @author Antonio Sanchez
 *
 */
public interface MiniList {

	/**
	 * El metodo introduce un elemento al final de la lista.
	 * @param elemento - Objeto que queremos añadir.
	 * @return true si ha sido introducido y false en caso de que no.
	 * @throws NullPointerException en caso de intentar insertar un valor nulo.
	 */
	public boolean add(Object elemento) throws NullPointerException;
	
	/**
	 * Metodo que comprueba la existencia de un elemento en la lista.
	 * @param elemento - Objeto que queremos buscar.
	 * @return true si se encuentra en la lista y false en caso de que no.
	 */
	public boolean contains(Object elemento);
	
	/**
	 * Elimina el primer elemento que encuentre en la lista que sea igual 
	 * al elemento que se pasa como parámetro.
	 * @param elemento - Objeto que queremos eliminar.
	 * @return true si se ha borrado y false en caso de que no.
	 */
	public boolean delete(Object elemento);
	
	/**
	 * Elimina el elemento que ocupe la posición que se indica como parámetro.
	 * @param posicion - Posicion del objeto que se quiere eliminar en la lista.
	 * @return true si se ha borrado y false en caso de que no.
	 */
	public boolean deletePosition(int posicion);
	
	/**
	 * Cambia el elemento que está en la posición que se pasa como parametro.
	 * @param posicion - Posicion del elemento que se quiere cambiar.
	 * @param elemento - Elemento que queremos introducir.
	 * @return true si ha cambiado y false en caso de que no.
	 */
	public boolean set(int posicion, Object elemento);
	
	/**
	 * Devuelve el elemento de la posición que se pasa como parámetro.
	 * @return
	 */
	public Object get();
	
	/**
	 * Indica el numero de elementos que tiene la lista.
	 * @return numero de elementos que tiene la lista.
	 */
	public int size();
	
	/**
	 * Pone la lista a 0 elementos.
	 */
	public void clear();
}
