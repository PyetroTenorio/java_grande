
import javax.swing.*; // importação
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

// Cria a classe que herda de JFrame
public class pag59 extends JFrame {

    // Declara os rótulos dos campos
    JLabel rotulocep, rotulotel, rotulocpf, rotulodata;

    // Declara os campos de texto formatados
    JFormattedTextField cep, tel, cpf, data;

    // Declara as máscaras dos campos
    MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;

    // Construtor da classe
    public pag59() {

        // título da janela
        super("Exemplo com JFormattedTextField");

        // painel de conteúdo da janela
        Container tela = getContentPane();

        // Permite posicionar os componentes manualmente
        setLayout(null);

        // Cria os rótulos dos campos
        rotulocep = new JLabel("CEP: ");
        rotulotel = new JLabel("Telefone: ");
        rotulocpf = new JLabel("CPF: ");
        rotulodata = new JLabel("Data: ");

        // Define a posição e o tamanho dos rótulos
        rotulocep.setBounds(50, 40, 100, 20);
        rotulotel.setBounds(50, 80, 100, 20);
        rotulocpf.setBounds(50, 120, 100, 20);
        rotulodata.setBounds(50, 160, 100, 20);

        // Cria as máscaras dos campos
        try {

            // Define o formato do CEP
            mascaracep = new MaskFormatter("#####-###");

            // Define o formato do telefone
            mascaratel = new MaskFormatter("(##)####-####");

            // Define o formato do CPF
            mascaracpf = new MaskFormatter("#########-##");

            // Define o formato da data
            mascaradata = new MaskFormatter("##/##/####");

            // Define o caractere que aparece nos espaços vazios
            mascaracep.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaracpf.setPlaceholderCharacter('_');
            mascaradata.setPlaceholderCharacter('_');

        } catch (ParseException excp) {
            // Trata possíveis erros na criação das máscaras
        }

        // Cria os campos com suas respectivas máscaras
        cep = new JFormattedTextField(mascaracep);
        tel = new JFormattedTextField(mascaratel);
        cpf = new JFormattedTextField(mascaracpf);
        data = new JFormattedTextField(mascaradata);

        // Define a posição e o tamanho dos campos
        cep.setBounds(150, 40, 100, 20);
        tel.setBounds(150, 80, 100, 20);
        cpf.setBounds(150, 120, 100, 20);
        data.setBounds(150, 160, 100, 20);

        // Adiciona os rótulos à janela
        tela.add(rotulocep);
        tela.add(rotulotel);
        tela.add(rotulocpf);
        tela.add(rotulodata);

        // Adiciona os campos à janela
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);

        // Define o tamanho da janela
        setSize(400, 250);

        // Torna a janela visível
        setVisible(true);
    }

    // Método principal
    public static void main(String args[]) {

        // Cria um objeto da classe e abre a janela
        pag59 app =
                new pag59();

        // Fecha o programa ao fechar a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

