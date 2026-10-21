
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Cria a classe ExemploComboCheckRadio, que herda de JFrame
public class pag116 extends JFrame {

    // Declara os rótulos e o texto
    JLabel rotulo1, rotulo2, rotulo3, texto;

    // Declara as caixas de seleção
    JCheckBox negrito, italico, normal, negritoitalico;

    // Declara os botões de opção
    JRadioButton tam1, tam2, tam3, tam4;

    // Agrupa os botões de opção
    ButtonGroup grupo;

    // Define as cores disponíveis
    String cor[] = {
            "Sem Cor", "Vermelho", "Azul",
            "Verde", "Amarelo", "Branco", "Preto"
    };

    // Declara a lista de cores
    JComboBox<String> lista;

    // Declara as variáveis de estilo e tamanho da fonte
    Integer estilo, tamfonte;

    // Construtor da classe
    public pag116() {

        // Define o título da janela
        super("Exemplo Combo Check Radio Box");

        // Obtém o painel de conteúdo
        Container tela = getContentPane();

        // Permite posicionar os componentes manualmente
        setLayout(null);

        // Cria os rótulos
        rotulo1 = new JLabel("Cor");
        rotulo2 = new JLabel("Estilo");
        rotulo3 = new JLabel("Tamanho");

        // Cria o texto que será formatado
        texto = new JLabel("Programa feito em Java");

        // Cria a lista de cores
        lista = new JComboBox<>(cor);

        // Define quantas opções aparecem na lista
        lista.setMaximumRowCount(7);

        // Cria as caixas de seleção de estilo
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Itálico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Itálico");

        // Cria os botões para escolher o tamanho da fonte
        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("16");
        tam3 = new JRadioButton("20");
        tam4 = new JRadioButton("24");

        // Agrupa os botões para permitir apenas uma seleção
        grupo = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);

        // Define as posições e os tamanhos dos rótulos
        rotulo1.setBounds(30, 20, 100, 25);
        rotulo2.setBounds(30, 90, 100, 25);
        rotulo3.setBounds(30, 190, 100, 25);
        texto.setBounds(30, 260, 300, 40);

        // Define a posição e o tamanho da lista de cores
        lista.setBounds(30, 45, 150, 25);

        // Define as posições das caixas de seleção
        negrito.setBounds(30, 115, 150, 25);
        italico.setBounds(30, 140, 150, 25);
        normal.setBounds(180, 115, 150, 25);
        negritoitalico.setBounds(180, 140, 150, 25);

        // Define as posições dos botões de tamanho
        tam1.setBounds(30, 215, 60, 25);
        tam2.setBounds(90, 215, 60, 25);
        tam3.setBounds(150, 215, 60, 25);
        tam4.setBounds(210, 215, 60, 25);

        // Adiciona os componentes à janela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto);
        tela.add(lista);
        tela.add(negrito);
        tela.add(italico);
        tela.add(normal);
        tela.add(negritoitalico);
        tela.add(tam1);
        tela.add(tam2);
        tela.add(tam3);
        tela.add(tam4);

        // Define a opção inicial do tamanho da fonte
        tam1.setSelected(true);

        // Atualiza o estilo do texto quando uma caixa é selecionada
        ItemListener estiloListener = e -> atualizarTexto();
        negrito.addItemListener(estiloListener);
        italico.addItemListener(estiloListener);
        normal.addItemListener(estiloListener);
        negritoitalico.addItemListener(estiloListener);

        // Atualiza o texto quando uma cor é escolhida
        lista.addActionListener(e -> atualizarTexto());

        // Atualiza o texto quando o tamanho é alterado
        ActionListener tamanhoListener = e -> atualizarTexto();
        tam1.addActionListener(tamanhoListener);
        tam2.addActionListener(tamanhoListener);
        tam3.addActionListener(tamanhoListener);
        tam4.addActionListener(tamanhoListener);

        // Define o tamanho da janela
        setSize(380, 350);

        // Centraliza a janela na tela
        setLocationRelativeTo(null);

        // Encerra o programa ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exibe a janela
        setVisible(true);
    }

    // Atualiza a cor, o estilo e o tamanho do texto
    private void atualizarTexto() {

        // Define o estilo da fonte
        if (negritoitalico.isSelected()) {
            estilo = Font.BOLD | Font.ITALIC;
        } else {
            estilo = Font.PLAIN;

            if (negrito.isSelected()) {
                estilo |= Font.BOLD;
            }

            if (italico.isSelected()) {
                estilo |= Font.ITALIC;
            }
        }

        // Define o tamanho da fonte
        if (tam2.isSelected()) {
            tamfonte = 16;
        } else if (tam3.isSelected()) {
            tamfonte = 20;
        } else if (tam4.isSelected()) {
            tamfonte = 24;
        } else {
            tamfonte = 12;
        }

        // Aplica o estilo e o tamanho ao texto
        texto.setFont(new Font("Arial", estilo, tamfonte));

        // Obtém a cor selecionada
        String corSelecionada = (String) lista.getSelectedItem();

        // Aplica a cor escolhida
        switch (corSelecionada) {
            case "Vermelho":
                texto.setForeground(Color.RED);
                break;
            case "Azul":
                texto.setForeground(Color.BLUE);
                break;
            case "Verde":
                texto.setForeground(Color.GREEN);
                break;
            case "Amarelo":
                texto.setForeground(Color.YELLOW);
                break;
            case "Branco":
                texto.setForeground(Color.WHITE);
                break;
            case "Preto":
                texto.setForeground(Color.BLACK);
                break;
            default:
                texto.setForeground(Color.BLACK);
                break;
        }
    }

    // Método principal
    public static void main(String[] args) {

        // Cria um objeto da classe
        new pag116();
    }
}
