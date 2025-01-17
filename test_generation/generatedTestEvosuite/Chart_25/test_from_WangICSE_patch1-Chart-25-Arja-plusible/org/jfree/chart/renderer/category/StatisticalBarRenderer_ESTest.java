/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 21:37:59 GMT 2022
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorPaint((Paint) null);
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(boolean0);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("`y[zvm[jfY!X0", true);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("6?5O8");
      categoryItemRendererState0.setBarWidth(0.05);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("`y[zvm[jfY!X0");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(graphics2D0, categoryItemRendererState0, rectangle0, combinedRangeCategoryPlot0, subCategoryAxis0, logarithmicAxis0, defaultStatisticalCategoryDataset0, (-2775), (-626));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("The 'series' argument is out of bounds (", combinedRangeCategoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("The 'series' argument is out of bounds (", false);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("The 'series' argument is out of bounds (");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      categoryStepRenderer_State0.setBarWidth(1515.42820816);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(graphics2D0, categoryStepRenderer_State0, rectangle0, combinedRangeCategoryPlot0, subCategoryAxis0, numberAxis3D0, defaultStatisticalCategoryDataset0, 1, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      statisticalBarRenderer0.setErrorIndicatorPaint(spiderWebPlot0.DEFAULT_BACKGROUND_PAINT);
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Point point0 = new Point();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.initialise((Graphics2D) null, rectangle0, combinedDomainCategoryPlot0, 10, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      LogAxis logAxis0 = new LogAxis("");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryItemRendererState0, rectangle0, combinedDomainCategoryPlot0, categoryAxis0, logAxis0, defaultStatisticalCategoryDataset0, 935, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorStroke(statisticalBarRenderer0.DEFAULT_STROKE);
      assertTrue(statisticalBarRenderer0.getAutoPopulateSeriesPaint());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorPaint((Paint) null);
      Paint paint0 = statisticalBarRenderer0.getErrorIndicatorPaint();
      assertNull(paint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis3D0, (ValueAxis) null, statisticalBarRenderer0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, (CategoryItemRendererState) null, defaultCaret0, categoryPlot0, categoryAxis3D0, (ValueAxis) null, defaultStatisticalCategoryDataset0, 0, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis3D0, (ValueAxis) null, statisticalBarRenderer0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, defaultCaret0, categoryPlot0, categoryAxis3D0, (ValueAxis) null, defaultStatisticalCategoryDataset0, 2106, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2106, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.initialise((Graphics2D) null, defaultCaret0, combinedRangeCategoryPlot0, 0, (PlotRenderingInfo) null);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, defaultCaret0, combinedRangeCategoryPlot0, categoryAxis3D0, logarithmicAxis0, defaultStatisticalCategoryDataset0, 0, 1, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("jvCzy/.EfxOFmA#w\"2", statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT, combinedRangeCategoryPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryStepRenderer_State0, defaultCaret0, combinedRangeCategoryPlot0, categoryAxis3D0, logarithmicAxis0, defaultStatisticalCategoryDataset0, (-2684), 680, 680);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("K|NbpM", combinedRangeCategoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle rectangle0 = new Rectangle(10, 10);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("K|NbpM");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("K|NbpM");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(graphics2D0, categoryStepRenderer_State0, rectangle0, combinedRangeCategoryPlot0, subCategoryAxis0, numberAxis3D0, defaultStatisticalCategoryDataset0, (-1), 500);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = (StatisticalBarRenderer)statisticalBarRenderer0.clone();
      assertTrue(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      
      statisticalBarRenderer1.setErrorIndicatorPaint(statisticalBarRenderer0.DEFAULT_PAINT);
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      assertTrue(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      statisticalBarRenderer1.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0);
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      boolean boolean0 = statisticalBarRenderer0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
      boolean boolean0 = statisticalBarRenderer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, defaultCaret0, combinedRangeCategoryPlot0, categoryAxis3D0, logarithmicAxis0, taskSeriesCollection0, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, defaultCaret0, combinedRangeCategoryPlot0, categoryAxis3D0, logarithmicAxis0, defaultStatisticalCategoryDataset0, 0, 10, 500);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Stroke stroke0 = defaultPolarItemRenderer0.getItemOutlineStroke(0, 0);
      statisticalBarRenderer0.setErrorIndicatorStroke(stroke0);
      assertTrue(statisticalBarRenderer0.getBaseSeriesVisible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorPaint((Paint) null);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, (CategoryItemRendererState) null, (Rectangle2D) null, combinedRangeCategoryPlot0, categoryAxis3D0, (ValueAxis) null, defaultStatisticalCategoryDataset0, (-76), 3596);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getRed());
  }
}
