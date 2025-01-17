/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 23:58:01 GMT 2022
 */

package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CMAESOptimizer_ESTest extends CMAESOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-1));
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, (-852), 0, unitSphereRandomVectorGenerator0);
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = (double) (-809);
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray2, doubleArray1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = (double) 30000;
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize((-2140345899), (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,140,345,899) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 30000;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 30000, 14, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray2 = new double[5];
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(0, microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(1842, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray1);
      PointValuePair pointValuePair1 = cMAESOptimizer0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 30000, 0, unitSphereRandomVectorGenerator0);
      microsphereInterpolatingFunction0.value(doubleArray1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(0);
      cMAESOptimizer1.optimize(3053, microsphereInterpolatingFunction0, goalType0, doubleArray1);
      cMAESOptimizer1.doOptimize();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(30000, 0);
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(117, doubleArray1, 30000, 117, true, 10, 0, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR, true, simplePointChecker0);
      GoalType goalType0 = GoalType.MINIMIZE;
      cMAESOptimizer1.optimize(117, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray1);
      // Undeclared exception!
      try { 
        cMAESOptimizer1.doOptimize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (117) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      // Undeclared exception!
      try { 
        cMAESOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(0, doubleArray1, 85, 117, false, 432, 117, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR, true);
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer1.optimize(85, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray0[0]);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer((-2251), doubleArray1, 5175, 5175, false, (-374), 30000, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR, true);
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer1.optimize(5175, microsphereInterpolatingFunction0, goalType0, doubleArray1);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 30000, 0, unitSphereRandomVectorGenerator0);
      double double0 = microsphereInterpolatingFunction0.value(doubleArray1);
      microsphereInterpolatingFunction0.value(doubleArray1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      cMAESOptimizer0.optimize(Integer.MAX_VALUE, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray1);
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(24, doubleArray1, 67, (-494.0), true, 1, 12, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR, true);
      cMAESOptimizer1.optimize(909, microsphereInterpolatingFunction0, goalType0, doubleArray1);
      cMAESOptimizer0.getStatisticsSigmaHistory();
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertFalse(list0.contains(double0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 30000;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(0.0, 0);
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(890, doubleArray1, 2207, 0, true, (-2492), 0, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR, true, simplePointChecker0);
      // Undeclared exception!
      try { 
        cMAESOptimizer1.optimize(0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 30,000 out of [0, 0] range
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(30000);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 30000, 0, unitSphereRandomVectorGenerator0);
      double[] doubleArray2 = new double[6];
      doubleArray2[5] = (double) (-2140340347);
      Well44497b well44497b0 = new Well44497b(32);
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(1568, doubleArray2, 30000, 1.7976931348623157E308, true, 85, 2, well44497b0, false);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(32, microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,140,340,347 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      double[] doubleArray2 = unitSphereRandomVectorGenerator0.nextVector();
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>(30000, (-1.7976931348623157E308));
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(122, doubleArray1, 30000, 0.0, true, 10, 0, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR, true, simplePointChecker0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer1.optimize((-1586), microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, (-8), 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(1289, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, (double[]) null);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 30000, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer0.optimize(1410, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, (double[]) null, doubleArray1);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
         verifyException("org.apache.commons.math3.optimization.direct.CMAESOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0, cMAESOptimizer0.DEFAULT_RANDOMGENERATOR);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 12, 0, unitSphereRandomVectorGenerator0);
      GoalType goalType0 = GoalType.MINIMIZE;
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(0);
      PointValuePair pointValuePair0 = cMAESOptimizer1.optimize(12, microsphereInterpolatingFunction0, goalType0, doubleArray1);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, 0, 0, unitSphereRandomVectorGenerator0);
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(0, doubleArray1, 85, (-3134), false, 432, (-3134), cMAESOptimizer0.DEFAULT_RANDOMGENERATOR, true);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try { 
        cMAESOptimizer1.optimize(85, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer((-3414), doubleArray0);
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertTrue(list0.isEmpty());
  }
}
