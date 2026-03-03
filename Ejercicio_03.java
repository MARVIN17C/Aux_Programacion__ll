//EJERCICIO 03
public class Instrumento {
    public String nombre;
    private String materia;
    private String tipo;

    public Instrumento(String nombre, String materia, String tipo) {
        this.nombre = nombre;
        this.materia = materia;
        this.tipo=tipo;
    }
    @Override
    public String toString(){
        return String.format("Nombre: %s, Materia: %s, Tipo: %s",
                this.nombre,this.materia,this.tipo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
