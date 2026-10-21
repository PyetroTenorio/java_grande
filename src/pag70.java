
import javax.swing.*; // importação
import java.awt.*;
import java.awt.event.*;

// Cria a classe Soma, que herda de JFrame
public class pag70 extends JFrame {

    // Declara os rótulos da janela
    JLabel rotulo1, rotulo2, exibir;

    // Declara as caixas de texto
    JTextField texto1, texto2;

    // Declara o botão Somar
    JButton somar;

    // Construtor da classe
    public pag70() {

        // título da janela
        super("Exemplo de soma");

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

        // Cria um rótulo para mostrar o resultado
        exibir = new JLabel("");

        // Cria o botão Somar
        somar = new JButton("Somar");

        // Define a posição e o tamanho dos componentes
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);

        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);

        exibir.setBounds(50, 120, 200, 20);
        somar.setBounds(150, 100, 80, 20);

        // Executa uma ação ao clicar no botão Somar
        somar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // Declara as variáveis dos números e da soma
                        int numero1, numero2, soma;

                        // Inicializa a variável soma
                        soma = 0;

                        // Pega o primeiro número digitado
                        numero1 = Integer.parseInt(texto1.getText());

                        // Pega o segundo número digitado
                        numero2 = Integer.parseInt(texto2.getText());

                        // Soma os dois números
                        soma = numero1 + numero2;

                        // Torna o rótulo do resultado visível
                        exibir.setVisible(true);

                        // Mostra o resultado da soma
                        exibir.setText("A soma é: " + soma);
                    }
                }
        );

        // Esconde o resultado até clicar no botão
        exibir.setVisible(false);

        // Adiciona os rótulos à janela
        tela.add(rotulo1);
        tela.add(rotulo2);

        // Adiciona as caixas de texto à janela
        tela.add(texto1);
        tela.add(texto2);

        // Adiciona o resultado e o botão à janela
        tela.add(exibir);
        tela.add(somar);

        // Define o tamanho da janela
        setSize(400, 250);

        // Torna a janela visível
        setVisible(true);
    }

    // Método principal
    public static void main(String args[]) {

        // Cria um objeto da classe Soma
        pag70 app = new pag70();

        // Fecha o programa ao fechar a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
