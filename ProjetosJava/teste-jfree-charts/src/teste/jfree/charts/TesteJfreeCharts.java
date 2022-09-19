package teste.jfree.charts;

import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class TesteJfreeCharts extends javax.swing.JFrame {

    public TesteJfreeCharts() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grafico de Pizza teste");
        setSize(300, 300);
        setLocationRelativeTo(null);
        criarGraficoBar();
        setVisible(true);

    }

    public void criarGraficoBar() {
        DefaultCategoryDataset bar = new DefaultCategoryDataset();
        bar.setValue(2, "Brasil", "");
        bar.setValue(5, "Alemanha", "");
        bar.setValue(8, "Itália", "");
        bar.setValue(9, "Brasil", "");

        JFreeChart graficoBar = ChartFactory.createBarChart3D("A","B","C",bar, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel = new ChartPanel(graficoBar);
        add(panel);
    }

    public void criarGraficoPie() {

        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("Brasil", 5);
        pizza.setValue("Alemanha", 4);
        pizza.setValue("Itália", 4);
        pizza.setValue("Brasil", 2);

        JFreeChart graficoPie = ChartFactory.createPieChart3D("Campeoes mundiais", pizza, true, true, false);
        ChartPanel panel = new ChartPanel(graficoPie);
        add(panel);
    }

    public static void main(String[] args) {
        new TesteJfreeCharts();
    }

}
