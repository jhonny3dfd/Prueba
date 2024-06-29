public class Pasajero {

    private String id, nombre, nacionalidad, asiento;

    public Pasajero(String id, String nombre, String nacionalidad, String asiento) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.asiento = asiento;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    //@override
    public String ToString() {
        return "Id: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad + ", Asiento: " + asiento;
    }
}