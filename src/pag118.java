
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pag118 extends JFrame {

    JLabel rotulo1, rotulo2, rotulo3, texto;
    JCheckBox negrito, italico, normal, negritoitalico;
    JRadioButton tam1, tam2, tam3;
    ButtonGroup grupo;
    String cor[] = {"Vermelho", "Azul", "Verde", "Amarelo", "Branco", "Preto"};
    JComboBox<String> lista;
    int estilo, tamfonte;

    public pag118() {
        super("Exemplo Combo Check Radio");

        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("Cor");
        rotulo2 = new JLabel("Estilo");
        rotulo3 = new JLabel("Tamanho");
        texto = new JLabel("Programa feito em Java");

        lista = new JComboBox<>(cor);

        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Itálico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Itálico");

        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("14");
        tam3 = new JRadioButton("16");

        grupo = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);

        rotulo1.setBounds(40, 20, 100, 20);
        rotulo2.setBounds(180, 20, 100, 20);
        rotulo3.setBounds(330, 20, 100, 20);
        lista.setBounds(40, 50, 120, 25);

        negrito.setBounds(180, 50, 140, 25);
        italico.setBounds(180, 80, 140, 25);
        normal.setBounds(180, 110, 140, 25);
        negritoitalico.setBounds(180, 140, 150, 25);

        tam1.setBounds(330, 50, 70, 25);
        tam2.setBounds(330, 80, 70, 25);
        tam3.setBounds(330, 110, 70, 25);

        texto.setBounds(100, 210, 300, 30);

        estilo = Font.PLAIN;
        tamfonte = 12;
        tam1.setSelected(true);
        texto.setFont(new Font("Arial", estilo, tamfonte));

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

        // Altera a cor do texto conforme a opção selecionada
        lista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String corSelecionada = lista.getSelectedItem().toString();

                if (corSelecionada.equals("Vermelho"))
                    texto.setForeground(Color.red);

                if (corSelecionada.equals("Azul"))
                    texto.setForeground(Color.blue);

                if (corSelecionada.equals("Verde"))
                    texto.setForeground(Color.green);

                if (corSelecionada.equals("Amarelo"))
                    texto.setForeground(Color.yellow);

                if (corSelecionada.equals("Branco"))
                    texto.setForeground(Color.white);

                if (corSelecionada.equals("Preto"))
                    texto.setForeground(Color.black);
            }
        });

        // Coloca a fonte no tamanho 12
        tam1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 12;
                texto.setFont(new Font("Arial", estilo, tamfonte));
            }
        });

        // Coloca a fonte no tamanho 14
        tam2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 14;
                texto.setFont(new Font("Arial", estilo, tamfonte));
            }
        });

        // Coloca a fonte no tamanho 16
        tam3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 16;
                texto.setFont(new Font("Arial", estilo, tamfonte));
            }
        });

        // Altera o estilo da fonte
        ItemListener eventoEstilo = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                estilo = Font.PLAIN;

                if (negrito.isSelected())
                    estilo |= Font.BOLD;

                if (italico.isSelected())
                    estilo |= Font.ITALIC;

                if (negritoitalico.isSelected())
                    estilo = Font.BOLD | Font.ITALIC;

                if (normal.isSelected())
                    estilo = Font.PLAIN;

                texto.setFont(new Font("Arial", estilo, tamfonte));
            }
        };

        negrito.addItemListener(eventoEstilo);
        italico.addItemListener(eventoEstilo);
        normal.addItemListener(eventoEstilo);
        negritoitalico.addItemListener(eventoEstilo);

        setSize(480, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new pag118();
    }
}
