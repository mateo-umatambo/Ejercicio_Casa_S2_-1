public class Videojuegos {
    // Atributos public
    private String nombre;
    private String genero;

    // Atributos con acceso por defecto
    private String version;
    private boolean activo;

    // Getters y Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }


    public void mostrarInformacion() {
        System.out.println("Videojuego: " + nombre + " Género: " + genero + " Versión: " + version + " Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
        System.out.println("El videojuego " + nombre + " se ha iniciado.");
    }

    void cerrar() {
        activo = false;
        System.out.println("El videojuego " + nombre + " se ha cerrado.");
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}

