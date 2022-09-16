
package teste.jfree.charts;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
public class TesteJfreeCharts extends JFrame{
    public TesteJfreeCharts(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grafico de Pizza teste");
        setSize(950,700);
        setLocationRelativeTo(null);
        criarGrafico();
        setVisible(true);
    }
    
    public void criarGrafico(){
        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("Brasil", 5);
        pizza.setValue("Alemanha", 4);
        pizza.setValue("Itália", 4);
        pizza.setValue("Brasil", 2);
        
        JFreeChart grafico = ChartFactory.createPieChart("Campeoes mundiais", pizza,true,true,false);
        ChartPanel panel = new ChartPanel(grafico);
        add(panel);
    }
    
    
    public static void main(String[] args) {
        new TesteJfreeCharts();
    }
    
}
