package Utilities;

public class Poligono {
    private int numVertice, perimetro = 0;

    public Poligono(int numVertice, int perimetro) {
        this.numVertice = numVertice;
        this.perimetro = perimetro;
    }

    public int getNumVertice() {
        return numVertice;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

}
