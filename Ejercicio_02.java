//EjERCICIO 02
public class Televisor {
    private String marca;
    private int resolucion;
    private String tipo;

    public Televisor(String marca, int resol,String tip){
        this.marca=marca;
        this.resolucion=resol;
        this.tipo=tip;
    }
    public Televisor(){
        this.marca="";
        this.resolucion=0;
        this.tipo="";
    }
    @Override
    public String toString() {
        return String.format("Marca: %s, Resolución: %d, Tipo: %s",
                this.marca, this.resolucion, this.tipo);
    }
}
