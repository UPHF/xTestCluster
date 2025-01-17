/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 00:01:08 GMT 2022
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Variance_ESTest extends Variance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0;
      double[] doubleArray1 = new double[7];
      double double0 = variance0.evaluate(doubleArray1, doubleArray0, 0, 5);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.031;
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(9L, variance0.getN());
      assertEquals(9.491358024691358E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      secondMoment0.n = (-5034868814120038111L);
      double double0 = variance0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      Variance.copy(variance0, variance0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance(false);
      boolean boolean0 = variance0.isBiasCorrected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 581.7863679343138;
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(9L, variance0.getN());
      assertEquals(37608.375323800086, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      variance0.incrementAll(doubleArray0);
      long long0 = variance0.getN();
      assertEquals(0.0, variance0.getResult(), 0.01);
      assertEquals(7L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0708593250394448E-7;
      doubleArray0[1] = (double) 1;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 1.0708593250394448E-7, 1, 3);
      assertEquals(0.9999996786047155, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1900.622;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 279.7443154);
      assertEquals(5.020337290293805E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1900.622;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 4443.67704498);
      assertEquals((-1.004067458058761E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0708593250394448E-7;
      doubleArray0[1] = (double) 1;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(0.9999996781645383, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0708593250394448E-7;
      doubleArray0[2] = 0.16666666666666666;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals((-3.5695246617275977E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      double double0 = variance0.evaluate(doubleArray0, 1, 3);
      assertEquals(0.33333333333333337, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = (-3268.1);
      Variance variance0 = new Variance(secondMoment0);
      double double0 = variance0.evaluate(doubleArray0, 5030.51832, 4, 4);
      assertEquals(2670119.4025000036, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0;
      double double0 = variance0.evaluate(doubleArray0, 0.0);
      assertEquals(0.12244897959183675, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      double double0 = variance0.evaluate(doubleArray0, 950.936736571131);
      assertEquals((-3.991382462637765E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      variance0.incrementAll(doubleArray0);
      variance0.copy();
      assertEquals(7L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      secondMoment0.n = (-1736L);
      Variance variance1 = variance0.copy();
      assertEquals((-1736L), variance1.getN());
      assertTrue(variance1.isBiasCorrected());
      assertNotSame(variance1, variance0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.moment = null;
      // Undeclared exception!
      try { 
        variance0.increment((-1767.072301495101));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      // Undeclared exception!
      try { 
        variance0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      // Undeclared exception!
      try { 
        variance0.getN();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray1 = new double[1];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray1, doubleArray0, 1, 248);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 1
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, (double[]) null, 2146517531, 1858);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, (double[]) null, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, 2147087478, 396);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, (double) 1, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray1, doubleArray0, 1.0708593250394448E-7, 1695, (-1525));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, (double[]) null, (-342.873281), 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, doubleArray0, (-2334.0702029928266), 746, 746);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, (double) 1, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, 1900.622);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[6];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray1, 1900.622);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 3
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, (double[]) null, 1354.06);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[1];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 4
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-1)
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, 4, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, 2619, 2619);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, 3443.960671081, (-484), 204);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // start position (-484)
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, 0.0, 272, 272);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // subarray ends after array end
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, (-1300.604784), (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null, 1810.523821);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.moment = null;
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      // Undeclared exception!
      try { 
        Variance.copy(variance0, variance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      // Undeclared exception!
      try { 
        variance0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Variance variance0 = null;
      try {
        variance0 = new Variance((Variance) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      Variance variance1 = null;
      try {
        variance1 = new Variance(variance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 2.7553817452272217E-6;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 2.7553817452272217E-6, 1, 1);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      double double0 = variance0.evaluate(doubleArray0, (double) 0, 0, 4);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      double double0 = variance0.evaluate(doubleArray0, 799.443250477686, 1, 1);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0, (-1.004067458058761E-9), 2147005446, 2147005446);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      double double0 = variance0.evaluate(doubleArray0, (-1.0), 1, 0);
      assertEquals(Double.NaN, double0, 0.01);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 0, 1);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[3];
      double double0 = variance0.evaluate(doubleArray0, 1, 1);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[9];
      double double0 = variance0.evaluate(doubleArray0, 0, 0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(true, secondMoment0);
      variance0.clear();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Variance variance0 = new Variance();
      assertTrue(variance0.isBiasCorrected());
      
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 1;
      variance0.setBiasCorrected(false);
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 0.0, 1, 3);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1900.622;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 2.0);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Variance variance0 = new Variance();
      assertTrue(variance0.isBiasCorrected());
      
      double[] doubleArray0 = new double[4];
      variance0.setBiasCorrected(false);
      double double0 = variance0.evaluate(doubleArray0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0, 5030.51832);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.070859E-7;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, (-2146437945), (-2146437945));
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[9];
      variance0.incrementAll(doubleArray0);
      double double0 = variance0.getResult();
      assertEquals(9L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment(380.4495085624);
      variance0.increment(380.4495085624);
      double double0 = variance0.getResult();
      assertEquals(2L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Variance variance0 = new Variance();
      double double0 = variance0.getResult();
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.increment(277.8142);
      double double0 = variance0.getResult();
      assertEquals(1L, variance0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Variance variance0 = new Variance();
      boolean boolean0 = variance0.isBiasCorrected();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Variance variance0 = new Variance();
      Variance variance1 = new Variance(variance0);
      assertTrue(variance1.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Variance variance0 = new Variance();
      Variance variance1 = variance0.copy();
      assertTrue(variance1.isBiasCorrected());
      assertNotSame(variance1, variance0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      double[] doubleArray0 = new double[3];
      double double0 = variance0.evaluate(doubleArray0, (-2610.12830565), 2147005446, 2147005446);
      assertEquals(0.0, double0, 0.01);
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.getN();
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Variance variance0 = new Variance((SecondMoment) null);
      double[] doubleArray0 = new double[2];
      variance0.incrementAll(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Variance variance0 = new Variance();
      try { 
        Variance.copy(variance0, (Variance) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, (double[]) null, (-3162.26622));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }
}
