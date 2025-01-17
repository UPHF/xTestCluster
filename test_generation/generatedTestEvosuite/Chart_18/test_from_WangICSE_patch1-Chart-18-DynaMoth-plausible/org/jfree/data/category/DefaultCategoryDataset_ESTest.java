/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 13:54:25 GMT 2022
 */

package org.jfree.data.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultCategoryDataset_ESTest extends DefaultCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Millisecond millisecond0 = new Millisecond();
      defaultCategoryDataset0.setValue((-2882.7), (Comparable) millisecond0, (Comparable) integer0);
      Object object0 = defaultCategoryDataset0.clone();
      boolean boolean0 = defaultCategoryDataset0.equals(object0);
      assertEquals(2, defaultCategoryDataset0.getRowCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = new Integer((-1));
      defaultCategoryDataset0.addValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      defaultCategoryDataset0.removeRow((Comparable) integer0);
      Object object0 = defaultCategoryDataset0.clone();
      boolean boolean0 = defaultCategoryDataset0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, defaultCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Quarter quarter0 = new Quarter(date0);
      defaultKeyedValues2DDataset0.removeValue(quarter0, "");
      assertEquals(1392409281320L, quarter0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Number number0 = defaultCategoryDataset0.getValue(0, 0);
      assertEquals(300, number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      defaultCategoryDataset0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      List list0 = defaultKeyedValues2DDataset0.getRowKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      List list0 = defaultCategoryDataset0.getColumnKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultKeyedValues2DDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      defaultKeyedValues2DDataset0.removeRow(0);
      assertEquals(0, defaultKeyedValues2DDataset0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Integer integer1 = new Integer((-1));
      defaultCategoryDataset0.addValue((Number) integer1, (Comparable) integer1, (Comparable) integer1);
      Number number0 = defaultCategoryDataset0.getValue((Comparable) integer1, (Comparable) integer0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      BigInteger bigInteger0 = BigInteger.TEN;
      defaultCategoryDataset0.addValue((Number) bigInteger0, (Comparable) bigInteger0, (Comparable) bigInteger0);
      Number number0 = defaultCategoryDataset0.getValue((Comparable) bigInteger0, (Comparable) bigInteger0);
      assertEquals((byte)10, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      MockDate mockDate0 = new MockDate(1, 1, 1);
      Week week0 = new Week(mockDate0);
      jDBCCategoryDataset0.addValue((-1.0), (Comparable) week0, (Comparable) mockDate0);
      Comparable comparable0 = jDBCCategoryDataset0.getRowKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Integer integer0 = new Integer(1);
      defaultKeyedValues2DDataset0.addValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      int int0 = defaultKeyedValues2DDataset0.getRowIndex(integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Integer integer1 = new Integer((-1));
      defaultCategoryDataset0.addValue((Number) integer1, (Comparable) integer1, (Comparable) integer1);
      int int0 = defaultCategoryDataset0.getRowIndex(integer1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      int int0 = defaultCategoryDataset0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Week week0 = new Week(0, 1391);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      defaultKeyedValues2DDataset0.setValue((Number) 1, (Comparable) week0, (Comparable) week0);
      Comparable comparable0 = defaultKeyedValues2DDataset0.getColumnKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = new Integer((-1));
      defaultCategoryDataset0.addValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      int int0 = defaultCategoryDataset0.getColumnIndex(integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Integer integer1 = new Integer((-26));
      defaultCategoryDataset0.addValue((Number) integer1, (Comparable) integer1, (Comparable) integer1);
      int int0 = defaultCategoryDataset0.getColumnIndex(integer1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultKeyedValues2DDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      int int0 = defaultKeyedValues2DDataset0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Long long0 = new Long((-100L));
      // Undeclared exception!
      try { 
        defaultKeyedValues2DDataset0.setValue((Number) long0, (Comparable) long0, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.setValue(5138.3, (Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        defaultKeyedValues2DDataset0.removeRow((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.removeRow(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.removeColumn((-2941));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Year year0 = new Year();
      // Undeclared exception!
      try { 
        defaultKeyedValues2DDataset0.incrementValue(2265.0, year0, year0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised columnKey: 2014
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        defaultKeyedValues2DDataset0.incrementValue((-1), (Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getValue((-1368), (-1368));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getRowKey((-761));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getRowIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getColumnKey(1076);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1076, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getColumnIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      // Undeclared exception!
      try { 
        defaultKeyedValues2DDataset0.addValue((Number) integer0, (Comparable) null, (Comparable) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        defaultKeyedValues2DDataset0.addValue(0.0, (Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      int int0 = defaultKeyedValues2DDataset0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      int int0 = defaultCategoryDataset0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = new Integer((-1));
      defaultCategoryDataset0.addValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      DefaultCategoryDataset defaultCategoryDataset1 = (DefaultCategoryDataset)defaultCategoryDataset0.clone();
      assertTrue(defaultCategoryDataset1.equals((Object)defaultCategoryDataset0));
      
      defaultCategoryDataset1.incrementValue((-1), integer0, integer0);
      boolean boolean0 = defaultCategoryDataset1.equals(defaultCategoryDataset0);
      assertFalse(defaultCategoryDataset1.equals((Object)defaultCategoryDataset0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Integer integer1 = JLayeredPane.DRAG_LAYER;
      defaultCategoryDataset0.addValue((Number) integer1, (Comparable) integer1, (Comparable) integer1);
      DefaultCategoryDataset defaultCategoryDataset1 = (DefaultCategoryDataset)defaultCategoryDataset0.clone();
      assertTrue(defaultCategoryDataset1.equals((Object)defaultCategoryDataset0));
      
      defaultCategoryDataset1.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer1);
      boolean boolean0 = defaultCategoryDataset0.equals(defaultCategoryDataset1);
      assertFalse(defaultCategoryDataset1.equals((Object)defaultCategoryDataset0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Integer integer1 = new Integer((-26));
      defaultCategoryDataset0.addValue((Number) integer1, (Comparable) integer1, (Comparable) integer1);
      Object object0 = defaultCategoryDataset0.clone();
      boolean boolean0 = defaultCategoryDataset0.equals(object0);
      assertNotSame(object0, defaultCategoryDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      defaultKeyedValues2DDataset0.addValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset1 = (DefaultKeyedValues2DDataset)defaultKeyedValues2DDataset0.clone();
      defaultKeyedValues2DDataset1.removeColumn(0);
      boolean boolean0 = defaultKeyedValues2DDataset0.equals(defaultKeyedValues2DDataset1);
      assertEquals(1, defaultKeyedValues2DDataset0.getColumnCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      defaultKeyedValues2DDataset0.addValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      boolean boolean0 = defaultCategoryDataset0.equals(defaultKeyedValues2DDataset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      boolean boolean0 = defaultCategoryDataset0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      boolean boolean0 = defaultKeyedValues2DDataset0.equals(defaultKeyedValues2DDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      defaultCategoryDataset0.setValue((Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Integer integer1 = new Integer((-26));
      defaultCategoryDataset0.addValue((Number) integer1, (Comparable) integer1, (Comparable) integer1);
      defaultCategoryDataset0.incrementValue((-26), integer0, integer1);
      assertEquals(2, defaultCategoryDataset0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getRowKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getColumnKey((-1056));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      defaultKeyedValues2DDataset0.clear();
      assertEquals(0, defaultKeyedValues2DDataset0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      defaultCategoryDataset0.removeColumn((Comparable) integer0);
      assertEquals(0, defaultCategoryDataset0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      int int0 = defaultCategoryDataset0.getColumnIndex(integer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      int int0 = defaultCategoryDataset0.getRowIndex(integer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      MockDate mockDate0 = new MockDate(1, 1, 1);
      Week week0 = new Week(mockDate0);
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.removeRow((Comparable) week0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.removeValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        defaultKeyedValues2DDataset0.removeColumn(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.removeRow((-2296));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        defaultCategoryDataset0.getValue((Comparable) bigInteger0, (Comparable) bigInteger0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised columnKey: 10
         //
         verifyException("org.jfree.data.DefaultKeyedValues2D", e);
      }
  }
}
