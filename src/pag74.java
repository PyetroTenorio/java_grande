
import javax.swing.*; // importação
import java.awt.*;
import java.awt.event.*;

// Cria a classe Limpar, que herda de JFrame
public class pag74 extends JFrame {

    // Declara os rótulos da janela
    JLabel rotulo1, rotulo2;

    // Declara as caixas de texto
    JTextField texto1, texto2;

    // Declara o botão Limpar
    JButton limpar;

    // Construtor da classe
    public pag74() {

        // título da janela
        super("Exemplo Limpar");

        // painel de conteúdo da janela
        Container tela = getContentPane();

        // Permite posicionar os componentes manualmente
        setLayout(null);

        // Cria os rótulos dos números
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");

        // Cria as caixas para digitar os números
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);

        // Cria o botão Limpar
        limpar = new JButton("Limpar");

        // Define a posição e o tamanho dos rótulos
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);

        // Define a posição e o tamanho das caixas de texto
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);

        // Define a posição e o tamanho do botão Limpar
        limpar.setBounds(150, 100, 80, 20);

        // Executa uma ação ao clicar no botão Limpar
        limpar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // Apaga o conteúdo da primeira caixa
                        texto1.setText(null);

                        // Apaga o conteúdo da segunda caixa
                        texto2.setText(null);

                        // Coloca o cursor na primeira caixa de texto
                        texto1.requestFocus();
                    }
                }
        );

        // Adiciona os rótulos à janela
        tela.add(rotulo1);
        tela.add(rotulo2);

        // Adiciona as caixas de texto à janela
        tela.add(texto1);
        tela.add(texto2);

        // Adiciona o botão Limpar à janela
        tela.add(limpar);

        // Define o tamanho da janela
        setSize(400, 250);

        // Torna a janela visível
        setVisible(true);
    }

    // Método principal
    public static void main(String args[]) {

        // Cria um objeto da classe Limpar
        pag74 app = new pag74();

        // Fecha o programa ao fechar a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
