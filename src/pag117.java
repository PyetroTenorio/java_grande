
// Importação das bibliotecas
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Cria a classe que herda de JFrame
public class pag117 extends JFrame {

    // Declara os rótulos e o texto
    JLabel rotulo1, rotulo2, rotulo3, texto;

    // Declara as caixas de seleção
    JCheckBox negrito, italico, normal, negritoitalico;

    // Declara os botões de tamanho da fonte
    JRadioButton tam1, tam2, tam3, tam4;

    // Declara o grupo de botões
    ButtonGroup grupo;

    // Define as cores disponíveis
    String cor[] = {
            "Sem Cor", "Vermelho", "Azul",
            "Verde", "Amarelo", "Branco", "Preto"
    };

    // Declara a lista de cores
    JComboBox<String> lista;

    // Declara as variáveis de estilo e tamanho
    int estilo, tamfonte;

    // Construtor da classe
    public pag117() {

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
        lista.setMaximumRowCount(7);

        // Cria as caixas de seleção dos estilos
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Itálico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Itálico");

        // Cria os botões de tamanho da fonte
        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("14");
        tam3 = new JRadioButton("16");
        tam4 = new JRadioButton("18");

        // Cria o grupo de botões
        grupo = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);

        // Define as posições dos rótulos
        rotulo1.setBounds(40, 20, 70, 20);
        rotulo2.setBounds(200, 20, 70, 20);
        rotulo3.setBounds(300, 20, 70, 20);

        // Define a posição do texto
        texto.setBounds(100, 200, 300, 30);

        // Define a posição da lista de cores
        lista.setBounds(40, 50, 150, 20);

        // Define as posições das caixas de seleção
        negrito.setBounds(200, 50, 150, 20);
        italico.setBounds(200, 70, 150, 20);
        normal.setBounds(200, 90, 150, 20);
        negritoitalico.setBounds(200, 110, 150, 20);

        // Define as posições dos botões de tamanho
        tam1.setBounds(350, 50, 100, 20);
        tam2.setBounds(350, 70, 100, 20);
        tam3.setBounds(350, 90, 100, 20);
        tam4.setBounds(350, 110, 100, 20);

        // Define os valores iniciais
        tamfonte = 12;
        estilo = Font.PLAIN;
        tam1.setSelected(true);

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

        // Cria o evento para selecionar a cor
        lista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Obtém a cor selecionada
                String corSelecionada =
                        lista.getSelectedItem().toString();

                // Altera a cor do texto
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
                    case "Sem Cor":
                        texto.setForeground(Color.BLACK);
                        break;
                }
            }
        });

        // Cria o evento para atualizar o estilo da fonte
        ItemListener eventoEstilo = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                atualizarFonte();
            }
        };

        // Adiciona o evento às caixas de seleção
        negrito.addItemListener(eventoEstilo);
        italico.addItemListener(eventoEstilo);
        normal.addItemListener(eventoEstilo);
        negritoitalico.addItemListener(eventoEstilo);

        // Cria o evento para alterar o tamanho da fonte
        ActionListener eventoTamanho = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Verifica o tamanho selecionado
                if (tam1.isSelected()) {
                    tamfonte = 12;
                } else if (tam2.isSelected()) {
                    tamfonte = 14;
                } else if (tam3.isSelected()) {
                    tamfonte = 16;
                } else if (tam4.isSelected()) {
                    tamfonte = 18;
                }

                // Atualiza o texto
                atualizarFonte();
            }
        };

        // Adiciona o evento aos botões de tamanho
        tam1.addActionListener(eventoTamanho);
        tam2.addActionListener(eventoTamanho);
        tam3.addActionListener(eventoTamanho);
        tam4.addActionListener(eventoTamanho);

        // Define o tamanho da janela
        setSize(500, 300);

        // Centraliza a janela
        setLocationRelativeTo(null);

        // Encerra o programa ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exibe a janela
        setVisible(true);
    }

    // Método que atualiza o estilo e o tamanho da fonte
    private void atualizarFonte() {

        // Define o estilo inicial como normal
        estilo = Font.PLAIN;

        // Verifica se negrito e itálico estão selecionados
        if (negritoitalico.isSelected()) {
            estilo = Font.BOLD | Font.ITALIC;
        } else if (normal.isSelected()) {
            estilo = Font.PLAIN;
        } else {
            // Verifica se negrito está selecionado
            if (negrito.isSelected()) {
                estilo |= Font.BOLD;
            }

            // Verifica se itálico está selecionado
            if (italico.isSelected()) {
                estilo |= Font.ITALIC;
            }
        }

        // Aplica o estilo e o tamanho ao texto
        texto.setFont(new Font("Arial", estilo, tamfonte));
    }

    // Método principal que inicia o programa
    public static void main(String[] args) {
        new pag117();
    }
}
