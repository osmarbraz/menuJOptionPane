
/**
 * Programa que utiliza JOptionPane para construir um menu de opções.
 */

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Variáveis do problema, que são preenchidas e manipuladas pelo menu.
        double base = 0;
        double altura = 0;
        double area = 0;

        //Armazena opção lida
        int opcao = -1;
        while (opcao != 99) {
            //Realiza a leitura da opção
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### Menu de Opções ###\n"                    
                    + " 1- Leitura dos dados\n"
                    + " 2- Impressão dos dados\n"
                    //Outras opções vão aqui
                    + " 3- Calcular área\n"
                    + "99- Sair\n"
                    + "Digite a opção desejada:"));
            //Verifica a opção
            switch (opcao) {
                case 1: {
                    base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo:"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "O triângulo tem base: " + base + " e altura:" + altura);
                    break;
                }
                case 3: {
                    area = (base * altura) / 2.0;
                    JOptionPane.showMessageDialog(null, "A área do triângulo: " + area);
                    break;
                }
                //Outras opções vão aqui

                //Opção de saída do programa
                case 99: {
                    System.out.println("Saindo do programa!");
                    break;
                }
                //Opção inválida do menu
                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }
        }
    }
}
