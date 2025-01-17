/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 03:59:21 GMT 2022
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GrayPaintScale_ESTest extends GrayPaintScale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 394.415);
      boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
      assertFalse(boolean0);
      assertEquals(394.415, grayPaintScale1.getUpperBound(), 0.01);
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale1));
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-1287.8503973538986), 0.0);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(0.0, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals((-1287.8503973538986), grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2619.4), 0.0);
      Color color0 = (Color)grayPaintScale0.getPaint(634.8931914304);
      assertEquals((-2619.4), grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(0.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(255, color0.getRed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      Color color0 = (Color)grayPaintScale0.getPaint((-1.0));
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(135.2349319725, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2619.4), 0.0);
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-2619.4), grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2574.0), (-1.0));
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-2574.0), grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(1.0, 1335.17965667666);
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(1335.17965667666, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2619.4), 0.0);
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals((-2619.4), double0, 0.01);
      assertEquals(0.0, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 394.415);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertFalse(boolean0);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(394.415, grayPaintScale1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-3332.6549783770997), 0.0);
      boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
      assertFalse(boolean0);
      assertEquals((-3332.6549783770997), grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(0.0, grayPaintScale1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
      assertTrue(boolean0);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(0.9472015602862353, 0.9472015602862353);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      Color color0 = (Color)grayPaintScale0.getPaint(0.0);
      boolean boolean0 = grayPaintScale0.equals(color0);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(0, color0.getBlue());
      assertFalse(boolean0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
  }
}
