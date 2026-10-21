
import javax.swing.*; // importação
import java.awt.*;

// Cria a classe pag43, que herda de JFrame
public class pag43 extends JFrame {

    // Construtor da classe
    public pag43() {

        // título da janela
        setTitle("Exemplo prático - Interface Login");

        // Define o tamanho da janela
        setSize(320, 370);

        // Fecha o programa ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Coloca a janela no centro da tela
        setLocationRelativeTo(null);

        // Cria o painel principal
        JPanel painel = new JPanel();

        // Permite posicionar os componentes manualmente
        painel.setLayout(null);

        // Define a cor de fundo do painel
        painel.setBackground(new Color(238, 238, 238));

        // Cria o texto Nome
        JLabel labelNome = new JLabel("Nome");

        // Define a posição e o tamanho do texto Nome
        labelNome.setBounds(10, 10, 100, 20);

        // Adiciona o texto Nome ao painel
        painel.add(labelNome);

        // Cria uma caixa de texto para digitar o nome
        JTextField campoNome = new JTextField();

        // Define a posição e o tamanho da caixa de nome
        campoNome.setBounds(10, 32, 290, 25);

        // Adiciona a caixa de nome ao painel
        painel.add(campoNome);

        // Cria o texto Senha
        JLabel labelSenha = new JLabel("Senha");

        // Define a posição e o tamanho do texto Senha
        labelSenha.setBounds(10, 60, 100, 20);

        // Adiciona o texto Senha ao painel
        painel.add(labelSenha);

        // Cria uma caixa para digitar a senha
        JPasswordField campoSenha = new JPasswordField();

        // Define a posição e o tamanho da caixa de senha
        campoSenha.setBounds(10, 82, 290, 25);

        // Adiciona a caixa de senha ao painel
        painel.add(campoSenha);

        // Cria o texto Comentário
        JLabel labelComentario = new JLabel("Comentário");

        // Define a posição e o tamanho do texto Comentário
        labelComentario.setBounds(10, 110, 150, 20);

        // Adiciona o texto Comentário ao painel
        painel.add(labelComentario);

        // Cria uma área para digitar o comentário
        JTextArea campoComentario = new JTextArea();

        // Permite quebrar as linhas automaticamente
        campoComentario.setLineWrap(true);

        // Evita separar palavras entre as linhas
        campoComentario.setWrapStyleWord(true);

        // Adiciona barras de rolagem ao comentário
        JScrollPane rolagem = new JScrollPane(campoComentario);

        // Define a posição e o tamanho da área de comentário
        rolagem.setBounds(10, 132, 290, 160);

        // Adiciona a área de comentário ao painel
        painel.add(rolagem);

        // Cria o botão OK
        JButton botaoOK = new JButton("OK");

        // Define a posição e o tamanho do botão OK
        botaoOK.setBounds(10, 300, 75, 30);

        // Adiciona o botão OK ao painel
        painel.add(botaoOK);

        // Cria o botão Cancelar
        JButton botaoCancelar = new JButton("Cancelar");

        // Define a posição e o tamanho do botão Cancelar
        botaoCancelar.setBounds(95, 300, 100, 30);

        // Adiciona o botão Cancelar ao painel
        painel.add(botaoCancelar);

        // Ação executada ao clicar no botão OK
        botaoOK.addActionListener(e -> {

            // Pega o nome digitado
            String nome = campoNome.getText();

            // Pega a senha digitada
            String senha = new String(campoSenha.getPassword());

            // Pega o comentário digitado
            String comentario = campoComentario.getText();

            // Mostra os dados em uma caixa de mensagem
            JOptionPane.showMessageDialog(
                    this,
                    "Nome: " + nome
                            + "\nSenha preenchida: " + !senha.isEmpty()
                            + "\nComentário: " + comentario
            );
        });

        // Limpa os campos ao clicar em Cancelar
        botaoCancelar.addActionListener(e -> {

            // Apaga o nome
            campoNome.setText("");

            // Apaga a senha
            campoSenha.setText("");

            // Apaga o comentário
            campoComentario.setText("");
        });

        // Adiciona o painel à janela
        add(painel);
    }

    // Método principal
    public static void main(String[] args) {

        // Executa a criação da janela
        SwingUtilities.invokeLater(() -> {

            // Cria a interface e torna a janela visível
            new pag43().setVisible(true);
        });
    }
}
