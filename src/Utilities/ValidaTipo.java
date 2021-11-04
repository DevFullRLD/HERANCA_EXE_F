package Utilities;

import javax.swing.*;

public class ValidaTipo extends Poligono{
    private int numero = 0;
    public ValidaTipo(int numVertice, int perimetro) {
        super(numVertice, perimetro);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ValidaTipo(int numVertice, int perimetro, int numero) {
        super(numVertice, perimetro);
        this.numero = numero;
    }

    public void validaTipo(){
        if(numero == 3){
            JOptionPane.showMessageDialog(null,"Triângulo");
        }else if (numero == 4){
            JOptionPane.showMessageDialog(null,"Quadrilatero");
        }else if (numero == 5){
            JOptionPane.showMessageDialog(null,"Pentágono");
        }else if (numero == 6){
            JOptionPane.showMessageDialog(null,"Hexágono");
        }else if (numero == 7 ){
            JOptionPane.showMessageDialog(null,"Heptágono");
        }else if (numero == 8){
            JOptionPane.showMessageDialog(null,"Octagono");
        }else if (numero == 9){
            JOptionPane.showMessageDialog(null,"Eneágono");
        }else if (numero == 10){
            JOptionPane.showMessageDialog(null,"Decágono");
        }else if (numero == 11){
            JOptionPane.showMessageDialog(null,"Undecágono");
        }else if (numero == 12){
            JOptionPane.showMessageDialog(null,"Dodecágono");
        }else if (numero >=20 && numero <=29){
            JOptionPane.showMessageDialog(null,"Icoságono");
        }else if (numero >=30 && numero <= 39){
            JOptionPane.showMessageDialog(null,"Triacontágono");
        }else if (numero >=40 && numero <=49){
            JOptionPane.showMessageDialog(null,"Tetracontágono");
        }else if (numero >=50 && numero <=59){
            JOptionPane.showMessageDialog(null,"Pentacontágono");
        }else if (numero >=60 && numero <=69){
            JOptionPane.showMessageDialog(null,"Hexacontágono");
        }else if (numero >=70 && numero <=79){
            JOptionPane.showMessageDialog(null,"Heptacontágono");
        }else if (numero >=80 && numero <=89){
            JOptionPane.showMessageDialog(null,"Octacontágono");
        }else if (numero >=90 && numero<=99){
            JOptionPane.showMessageDialog(null,"Eneacontágono");
        }else if(numero == 100){
            JOptionPane.showMessageDialog(null,"Hectágono");
        }else{
            JOptionPane.showMessageDialog(null,"Opção Invalida!");
        }
    }
}
