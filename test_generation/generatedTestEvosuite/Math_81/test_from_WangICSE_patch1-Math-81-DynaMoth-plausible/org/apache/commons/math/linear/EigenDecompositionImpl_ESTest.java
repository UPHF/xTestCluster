/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 19:03:18 GMT 2022
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 52;
      doubleArray0[2] = (double) 20;
      doubleArray0[3] = (double) 20;
      doubleArray0[4] = (double) 52;
      doubleArray0[5] = (double) 20;
      double[] doubleArray1 = new double[8];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[4] = (-90974.86095867545);
      doubleArray1[5] = (-90974.86095867545);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2075.56));
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(9, doubleArray0.length);
      assertEquals(8, doubleArray1.length);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, 52.0, 20.0, 20.0, 52.0, 20.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-90974.86095867545), (-90974.86095867545), 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 52;
      doubleArray0[1] = (double) 52;
      doubleArray0[2] = (double) 20;
      doubleArray0[3] = (double) 20;
      doubleArray0[5] = (double) 20;
      doubleArray0[6] = (double) 52;
      doubleArray0[7] = (double) 20;
      doubleArray0[8] = (-90974.86095867545);
      double[] doubleArray1 = new double[8];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[0] = (-90974.86095867545);
      doubleArray1[4] = (-90974.86095867545);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2075.56));
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(9, doubleArray0.length);
      assertEquals(8, doubleArray1.length);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {52.0, 52.0, 20.0, 20.0, 0.0, 20.0, 52.0, 20.0, (-90974.86095867545)}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {(-90974.86095867545), 0.0, 0.0, 0.0, (-90974.86095867545), 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(8.469625729787923E23, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-1);
      doubleArray0[1] = (double) (-1);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      assertNotNull(arrayRealVector0);
      assertEquals(3, doubleArray0.length);
      assertArrayEquals(new double[] {(-1.0), (-1.0), 0.0}, doubleArray0, 0.01);
      assertEquals(4.0, arrayRealVector0.getLInfNorm(), 0.01);
      assertFalse(arrayRealVector0.isNaN());
      assertEquals(1.4142135623730951, arrayRealVector0.getNorm(), 0.01);
      assertFalse(arrayRealVector0.isInfinite());
      assertEquals(3, arrayRealVector0.getDimension());
      assertEquals(2.0, arrayRealVector0.getL1Norm(), 0.01);
      
      RealMatrix realMatrix0 = arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      assertNotNull(realMatrix0);
      assertEquals(3, doubleArray0.length);
      assertArrayEquals(new double[] {(-1.0), (-1.0), 0.0}, doubleArray0, 0.01);
      assertEquals(4.0, arrayRealVector0.getLInfNorm(), 0.01);
      assertFalse(arrayRealVector0.isNaN());
      assertEquals(1.4142135623730951, arrayRealVector0.getNorm(), 0.01);
      assertFalse(arrayRealVector0.isInfinite());
      assertEquals(3, arrayRealVector0.getDimension());
      assertEquals(2.0, arrayRealVector0.getL1Norm(), 0.01);
      assertEquals(3, realMatrix0.getColumnDimension());
      assertEquals(3, realMatrix0.getRowDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(realMatrix0, 4427.813423995577);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(3, doubleArray0.length);
      assertArrayEquals(new double[] {(-1.0), (-1.0), 0.0}, doubleArray0, 0.01);
      assertEquals(4.0, arrayRealVector0.getLInfNorm(), 0.01);
      assertFalse(arrayRealVector0.isNaN());
      assertEquals(1.4142135623730951, arrayRealVector0.getNorm(), 0.01);
      assertFalse(arrayRealVector0.isInfinite());
      assertEquals(3, arrayRealVector0.getDimension());
      assertEquals(2.0, arrayRealVector0.getL1Norm(), 0.01);
      assertEquals(3, realMatrix0.getColumnDimension());
      assertEquals(3, realMatrix0.getRowDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      RealVector realVector0 = eigenDecompositionImpl0.getEigenvector(7);
      assertNotNull(realVector0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(Double.NaN, realVector0.getLInfNorm(), 0.01);
      assertFalse(realVector0.isInfinite());
      assertTrue(realVector0.isNaN());
      assertEquals(Double.NaN, realVector0.getNorm(), 0.01);
      assertEquals(20, realVector0.getDimension());
      assertEquals(Double.NaN, realVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(39, 39);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(39, blockRealMatrix0.getRowDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      // Undeclared exception!
      eigenDecompositionImpl0.getVT();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(39, 39);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 52);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      // Undeclared exception!
      eigenDecompositionImpl0.getV();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(39, 39);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      // Undeclared exception!
      eigenDecompositionImpl0.getSolver();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(39, 39);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      try { 
        eigenDecompositionImpl0.getImagEigenvalue(39);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 39
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, (double[]) null, (-2190.3));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(107, 45);
      assertNotNull(openMapRealMatrix0);
      assertEquals(45, openMapRealMatrix0.getColumnDimension());
      assertEquals(107, openMapRealMatrix0.getRowDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(openMapRealMatrix0, Double.NaN);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // a 107x45 matrix was provided instead of a square matrix
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, Double.NaN);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 55);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(55, blockRealMatrix0.getColumnDimension());
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no entry at indices (20, 0) in a 20x55 matrix
         //
         verifyException("org.apache.commons.math.linear.BlockRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 768.196189205598);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(0, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(0, array2DRowRealMatrix0.getRowDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(array2DRowRealMatrix0, 38076.16804479897);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.TriDiagonalTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[0] = (-90974.86095867545);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2075.56));
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(9, doubleArray0.length);
      assertEquals(8, doubleArray1.length);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {(-90974.86095867545), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      assertNotNull(realMatrix0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertEquals(9, doubleArray0.length);
      assertEquals(8, doubleArray1.length);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {(-90974.86095867545), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(9, realMatrix0.getColumnDimension());
      assertEquals(9, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(45, 45);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(45, blockRealMatrix0.getColumnDimension());
      assertEquals(45, blockRealMatrix0.getRowDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = (double) 20;
      doubleArray0[6] = (double) 52;
      doubleArray0[7] = (double) 20;
      double[] doubleArray1 = new double[8];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[4] = (-90974.86095867545);
      doubleArray1[7] = (double) 20;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2075.56));
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(9, doubleArray0.length);
      assertEquals(8, doubleArray1.length);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 20.0, 52.0, 20.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-90974.86095867545), 0.0, 0.0, 20.0}, doubleArray1, 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[4] = (-90974.86095867545);
      doubleArray1[5] = (-90974.86095867545);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 20);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(9, doubleArray0.length);
      assertEquals(8, doubleArray1.length);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-90974.86095867545), (-90974.86095867545), 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 52;
      doubleArray0[1] = (double) 52;
      double[] doubleArray1 = new double[8];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2075.56));
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(9, doubleArray0.length);
      assertEquals(8, doubleArray1.length);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {52.0, 52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 52);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      assertNotNull(realMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(20, realMatrix0.getColumnDimension());
      assertEquals(20, realMatrix0.getRowDimension());
      
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertNotNull(decompositionSolver0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(39, 39);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(39, 39);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(39, blockRealMatrix0.getRowDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 52);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(39, blockRealMatrix0.getColumnDimension());
      assertEquals(39, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      // Undeclared exception!
      eigenDecompositionImpl0.getEigenvector(52);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      assertNotNull(blockRealMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      assertNotNull(eigenDecompositionImpl0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      assertNotNull(realMatrix0);
      assertEquals(52, BlockRealMatrix.BLOCK_SIZE);
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
      assertEquals(20, blockRealMatrix0.getRowDimension());
      assertEquals(20, blockRealMatrix0.getColumnDimension());
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(20, realMatrix0.getColumnDimension());
      assertEquals(20, realMatrix0.getRowDimension());
      
      try { 
        eigenDecompositionImpl0.getEigenvector((-433));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -433
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      RealMatrix realMatrix1 = eigenDecompositionImpl0.getVT();
      assertNotSame(realMatrix1, realMatrix0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      eigenDecompositionImpl0.getVT();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getVT();
      assertEquals(20, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      eigenDecompositionImpl0.getD();
      eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      eigenDecompositionImpl0.getSolver();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, (-0.10833480088585702));
      eigenDecompositionImpl0.getV();
      RealMatrix realMatrix0 = eigenDecompositionImpl0.getV();
      assertEquals(20, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(66, 66);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      eigenDecompositionImpl0.getRealEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(39, 39);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      eigenDecompositionImpl0.getImagEigenvalue(17);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(39, 39);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(20, 20);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(blockRealMatrix0, 0.0);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue(20);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }
}
