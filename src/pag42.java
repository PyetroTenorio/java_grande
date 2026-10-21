
import javax.swing.*; // importação
import java.awt.*;

// Cria a classe pag42, que herda de JFrame
public class pag42 extends JFrame {

    // Construtor da classe
    public pag42() {

        // título da janela
        setTitle("Cadastro de Cliente");

        // Define o tamanho da janela
        setSize(390, 450);

        // Fecha o programa ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Coloca a janela no centro da tela
        setLocationRelativeTo(null);

        // Cria o painel principal
        JPanel painel = new JPanel();

        // Permite posicionar os componentes manualmente
        painel.setLayout(null);

        // Define a cor de fundo do painel
        painel.setBackground(new Color(210, 207, 201));

        // Cria o título do formulário
        JLabel titulo = new JLabel("Cadastro de Cliente");

        // Define a posição e o tamanho do título
        titulo.setBounds(95, 10, 200, 30);

        // Define a cor do título
        titulo.setForeground(Color.RED);

        // Define a fonte, o estilo e o tamanho do título
        titulo.setFont(new Font("Arial", Font.BOLD, 14));

        // Adiciona o título ao painel
        painel.add(titulo);

        // Cria o texto Nome
        JLabel labelNome = new JLabel("Nome");

        // Define a posição e o tamanho do texto Nome
        labelNome.setBounds(30, 45, 100, 20);

        // Adiciona o texto Nome ao painel
        painel.add(labelNome);

        // Cria uma caixa de texto para digitar o nome
        JTextField campoNome = new JTextField();

        // Define a posição e o tamanho da caixa de nome
        campoNome.setBounds(30, 65, 260, 22);

        // Adiciona a caixa de nome ao painel
        painel.add(campoNome);

        // Cria o texto CPF
        JLabel labelCPF = new JLabel("CPF");

        // Define a posição e o tamanho do texto CPF
        labelCPF.setBounds(30, 90, 100, 20);

        // Adiciona o texto CPF ao painel
        painel.add(labelCPF);

        // Cria uma caixa de texto para digitar o CPF
        JTextField campoCPF = new JTextField();

        // Define a posição e o tamanho da caixa de CPF
        campoCPF.setBounds(30, 110, 120, 22);

        // Adiciona a caixa de CPF ao painel
        painel.add(campoCPF);

        // Cria o texto RG
        JLabel labelRG = new JLabel("RG");

        // Define a posição e o tamanho do texto RG
        labelRG.setBounds(30, 135, 100, 20);

        // Adiciona o texto RG ao painel
        painel.add(labelRG);

        // Cria uma caixa de texto para digitar o RG
        JTextField campoRG = new JTextField();

        // Define a posição e o tamanho da caixa de RG
        campoRG.setBounds(30, 155, 105, 22);

        // Adiciona a caixa de RG ao painel
        painel.add(campoRG);

        // Cria o texto Endereço
        JLabel labelEndereco = new JLabel("Endereço");

        // Define a posição e o tamanho do texto Endereço
        labelEndereco.setBounds(30, 180, 100, 20);

        // Adiciona o texto Endereço ao painel
        painel.add(labelEndereco);

        // Cria uma caixa de texto para digitar o endereço
        JTextField campoEndereco = new JTextField();

        // Define a posição e o tamanho da caixa de endereço
        campoEndereco.setBounds(30, 200, 260, 22);

        // Adiciona a caixa de endereço ao painel
        painel.add(campoEndereco);

        // Cria o texto Cidade
        JLabel labelCidade = new JLabel("Cidade");

        // Define a posição e o tamanho do texto Cidade
        labelCidade.setBounds(30, 225, 100, 20);

        // Adiciona o texto Cidade ao painel
        painel.add(labelCidade);

        // Cria uma caixa de texto para digitar a cidade
        JTextField campoCidade = new JTextField();

        // Define a posição e o tamanho da caixa de cidade
        campoCidade.setBounds(30, 245, 240, 22);

        // Adiciona a caixa de cidade ao painel
        painel.add(campoCidade);

        // Cria o texto Estado
        JLabel labelEstado = new JLabel("Estado");

        // Define a posição e o tamanho do texto Estado
        labelEstado.setBounds(30, 270, 100, 20);

        // Adiciona o texto Estado ao painel
        painel.add(labelEstado);

        // Cria uma caixa de texto para digitar o estado
        JTextField campoEstado = new JTextField();

        // Define a posição e o tamanho da caixa de estado
        campoEstado.setBounds(30, 290, 190, 22);

        // Adiciona a caixa de estado ao painel
        painel.add(campoEstado);

        // Cria o texto CEP
        JLabel labelCEP = new JLabel("CEP");

        // Define a posição e o tamanho do texto CEP
        labelCEP.setBounds(30, 315, 100, 20);

        // Adiciona o texto CEP ao painel
        painel.add(labelCEP);

        // Cria uma caixa de texto para digitar o CEP
        JTextField campoCEP = new JTextField();

        // Define a posição e o tamanho da caixa de CEP
        campoCEP.setBounds(30, 335, 120, 22);

        // Adiciona a caixa de CEP ao painel
        painel.add(campoCEP);

        // Cria o botão Cadastrar
        JButton botaoCadastrar = new JButton("Cadastrar");

        // Define a posição e o tamanho do botão Cadastrar
        botaoCadastrar.setBounds(30, 370, 110, 30);

        // Adiciona o botão Cadastrar ao painel
        painel.add(botaoCadastrar);

        // Cria o botão Limpar
        JButton botaoLimpar = new JButton("Limpar");

        // Define a posição e o tamanho do botão Limpar
        botaoLimpar.setBounds(150, 370, 90, 30);

        // Adiciona o botão Limpar ao painel
        painel.add(botaoLimpar);

        // Exibe os dados preenchidos ao clicar em Cadastrar
        botaoCadastrar.addActionListener(e -> {

            // Junta os dados digitados em uma mensagem
            String mensagem =
                    "Nome: " + campoNome.getText()
                            + "\nCPF: " + campoCPF.getText()
                            + "\nRG: " + campoRG.getText()
                            + "\nEndereço: " + campoEndereco.getText()
                            + "\nCidade: " + campoCidade.getText()
                            + "\nEstado: " + campoEstado.getText()
                            + "\nCEP: " + campoCEP.getText();

            // Mostra os dados em uma caixa de mensagem
            JOptionPane.showMessageDialog(
                    this,
                    mensagem,
                    "Dados do Cliente",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // Apaga todos os campos ao clicar em Limpar
        botaoLimpar.addActionListener(e -> {

            // Apaga o nome
            campoNome.setText("");

            // Apaga o CPF
            campoCPF.setText("");

            // Apaga o RG
            campoRG.setText("");

            // Apaga o endereço
            campoEndereco.setText("");

            // Apaga a cidade
            campoCidade.setText("");

            // Apaga o estado
            campoEstado.setText("");

            // Apaga o CEP
            campoCEP.setText("");
        });

        // Adiciona o painel à janela
        add(painel);
    }

    // Método principal
    public static void main(String[] args) {

        // Executa a criação da janela
        SwingUtilities.invokeLater(() -> {

            // Cria o cadastro e torna a janela visível
            new pag42().setVisible(true);
        });
    }
}
