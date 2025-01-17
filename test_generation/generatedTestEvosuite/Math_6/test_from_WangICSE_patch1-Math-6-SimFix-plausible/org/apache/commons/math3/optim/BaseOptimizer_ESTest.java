/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 05:25:45 GMT 2022
 */

package org.apache.commons.math3.optim;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.linear.SimplexSolver;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.apache.commons.math3.random.Well1024a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BaseOptimizer_ESTest extends BaseOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ConvergenceChecker<PointValuePair> convergenceChecker0 = simplexSolver0.getConvergenceChecker();
      assertNull(convergenceChecker0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OptimizationData[] optimizationDataArray0 = new OptimizationData[2];
      double[] doubleArray0 = new double[0];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) initialGuess0;
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(1);
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.optim.BaseMultivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      MaxIter maxIter0 = new MaxIter(645);
      optimizationDataArray0[3] = (OptimizationData) maxIter0;
      // Undeclared exception!
      try { 
        simplexSolver0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(convergenceChecker0).toString();
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.0, 1.0, convergenceChecker0);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      MaxEval maxEval0 = new MaxEval(20);
      optimizationDataArray0[3] = (OptimizationData) maxEval0;
      // Undeclared exception!
      try { 
        brentOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.univariate.UnivariateOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.0, 1.0, convergenceChecker0);
      int int0 = brentOptimizer0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(4.538983468118194E-9, 0.5624021291732788);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
      try { 
        brentOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(4.538983468118194E-9, 0.5624021291732788);
      Well1024a well1024a0 = new Well1024a();
      MultiStartUnivariateOptimizer multiStartUnivariateOptimizer0 = new MultiStartUnivariateOptimizer(brentOptimizer0, 16, well1024a0);
      int int0 = multiStartUnivariateOptimizer0.getMaxIterations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      int int0 = simplexSolver0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = (ConvergenceChecker<UnivariatePointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(1.0, 1.0, convergenceChecker0);
      int int0 = brentOptimizer0.getIterations();
      assertEquals(0, int0);
  }
}
