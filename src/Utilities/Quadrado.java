package Utilities;

import javax.swing.*;

public class Quadrado extends Poligono {
    private int lado, lado2,  resultado = 0;

    public Quadrado(int numVertice, int perimetro, int lado, int lado2) {
        super(numVertice, perimetro);
        this.lado = lado;
        this.lado2 = lado2;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void calcularQuadrado(){
        resultado =lado*lado2;
        setPerimetro(resultado);
    }

    public void exibirQuadrado(){
        JOptionPane.showMessageDialog(null, "O perimetro do Quadrado é: " + getPerimetro());
    }
}
