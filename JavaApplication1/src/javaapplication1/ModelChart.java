package javaapplication1;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class ModelChart {

    private String chartTitle;
    private String categoryAxisLabel;
    private String valueAxisLabel;
    private CategoryDataset dataset;

    public ModelChart(String chartTitle, String categoryAxisLabel, String valueAxisLabel, CategoryDataset dataset) {
        this.chartTitle = chartTitle;
        this.categoryAxisLabel = categoryAxisLabel;
        this.valueAxisLabel = valueAxisLabel;
        this.dataset = dataset;
    }

    public JFreeChart createChart() {
        return ChartFactory.createBarChart(
                chartTitle,
                categoryAxisLabel,
                valueAxisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
    }
}
