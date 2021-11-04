package Utilities;

import javax.swing.*;

public class Retangulo extends Poligono{
    private int base, altura, resultado = 0;

    public Retangulo(int numVertice, int perimetro, int base, int altura) {
        super(numVertice, perimetro);
        this.altura = altura;
        this.base = base;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
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

    public void calculoRetangulo(){
        resultado = base*altura;
        setPerimetro(resultado);
    }

    public void exibirRetangulo(){
        JOptionPane.showMessageDialog(null, "O valor do perimetro do Retangulo é: " + getPerimetro());
    }
}
