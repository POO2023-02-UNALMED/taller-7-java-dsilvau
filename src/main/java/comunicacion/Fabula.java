package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    public String interpretacion;

    public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza,String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza=ensenanza;
        this.interpretacion=interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return super.getPaginas() * palabrasPagina * 1;
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String datos =
                super.getOrigen() +"\n" + super.getTitulo() +"\n" + super.getAutor()+"\n" +
                        Integer.toString(super.getPaginas()) +"\n" +this.ensenanza;
        return datos;
    }
}