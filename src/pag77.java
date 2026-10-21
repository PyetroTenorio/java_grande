
import javax.swing.*; // importação
import java.awt.*;
import java.awt.event.*;

// Cria a classe OcultarExibir, que herda de JFrame
public class pag77 extends JFrame {

    // Declara os rótulos da janela
    JLabel rotulo1, rotulo2;

    // Declara os botões
    JButton ocultar, exibir;

    // Construtor da classe
    public pag77() {

        // título da janela
        super("Exemplo de ocultar e exibir componente");

        // painel de conteúdo da janela
        Container tela = getContentPane();

        // Permite posicionar os componentes manualmente
        setLayout(null);

        // Cria os rótulos
        rotulo1 = new JLabel("Rótulo 1");
        rotulo2 = new JLabel("Rótulo 2");

        // Cria os botões Ocultar e Exibir
        ocultar = new JButton("Ocultar");
        exibir = new JButton("Exibir");

        // Define a posição e o tamanho dos componentes
        rotulo1.setBounds(50, 10, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);

        ocultar.setBounds(100, 80, 100, 20);
        exibir.setBounds(250, 100, 80, 20);

        // Executa uma ação ao clicar no botão Ocultar
        ocultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Esconde o primeiro rótulo
                rotulo1.setVisible(false);

                // Esconde o segundo rótulo
                rotulo2.setVisible(false);
            }
        });

        // Executa uma ação ao clicar no botão Exibir
        exibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Mostra o primeiro rótulo
                rotulo1.setVisible(true);

                // Mostra o segundo rótulo
                rotulo2.setVisible(true);
            }
        });

        // Adiciona os rótulos à janela
        tela.add(rotulo1);
        tela.add(rotulo2);

        // Adiciona os botões à janela
        tela.add(ocultar);
        tela.add(exibir);

        // Define o tamanho da janela
        setSize(400, 250);

        // Torna a janela visível
        setVisible(true);
    }

    // Método principal
    public static void main(String args[]) {

        // Cria um objeto da classe OcultarExibir
        pag77 app = new pag77();

        // Fecha o programa ao fechar a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
