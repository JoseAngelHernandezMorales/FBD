public class Main {
    public static void main(String[] args) {
        // Lógica principal del programa
    }
}

class Hotel {
    private int id;
    private String nombre;
    // Otros atributos necesarios

    public Hotel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        // Inicializar otros atributos
    }

    // Métodos getters y setters para los atributos
    
    // Métodos para agregar, consultar, editar y eliminar información
}

class Huesped {
    private int id;
    private String nombre;
    // Otros atributos necesarios

    public Huesped(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        // Inicializar otros atributos
    }

    // Métodos getters y setters para los atributos
    
    // Métodos para agregar, consultar, editar y eliminar información
}

class Cuarto {
    private int id;
    private int numero;
    // Otros atributos necesarios

    public Cuarto(int id, int numero) {
        this.id = id;
        this.numero = numero;
        // Inicializar otros atributos
    }

    // Métodos getters y setters para los atributos
    
    // Métodos para agregar, consultar, editar y eliminar información
}

class CsvManager {
    private static final String FILENAME_HOTELES = "hoteles.csv";
    private static final String FILENAME_HUESPEDES = "huespedes.csv";
    private static final String FILENAME_CUARTOS = "cuartos.csv";

    // Métodos para escribir y leer archivos CSV
}