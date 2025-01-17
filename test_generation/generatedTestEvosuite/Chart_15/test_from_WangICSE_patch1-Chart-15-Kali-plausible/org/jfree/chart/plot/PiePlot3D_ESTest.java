/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 02:08:20 GMT 2022
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PiePlot3D_ESTest extends PiePlot3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot3D0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2218, 656, (double) 10, 2.0, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.location(0, 1);
      PlotState plotState0 = new PlotState();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      piePlot3D0.draw(graphics2D0, rectangle2D_Double0, point0, plotState0, plotRenderingInfo0);
      assertFalse(piePlot3D0.getDarkerSides());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D(defaultKeyedValuesDataset0);
      assertFalse(piePlot3D0.getDarkerSides());
      
      piePlot3D0.setDarkerSides(true);
      boolean boolean0 = piePlot3D0.getDarkerSides();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1.0F, 1.0F, 10, 1.0F);
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      Area area0 = new Area();
      Color color0 = Color.black;
      BasicStroke basicStroke0 = (BasicStroke)WaferMapPlot.DEFAULT_GRIDLINE_STROKE;
      // Undeclared exception!
      try { 
        piePlot3D0.drawSide((Graphics2D) null, rectangle2D_Float0, arc2D_Float0, area0, area0, color0, color0, basicStroke0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.PiePlot3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot3D0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 850, 90.0, (double) 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      PlotState plotState0 = new PlotState();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        piePlot3D0.draw(graphics2D0, (Rectangle2D) null, point2D_Double0, plotState0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.getDarkerSides();
      assertFalse(piePlot3D0.isCircular());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      PiePlot3D piePlot3D1 = new PiePlot3D();
      piePlot3D1.setDarkerSides(true);
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertTrue(piePlot3D1.getDarkerSides());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      PiePlot3D piePlot3D1 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertTrue(boolean0);
      assertFalse(piePlot3D1.getDarkerSides());
      assertEquals(0.12, piePlot3D1.getDepthFactor(), 0.01);
      assertFalse(piePlot3D1.isCircular());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D(defaultKeyedValuesDataset0);
      boolean boolean0 = defaultKeyedValuesDataset0.hasListener(piePlot3D0);
      assertFalse(piePlot3D0.isCircular());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertTrue(boolean0);
      assertFalse(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot3D0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true, true, true, false, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle0, 0.5F, 600, 0);
      Area area0 = new Area(piePlot3D0.DEFAULT_LEGEND_ITEM_BOX);
      PolarPlot polarPlot0 = new PolarPlot();
      Paint paint0 = polarPlot0.getAngleGridlinePaint();
      piePlot3D0.drawSide(graphics2D0, rectangle0, arc2D_Float0, area0, area0, polarPlot0.DEFAULT_GRIDLINE_PAINT, paint0, polarPlot0.DEFAULT_GRIDLINE_STROKE, false, true);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot3D0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 10, 2.9660421570688262, chartRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(1);
      Area area0 = new Area(rectangle2D_Float0);
      piePlot3D0.drawSide(graphics2D0, rectangle2D_Float0, arc2D_Float0, area0, area0, piePlot3D0.DEFAULT_LABEL_SHADOW_PAINT, piePlot3D0.DEFAULT_OUTLINE_PAINT, piePlot3D0.DEFAULT_OUTLINE_STROKE, true, true);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      JFreeChart jFreeChart0 = new JFreeChart("V q\u000Bc?) Y~ 3CHq", piePlot3D0.DEFAULT_LABEL_FONT, piePlot3D0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2674, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false);
      Rectangle rectangle0 = chartPanel0.getBounds();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, 0, 10, 0);
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle2D_Double0, 3192.3706F, (-257.88F), 0);
      Area area0 = new Area(rectangle0);
      PolarPlot polarPlot0 = new PolarPlot();
      piePlot3D0.drawSide(graphics2D0, rectangle0, arc2D_Float0, area0, area0, polarPlot0.DEFAULT_OUTLINE_PAINT, polarPlot0.DEFAULT_BACKGROUND_PAINT, polarPlot0.DEFAULT_GRIDLINE_STROKE, true, false);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      JFreeChart jFreeChart0 = new JFreeChart("V q\u000Bc?) Y~ 3CHq", piePlot3D0.DEFAULT_LABEL_FONT, piePlot3D0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2674, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true);
      Rectangle rectangle0 = chartPanel0.getBounds();
      Rectangle2D rectangle2D0 = chartPanel0.getScreenDataArea(10, 1059079380);
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle2D0, 3192.3706F, (-257.88F), 0);
      Area area0 = new Area(rectangle0);
      PolarPlot polarPlot0 = new PolarPlot();
      piePlot3D0.drawSide(graphics2D0, rectangle0, arc2D_Float0, area0, area0, jFreeChart0.DEFAULT_BACKGROUND_PAINT, polarPlot0.DEFAULT_OUTLINE_PAINT, polarPlot0.DEFAULT_GRIDLINE_STROKE, false, true);
      assertFalse(piePlot3D0.isCircular());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      JFreeChart jFreeChart0 = new JFreeChart("V q\u000Bc?) Y~ 3CHq", piePlot3D0.DEFAULT_LABEL_FONT, piePlot3D0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2694, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false);
      Rectangle rectangle0 = chartPanel0.getBounds();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, 0, 10, 0);
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle2D_Double0, 1025.3715F, 342.2F, 0);
      Area area0 = new Area(rectangle2D_Double0);
      PolarPlot polarPlot0 = new PolarPlot();
      Color color0 = (Color)XYPlot.DEFAULT_GRIDLINE_PAINT;
      piePlot3D0.drawSide(graphics2D0, rectangle0, arc2D_Float0, area0, area0, color0, jFreeChart0.DEFAULT_BACKGROUND_PAINT, polarPlot0.DEFAULT_OUTLINE_STROKE, false, false);
      assertFalse(piePlot3D0.getDarkerSides());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot3D0);
      jFreeChart0.createBufferedImage(10, 10);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.getDarkerSides());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      
      piePlot3D0.setDepthFactor(0);
      double double0 = piePlot3D0.getDepthFactor();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.getPlotType();
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.getDarkerSides());
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      double double0 = piePlot3D0.getDepthFactor();
      assertEquals(0.12, double0, 0.01);
      assertFalse(piePlot3D0.getDarkerSides());
      assertFalse(piePlot3D0.isCircular());
  }
}
