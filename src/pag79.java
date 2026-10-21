
import javax.swing.*; // importação
import java.awt.*;
import java.awt.event.*;

// Cria a classe DesabilitarHabilitar, que herda de JFrame
public class pag79 extends JFrame {

    // Declara os rótulos da janela
    JLabel rotulo1, rotulo2;

    // Declara os botões
    JButton desabilitar, habilitar;

    // Construtor da classe
    public pag79() {

        // título da janela
        super("Exemplo de Desabilitar e Habilitar componentes");

        // painel de conteúdo da janela
        Container tela = getContentPane();

        // Permite posicionar os componentes manualmente
        setLayout(null);

        // Cria os rótulos
        rotulo1 = new JLabel("Rótulo 1");
        rotulo2 = new JLabel("Rótulo 2");

        // Cria os botões Desabilitar e Habilitar
        desabilitar = new JButton("Desabilitar");
        habilitar = new JButton("Habilitar");

        // Define a posição e o tamanho dos rótulos
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);

        // Define a posição e o tamanho dos botões
        desabilitar.setBounds(80, 100, 100, 20);
        habilitar.setBounds(250, 100, 100, 20);

        // Executa uma ação ao clicar no botão Desabilitar
        desabilitar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // Desabilita o primeiro rótulo
                        rotulo1.setEnabled(false);

                        // Desabilita o segundo rótulo
                        rotulo2.setEnabled(false);
                    }
                }
        );

        // Executa uma ação ao clicar no botão Habilitar
        habilitar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // Habilita o primeiro rótulo
                        rotulo1.setEnabled(true);

                        // Habilita o segundo rótulo
                        rotulo2.setEnabled(true);
                    }
                }
        );

        // Adiciona os rótulos à janela
        tela.add(rotulo1);
        tela.add(rotulo2);

        // Adiciona os botões à janela
        tela.add(desabilitar);
        tela.add(habilitar);

        // Define o tamanho da janela
        setSize(400, 250);

        // Torna a janela visível
        setVisible(true);
    }

    // Método principal
    public static void main(String args[]) {

        // Cria um objeto da classe DesabilitarHabilitar
        pag79 app = new pag79();

        // Fecha o programa ao fechar a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

