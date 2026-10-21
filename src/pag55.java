//importação
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Cria a classe pag55, que herda  de JFrame
public class pag55 extends JFrame {

    // Declara uma caixa de texto
    JPasswordField caixa;

    // Declara um rótulo para mostrar o texto
    JLabel rotulo;

    // Construtor da classe: configura a janela
    public pag55() {

        // título da janela
        super("Exemplo com JPasswordField");

        //  o painel de conteúdo da janela
        Container tela = getContentPane();

        // Permite posicionar os componentes manualmente
        setLayout(null);

        // Cria o rótulo com o texto Senha
        rotulo = new JLabel("Senha: ");

        // Cria uma caixa para digitar a senha
        // com 10 espaços
        caixa = new JPasswordField(10);

        // Define a posição e o tamanho do rótulo
        // x = 50, y = 20, largura = 100, altura = 20
        rotulo.setBounds(50, 20, 100, 20);

        // Define a posição e o tamanho da caixa de senha
        // x = 50, y = 60, largura = 100, altura = 20
        caixa.setBounds(50, 60, 100, 20);

        // Adiciona o rótulo à janela
        tela.add(rotulo);

        // Adiciona a caixa de senha à janela
        tela.add(caixa);

        // Define o tamanho da janela: 400 pixels de largura
        // e 250 pixels de altura
        setSize(400, 250);

        // Torna a janela visível
        setVisible(true);
    }

    // Método principal
    public static void main(String args[]) {

        // Cria um objeto da classe pag55 e abre a janela
        pag55 app = new pag55();

        // Encerra o programa quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
