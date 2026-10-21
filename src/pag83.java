
import javax.swing.*;
import java.awt.*;

// Primeira janela do programa
public class pag83 extends JFrame {

    // Construtor da primeira janela
    public pag83() {

        // título da janela
        super("Teste Janela");

        // Define o layout da janela
        setLayout(new FlowLayout());

        // Cria o rótulo
        JLabel jLabel1 = new JLabel("Teste de Janelas");

        // Cria os botões
        JButton Button1 = new JButton("Abrir");
        JButton Button2 = new JButton("Sair");

        // Adiciona os componentes à janela
        add(jLabel1);
        add(Button1);
        add(Button2);

        // Abre a segunda janela ao clicar em Abrir
        Button1.addActionListener(e -> {
            new TesteJanela02().setVisible(true);
        });

        // Fecha o programa ao clicar em Sair
        Button2.addActionListener(e -> {
            System.exit(0);
        });

        // Define o tamanho da janela
        setSize(300, 200);

        // Coloca a janela no centro da tela
        setLocationRelativeTo(null);

        // Define a ação ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Segunda janela do programa
    static class TesteJanela02 extends JFrame {

        // Construtor da segunda janela
        public TesteJanela02() {

            // título da janela
            super("Cadastro de Cliente");

            // Define o layout da janela
            setLayout(new GridLayout(0, 2, 8, 8));

            // Cria os rótulos
            JLabel jLabel1 = new JLabel("Cadastro");
            JLabel jLabel2 = new JLabel("Nome:");
            JLabel jLabel3 = new JLabel("Endereço:");
            JLabel jLabel4 = new JLabel("Cidade:");
            JLabel jLabel5 = new JLabel("Telefone:");

            // Cria as caixas de texto
            JTextField jTextField1 = new JTextField();
            JTextField jTextField2 = new JTextField();
            JTextField jTextField3 = new JTextField();
            JTextField jTextField4 = new JTextField();

            // Cria o botão Voltar
            JButton Button1 = new JButton("Voltar");

            // Adiciona os rótulos e as caixas à janela
            add(jLabel1);
            add(new JLabel(""));

            add(jLabel2);
            add(jTextField1);

            add(jLabel3);
            add(jTextField2);

            add(jLabel4);
            add(jTextField3);

            add(jLabel5);
            add(jTextField4);

            // Adiciona o botão Voltar
            add(Button1);

            // Fecha somente a segunda janela ao clicar em Voltar
            Button1.addActionListener(e -> {
                dispose();
            });

            // Define o tamanho da janela
            setSize(400, 300);

            // Coloca a janela no centro da tela
            setLocationRelativeTo(null);

            // Fecha somente esta janela ao clicar no X
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    // Método principal
    public static void main(String[] args) {

        // Cria e exibe a primeira janela
        SwingUtilities.invokeLater(() -> {
            new pag83().setVisible(true);
        });
    }
}

