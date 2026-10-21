
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

// Cria a classe ExemploTable, que herda de JFrame
public class pag97 extends JFrame {

    // variável para uso da tabela
    private JTable table;

    // Define os nomes das colunas
    private final String colunas[] = {
            "Nome:", "Idade:", "Sexo:"
    };

    // Define os dados que serão exibidos na tabela
    private final String dados[][] = {
            {"Charles", "19", "Masculino"},
            {"Galileu", "454", "Masculino"},
            {"Hawking", "76", "Masculino"},
            {"Newton", "375", "Masculino"},
            {"Kepler", "447", "Masculino"},
            {"Einstein", "139", "Masculino"},
            {"Copernicus", "545", "Masculino"}
    };

    // Construtor da classe
    public pag97() {

        // título da janela
        super("Exemplo com JTable");

        // Define o layout da janela
        setLayout(new FlowLayout());

        // Cria a tabela com os dados e os nomes das colunas
        table = new JTable(dados, colunas);

        // Define o tamanho preferido da tabela
        table.setPreferredScrollableViewportSize(
                new Dimension(350, 150)
        );

        // Adiciona barras de rolagem à tabela
        JScrollPane rolagem = new JScrollPane(table);

        // Adiciona a tabela à janela
        add(rolagem);

        // Define o tamanho da janela
        setSize(400, 250);

        // Coloca a janela no centro da tela
        setLocationRelativeTo(null);

        // Fecha o programa ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Torna a janela visível
        setVisible(true);
    }

    // Método principal
    public static void main(String args[]) {

        // Cria um objeto da classe ExemploTable
        pag97 app = new pag97();
    }
}
