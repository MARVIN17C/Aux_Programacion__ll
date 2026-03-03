//Ejercicio 01
public class Anime {
    public String nombre;
    public String genero;
    private int nroEpisodios;
    private String[] episodios;
    public Anime(String nom, String gen, int numeroep){
        this.nombre=nom;
        this.genero=gen;
        this.nroEpisodios=numeroep;
    }
    public String toString(){
        return String.format("Nombre: %s, Genero: %s, NroEpisodios: %d"
        , this.nombre, this.genero, this.nroEpisodios);
    }
}
