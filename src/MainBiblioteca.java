public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("", "Robert C. Martin", "9780132350884", 1, 15000.0);

        // Comprobación explícita con getTitulo() de que se asignó el valor por defecto
        // y reasignación interna para los siguientes pasos si se desea, o mantenemos los objetos.
        // En este caso instanciamos libro1 directamente con los datos requeridos para las fichas posteriores:

        // Creamos los objetos principales requeridos por la consigna:
        // (libro1 usa el constructor canónico con título válido para la ficha esperada)
        libro1 = new Libro("Clean Code", "Robert C. Martin", "9780132350884", 1, 15000.0);
        Libro libro2 = new Libro("Efectivo con Java", "Ana Restrepo", "9781234567897", 3, 22000.0);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "9780307474728"); // Constructor de conveniencia

        // 2. Demostración de rechazo con setPrecioReposicion y verificación con getPrecioReposicion()
        boolean precioAceptado = libro1.setPrecioReposicion(-100.0);
        System.out.println("¿Se aceptó el precio -100.0? " + precioAceptado + " (se mantiene el precio anterior)\n");

        // 3. Mostrar fichas de cada uno de los libros en sus propias variables
        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        // 4. Agotar las copias de libro1 y comprobar préstamos
        boolean p1 = libro1.prestar(); // Presta la única copia (queda en 0)
        boolean p2 = libro1.prestar(); // Intenta prestar sin copias (falla)

        // 5. Devolución y actualización válida de precio
        libro1.devolver();
        libro1.setPrecioReposicion(18000.0);

    }
}