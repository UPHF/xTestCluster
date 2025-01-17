/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 01:44:08 GMT 2022
 */

package org.apache.commons.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.integration.RombergIntegrator;
import org.apache.commons.math.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math.analysis.integration.TrapezoidIntegrator;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConvergingAlgorithmImpl_ESTest extends ConvergingAlgorithmImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      assertEquals(1.0E-6, trapezoidIntegrator0.getRelativeAccuracy(), 0.01);
      
      trapezoidIntegrator0.resetRelativeAccuracy();
      assertEquals(0.0, trapezoidIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      trapezoidIntegrator0.setMaximalIterationCount((-2394));
      assertEquals((-2394), trapezoidIntegrator0.getMaximalIterationCount());
      
      trapezoidIntegrator0.resetMaximalIterationCount();
      assertEquals(1.0E-6, trapezoidIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setAbsoluteAccuracy(9.7390133);
      assertEquals(9.7390133, rombergIntegrator0.getAbsoluteAccuracy(), 0.01);
      
      rombergIntegrator0.resetAbsoluteAccuracy();
      assertEquals(1.0E-6, rombergIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(Double.NaN);
      assertEquals(Double.NaN, brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, brentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setRelativeAccuracy((-1.0));
      assertEquals((-1.0), mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      simpsonIntegrator0.setMaximalIterationCount(0);
      assertEquals(0, simpsonIntegrator0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setAbsoluteAccuracy(1.0E-6);
      assertEquals(0.0, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(0, mullerSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.resetRelativeAccuracy();
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(0.0, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.resetMaximalIterationCount();
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, mullerSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setRelativeAccuracy(380.6493868);
      double double0 = mullerSolver0.getRelativeAccuracy();
      assertEquals(380.6493868, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setRelativeAccuracy((-2140.0429224242));
      double double0 = mullerSolver0.getRelativeAccuracy();
      assertEquals((-2140.0429224242), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0, 0);
      int int0 = brentSolver0.getMaximalIterationCount();
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, brentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, int0);
      assertEquals(0.0, brentSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      rombergIntegrator0.integrate((UnivariateRealFunction) polynomialFunction0, 0.0, 32.0);
      int int0 = rombergIntegrator0.getIterationCount();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0);
      double double0 = brentSolver0.getAbsoluteAccuracy();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0.0, brentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      trapezoidIntegrator0.setAbsoluteAccuracy((-2373.4955765467544));
      double double0 = trapezoidIntegrator0.getAbsoluteAccuracy();
      assertEquals((-2373.4955765467544), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      double double0 = mullerSolver0.getRelativeAccuracy();
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setMaximalIterationCount((-71));
      int int0 = rombergIntegrator0.getMaximalIterationCount();
      assertEquals((-71), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      int int0 = rombergIntegrator0.getIterationCount();
      assertEquals(0, int0);
      assertEquals(1.0E-6, rombergIntegrator0.getRelativeAccuracy(), 0.01);
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
      assertEquals(1.0E-15, rombergIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      double double0 = mullerSolver0.getAbsoluteAccuracy();
      assertEquals(0.0, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(1.0E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      int int0 = rombergIntegrator0.getMaximalIterationCount();
      assertEquals(32, int0);
      assertEquals(1.0E-15, rombergIntegrator0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-6, rombergIntegrator0.getRelativeAccuracy(), 0.01);
      assertEquals(0, rombergIntegrator0.getIterationCount());
  }
}
