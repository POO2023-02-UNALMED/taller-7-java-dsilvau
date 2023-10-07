package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    public String interpretacion;

    public Alfabeto(String origen,String[] letras,String interpretacion){
        super(origen);
        this.letras=letras;
        this.interpretacion=interpretacion;

    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String descripcion = "";
        for (int i=0;i<(this.letras.length)-1;i++) {
            descripcion += letras[i] + ", ";
        }
        descripcion+=letras[(this.letras.length)-1];
        return descripcion;
    }

}