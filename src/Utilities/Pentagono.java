package Utilities;

import javax.swing.*;

public class Pentagono extends Poligono{
    private double resultadoFinal, apotema, semiPrimetro, sI = 0.0;
    private int lado= 20;
    private int resultLado, total = 0;
    //Variavel sI - Soma dos angulos internos
    private int pentagono = 5;

    public void PentagonoVazio(){

    }
    public Pentagono(int numVertice, int perimetro, double apotema, double semiPerimetro) {
        super(numVertice, perimetro);
        this.apotema = apotema;
        this.semiPrimetro = semiPerimetro;
    }

    public double getApotema() {
        return apotema;
    }

    public double getsI() {
        return sI;
    }

    public void setsI(double sI) {
        this.sI = sI;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getResultLado() {
        return resultLado;
    }

    public void setResultLado(int resultLado) {
        this.resultLado = resultLado;
    }

    public int getPentagono() {
        return pentagono;
    }

    public void setPentagono(int pentagono) {
        this.pentagono = pentagono;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getSemiPrimetro() {
        return semiPrimetro;
    }

    public void setSemiPrimetro(double semiPrimetro) {
        this.semiPrimetro = semiPrimetro;
    }

    public void calcularPentagono(){
        //Calculo de angulo
        sI = (pentagono-2)* 180;
        sI = sI / 5;
        //Calcular metade da vertice
        resultLado = lado/2;
        // saber o valor da apotema
        apotema = resultLado / 0.726;
        // calcular a area
        total = lado*pentagono;
        total = total /2;
        resultadoFinal = total * apotema;
        setPerimetro((int) resultadoFinal);
    }

    public void exibirPentagono(){
        JOptionPane.showMessageDialog(null, "O perimetro do Pentagono é: " + getPerimetro());
    }
}
