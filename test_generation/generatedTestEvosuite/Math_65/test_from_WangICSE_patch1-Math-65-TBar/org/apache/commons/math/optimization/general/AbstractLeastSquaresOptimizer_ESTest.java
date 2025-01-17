/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 06:21:05 GMT 2022
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.SimpleVectorialPointChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractLeastSquaresOptimizer_ESTest extends AbstractLeastSquaresOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[7];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((double[]) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[7];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray1, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[3];
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray1, doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch 0 != 3
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      gaussNewtonOptimizer0.rows = (-1);
      try { 
        gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no degrees of freedom (-1 measurements, 0 parameters)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (double) 100;
      doubleArray0[4] = (double) 100;
      double[][] doubleArray1 = new double[6][7];
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      levenbergMarquardtOptimizer0.jacobian = doubleArray1;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.updateResidualsAndCost();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      gaussNewtonOptimizer0.rows = (-1734);
      double double0 = gaussNewtonOptimizer0.getChiSquare();
      assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, double0, 0.01);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01);
      
      levenbergMarquardtOptimizer0.rows = (-491);
      double double0 = levenbergMarquardtOptimizer0.getRMS();
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((double[]) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[1];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn((MultivariateMatrixFunction) null).when(differentiableMultivariateVectorialFunction0).jacobian();
      double[] doubleArray0 = new double[5];
      levenbergMarquardtOptimizer0.setMaxEvaluations((-432));
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of evaluations (-432) exceeded
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setMaxEvaluations(1);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[][] doubleArray0 = new double[2][4];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[1];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray1).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch 2 != 1
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      gaussNewtonOptimizer0.setMaxIterations(1);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.updateJacobian();
      assertEquals(2, levenbergMarquardtOptimizer0.getJacobianEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      SimpleVectorialPointChecker simpleVectorialPointChecker0 = new SimpleVectorialPointChecker();
      levenbergMarquardtOptimizer0.setConvergenceChecker(simpleVectorialPointChecker0);
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (double) 100;
      double[][] doubleArray1 = new double[6][7];
      doubleArray1[3] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.updateResidualsAndCost();
      double double0 = levenbergMarquardtOptimizer0.getRMS();
      assertEquals(2, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(408.248290463863, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
      levenbergMarquardtOptimizer0.setMaxEvaluations(0);
      int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setMaxEvaluations((-1853));
      int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
      assertEquals((-1853), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
      assertEquals(0.0, levenbergMarquardtOptimizer0.getRMS(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.incrementIterationsCounter();
      int int0 = levenbergMarquardtOptimizer0.getIterations();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      int int0 = levenbergMarquardtOptimizer0.getEvaluations();
      assertEquals(1, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      VectorialConvergenceChecker vectorialConvergenceChecker0 = gaussNewtonOptimizer0.getConvergenceChecker();
      assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertNotNull(vectorialConvergenceChecker0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (double) 100;
      double[][] doubleArray1 = new double[6][7];
      doubleArray1[4] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.updateResidualsAndCost();
      double double0 = levenbergMarquardtOptimizer0.getChiSquare();
      assertEquals(1, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(1000000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.updateJacobian();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      doubleArray1[3] = doubleArray0;
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[4]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(false);
      gaussNewtonOptimizer0.cols = (-710);
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      double[] doubleArray0 = new double[0];
      gaussNewtonOptimizer0.residuals = doubleArray0;
      gaussNewtonOptimizer0.rows = 100;
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.rows = 100;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.getRMS();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.getCovariances();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((double[]) null).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      gaussNewtonOptimizer0.rows = 100;
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.getChiSquare();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray1[4], doubleArray1[4], doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch 6 != 7
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[5][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double[][]) null).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[1];
      try { 
        levenbergMarquardtOptimizer0.optimize((DifferentiableMultivariateVectorialFunction) null, doubleArray0, doubleArray1, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch 6 != 1
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      try { 
        levenbergMarquardtOptimizer0.guessParametersErrors();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      gaussNewtonOptimizer0.rows = 100;
      // Undeclared exception!
      try { 
        gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray1[4]);
      try { 
        levenbergMarquardtOptimizer0.getCovariances();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unable to compute covariances: singular problem
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      double[] doubleArray2 = new double[2];
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn((Object) doubleArray0, (Object) doubleArray2).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      try { 
        levenbergMarquardtOptimizer0.updateResidualsAndCost();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch 2 != 6
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][7];
      MultivariateMatrixFunction multivariateMatrixFunction0 = mock(MultivariateMatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray1, (Object) doubleArray1).when(multivariateMatrixFunction0).value(any(double[].class));
      DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction0 = mock(DifferentiableMultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(multivariateMatrixFunction0).when(differentiableMultivariateVectorialFunction0).jacobian();
      doReturn(doubleArray0).when(differentiableMultivariateVectorialFunction0).value(any(double[].class));
      levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction0, doubleArray0, doubleArray0, doubleArray0);
      levenbergMarquardtOptimizer0.rows = 417;
      try { 
        levenbergMarquardtOptimizer0.getCovariances();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch 6 != 417
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.setMaxIterations((-994));
      try { 
        levenbergMarquardtOptimizer0.incrementIterationsCounter();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (-994) exceeded
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      levenbergMarquardtOptimizer0.getConvergenceChecker();
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, int0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(true);
      int int0 = gaussNewtonOptimizer0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getIterations();
      assertEquals(Integer.MAX_VALUE, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Integer.MAX_VALUE, int0);
  }
}
