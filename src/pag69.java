
import javax.swing.*; // importação
import java.awt.*;
import java.awt.event.*;

// Cria a classe SenhaDigitada, que herda de JFrame
public class pag69 extends JFrame {

    // Declara os componentes da janela
    JLabel rotulo, exibir;
    JPasswordField caixa;
    JButton mostrar;

    // Construtor da classe
    public pag69() {

        // título da janela
        super("Exemplo com JPasswordField");

        // painel de conteúdo da janela
        Container tela = getContentPane();

        // Permite posicionar os componentes manualmente
        setLayout(null);

        // Cria o rótulo Senha
        rotulo = new JLabel("Senha: ");

        // Cria uma caixa para digitar a senha
        caixa = new JPasswordField(10);

        // Cria um rótulo para exibir a senha
        exibir = new JLabel("A senha digitada é:");

        // Cria o botão Mostrar
        mostrar = new JButton("Mostrar");

        // Esconde o rótulo que exibirá a senha
        exibir.setVisible(false);

        // Define a posição e o tamanho dos componentes
        rotulo.setBounds(50, 20, 100, 20);
        caixa.setBounds(50, 60, 200, 20);
        exibir.setBounds(50, 120, 200, 20);
        mostrar.setBounds(150, 100, 80, 20);

        // Executa uma ação ao clicar no botão Mostrar
        mostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Pega a senha digitada
                String senha = new String(caixa.getPassword());

                // Torna o rótulo visível
                exibir.setVisible(true);

                // Mostra a senha digitada no rótulo
                exibir.setText(senha);
            }
        });

        // Adiciona os componentes à janela
        tela.add(rotulo);
        tela.add(caixa);
        tela.add(exibir);
        tela.add(mostrar);

        // Define o tamanho da janela
        setSize(400, 250);

        // Torna a janela visível
        setVisible(true);
    }

    // Método principal
    public static void main(String args[]) {

        // Cria um objeto da classe e abre a janela
        pag69 app = new pag69();

        // Fecha o programa ao fechar a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
