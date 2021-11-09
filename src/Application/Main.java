package Application;

import Utilities.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Validar opção desejada
        int opera = Integer.parseInt(JOptionPane.showInputDialog(null," Digite a opção desejada:" + "\n"+
                "1 - Calcular algumas formas" + "\n"+
                "2 - Validar o tipo com base no valor digitado"));

        switch (opera){
            case 1:{
                //validar qual operação deseja calcular
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja calcular:" + "\n"+
                        "1- Triangulo" + "\n"+
                        "2- Retangulo" + "\n"+
                        "3- Pentagono - Regular de 5 lados (20cm) " + "\n"+
                        "4- Quadrado"));
                switch (op){
                    case 1:{
                        //ENTRADA DE DADOS
                        int base   = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
                        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
                        int perimetro = 0;
                        int vertice = 0;
                        Triangulo triangulo = new Triangulo(vertice, perimetro, base, altura);

                        //INSERIR DADOS
                        triangulo.setBase(base);
                        triangulo.setAltura(altura);
                        triangulo.calcularTriangulo();

                        //EXIBIR DADOS
                        triangulo.exibirTriangulo();
                        break;
                    }
                    case 2:{
                        //ENTRADA DE DADOS
                        int base   = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
                        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
                        int perimetro = 0;
                        int vertice = 0;
                        Retangulo ret = new Retangulo(vertice, perimetro, base, altura);

                        //INSERIR DADOS
                        ret.setBase(base);
                        ret.setAltura(altura);
                        ret.calculoRetangulo();

                        //EXIBIR DADOS
                        ret.exibirRetangulo();
                        break;
                    }
                    case 3:{
                        int apotema = 0;
                        int semiPerimetro = 0;
                        int perimetro = 0;
                        int vertice = 0;
                        Pentagono pentagono = new Pentagono(vertice, perimetro, apotema, semiPerimetro);

                        //INSERIR DADOS
                        pentagono.setNumVertice(vertice);
                        pentagono.setPerimetro(perimetro);
                        pentagono.setApotema(apotema);
                        pentagono.setSemiPrimetro(semiPerimetro);

                        //EXIBIR DADOS
                        pentagono.calcularPentagono();
                        pentagono.exibirPentagono();
                        break;
                    }
                    case 4:{
                        //ENTRADA DE DADOS
                        int lado1   = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro lado"));
                        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da segundo lado"));
                        int perimetro = 0;
                        int resultado = 0;
                        int vertice = 0;
                        Quadrado quad = new Quadrado(vertice, perimetro, lado1, lado2);

                        //INSERIR DADOS
                        quad.setLado(lado1);
                        quad.setLado2(lado2);
                        quad.calcularQuadrado();

                        //EXIBIR DADOS
                        quad.exibirQuadrado();
                        break;
                    }
                    default:{
                        JOptionPane.showMessageDialog(null,"Não consta nenhum tipo com este valor");
                    }
                }
                break;
            }
            case 2:{
                //INSERIR DADOS
                int perimetro = 0;
                int vertice = 0;
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de lados"));
                ValidaTipo validaT = new ValidaTipo(vertice, perimetro, numero);

                //ATRIBUINDO DADOS
                validaT.setNumero(numero);

                
                //EXIBIR DADOS
                validaT.validaTipo();
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null,"Não consta nenhum tipo com este valor");
            }
        }
    }
}
