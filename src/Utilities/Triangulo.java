package Utilities;

import javax.swing.*;

public class Triangulo extends Poligono{
    private int base, altura, resultado = 0;

    public Triangulo(int numVertice, int perimetro, int base, int altura) {
        super(numVertice, perimetro);
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void calcularTriangulo(){
        resultado = (base * altura)/2;
        setPerimetro(resultado);
    }

    public void exibirTriangulo(){
        JOptionPane.showMessageDialog(null, "O Perimetro do Triangulo é: " + getPerimetro());
    }
}
