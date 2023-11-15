package pruba2;

public class libroDAO {
	public void insertarLibros(Libro libro, int cantidad) {
		//codigo insertar libros
		System.out.println("Se ha insertado + " + cantidad + "libros del libro: "+ libro.getTitulo());
	}
	public void borrarLibro(Libro libro) {
		//coidgo para borrar libro
		System.out.println("Se ha borrado el libro de la base de datos");
	}
}
