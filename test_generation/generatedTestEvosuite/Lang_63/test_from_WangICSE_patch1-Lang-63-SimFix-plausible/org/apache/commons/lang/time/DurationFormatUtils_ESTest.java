/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 11 02:54:16 GMT 2022
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0, (-1));
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(durationFormatUtils_Token0);
      
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertFalse(boolean0);
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertNotNull(locale0);
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      assertNotNull(mockGregorianCalendar0);
      
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 4, (-1980));
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2589913281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2052,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=26,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[3];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M", 1160);
      assertNotNull(durationFormatUtils_Token0);
      
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, 1160, 195, 115, 537, 751, 0, 751, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(54L, true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-2419199899L));
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(0L, 2419200000L, "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(13, true, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(952L, 2332800333L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(2419200000L, (-1383L), "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[4];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("");
      assertNotNull(durationFormatUtils_Token0);
      
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      assertNotNull(durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token1;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token0;
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, durationFormatUtils_TokenArray0[2]);
      assertEquals(4, durationFormatUtils_TokenArray0.length);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@000000000400java.lang.StringBuffer@0000000005");
      assertNotNull(durationFormatUtils_Token0);
      
      Object object0 = durationFormatUtils_Token0.getValue();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null);
      assertNotNull(durationFormatUtils_Token0);
      
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      assertEquals("GMT", timeZone0.getID());
      assertNotNull(timeZone0);
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      assertNotNull(mockGregorianCalendar0);
      
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0, locale0);
      assertNotNull(mockGregorianCalendar1);
      assertTrue(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 4, (-333));
      assertEquals("GMT", timeZone0.getID());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1595017281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=199,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
      assertTrue(mockGregorianCalendar1.isLenient());
      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
      assertEquals(2, int0);
      assertFalse(mockGregorianCalendar0.equals((Object)mockGregorianCalendar1));
      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      assertNotSame(mockGregorianCalendar0, mockGregorianCalendar1);
      assertNotSame(mockGregorianCalendar1, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      assertEquals("FR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertNotNull(locale0);
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      assertNotNull(mockGregorianCalendar0);
      
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(262, 4, 4, 262, 262);
      assertNotNull(mockGregorianCalendar1);
      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar1, 4, 48);
      assertEquals("FR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar1.getFirstDayOfWeek());
      assertEquals(1, mockGregorianCalendar1.getMinimalDaysInFirstWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-53917306680000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=261,MONTH=5,WEEK_OF_YEAR=23,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=157,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=22,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertTrue(mockGregorianCalendar1.isLenient());
      assertEquals((-1), int0);
      assertFalse(mockGregorianCalendar0.equals((Object)mockGregorianCalendar1));
      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      assertNotSame(mockGregorianCalendar0, mockGregorianCalendar1);
      assertNotSame(mockGregorianCalendar1, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("s9`f");
      assertEquals(2, durationFormatUtils_TokenArray0.length);
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("");
      assertEquals(0, durationFormatUtils_TokenArray0.length);
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      assertEquals("GMT", timeZone0.getID());
      assertNotNull(timeZone0);
      
      String string0 = DurationFormatUtils.formatPeriod((-1L), (-1L), "", false, timeZone0);
      assertEquals("GMT", timeZone0.getID());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1383L), 2419200000L, "L.k[3kVI| '/X");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(97L, "", false);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1142L, "W%=Puep]/g");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-2190L), "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[3];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M", 1160);
      assertNotNull(durationFormatUtils_Token0);
      
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      StringWriter stringWriter0 = new StringWriter(115);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      assertEquals("", stringWriter0.toString());
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
      
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(stringBuffer0, 1160);
      assertEquals("", stringWriter0.toString());
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertNotNull(durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      durationFormatUtils_TokenArray0[2] = durationFormatUtils_Token1;
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 1160, 195, 115, 537, 751, 0, 751, false);
      assertEquals(3, durationFormatUtils_TokenArray0.length);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("");
      assertNotNull(durationFormatUtils_Token0);
      
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 622, 622, 622, 327, 327, 327, 3929, false);
      assertEquals(1, durationFormatUtils_TokenArray0.length);
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect((Calendar) null, (Calendar) null, 3146, 3146);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      assertNotNull(mockGregorianCalendar0);
      
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 100, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals(1, calendar0.getMinimalDaysInFirstWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertEquals(1, calendar0.getFirstDayOfWeek());
      assertTrue(calendar0.isLenient());
      assertNotNull(calendar0);
      
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(calendar0, calendar0, 1219, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1219
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(object0, 2498);
      assertNotNull(durationFormatUtils_Token0);
      
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
      
      // Undeclared exception!
      DurationFormatUtils.lexx(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.lexx((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@0000000022000java.lang.StringBuffer@0000000023");
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("S", 464);
      String string0 = durationFormatUtils_Token0.toString();
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(1169L, (-1L), string0, false, timeZone0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("S", 464);
      String string0 = durationFormatUtils_Token0.toString();
      // Undeclared exception!
      DurationFormatUtils.formatPeriod((-1L), 206L, string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration((-1L), (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1691, "_=");
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(0L, (long) 1691, (String) null, true, (TimeZone) simpleTimeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1715L, " 1 second", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1847L, "nmqfXpi", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1L, "H", true);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(4603L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("H", (-2602));
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (-2602));
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", 16);
      durationFormatUtils_Token0.increment();
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", 16);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("s", (-2537));
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("H", (-2602));
      boolean boolean0 = durationFormatUtils_Token0.equals("y");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(1L, "0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@0000000010001", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-464), "otP3|wk");
      String string0 = DurationFormatUtils.formatPeriod((-2717L), 2419200000L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, (TimeZone) simpleTimeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(115, "");
      String string0 = DurationFormatUtils.formatPeriod((-2122L), 2419200003L, " \t\r\n\b", true, (TimeZone) simpleTimeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(528, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      String string0 = DurationFormatUtils.formatPeriod((-1376L), 2419202310L, "8^iMW(vM71Z1E6Q1z-", true, (TimeZone) simpleTimeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-2602), false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod((-1383L), (-1383L), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(11L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-1805L), 2419200000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((long) 1938, "0java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@00000000121java.lang.StringBuffer@0000000013", true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (-2562));
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }
}
