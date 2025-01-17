/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 16:32:33 GMT 2022
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("Lsun.misc.Launcher$AppClassLoader");
      assertEquals("Launcher.AppClassLoader", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("java.lang");
      assertEquals("java", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("long", false);
      assertTrue(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("long[]", true);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("java.util.prefs.PreferencesFactory", false);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("java.util.prefs.PreferencesFactory");
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "[[Z", true);
      assertTrue(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "int");
      assertEquals(1041, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "java.util.prefs.PreferencesFactory");
      assertEquals("interface java.util.prefs.PreferencesFactory", class0.toString());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "long[]");
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("byte");
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortCanonicalName("[O.O");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        ClassUtils.getPublicMethod(class0, (String) null, classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Class<String> class0 = String.class;
      try { 
        ClassUtils.getPublicMethod(class0, "L", (Class<?>[]) null);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        ClassUtils.getClass(classLoader0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      try { 
        ClassUtils.getClass("className must not be null.", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "int", true);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "E[", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Class<?> class0 = ClassUtils.primitiveToWrapper((Class<?>) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertFalse(class1.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Class<Short> class0 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, (Class<?>) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      Class<Byte>[] classArray1 = (Class<Byte>[]) Array.newInstance(Class.class, 9);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("org.apache.commons.lang.ClassUtils");
      assertEquals("org.apache.commons.lang", string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Class<Short> class0 = Short.class;
      String string0 = ClassUtils.getPackageName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("org.apache.commons.lang.ArrayUtils");
      assertEquals("ArrayUtils", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Class<Float> class0 = Float.class;
      String string0 = ClassUtils.getShortClassName(class0);
      assertEquals("Float", string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[LGV+");
      assertEquals("GV+[]", string0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      String string0 = ClassUtils.getPackageCanonicalName((Object) classUtils0, ".");
      assertEquals("org.apache.commons.lang", string0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("short", string0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "java.vm.version");
      assertEquals("java.vm.version", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) "[", "[");
      assertEquals("String", string0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "Z";
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertEquals(1, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertEquals(0, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      // Undeclared exception!
      try { 
        ClassUtils.toClass(classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("long[]");
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertEquals("class java.lang.Float", class1.toString());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(1, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("byte");
      Class<Float> class1 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Byte> class1 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Class<Boolean> class1 = Boolean.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<String> class1 = String.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Class<Double> class0 = Double.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Class<Short> class0 = Short.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
      assertTrue(list2.equals((Object)list0));
      assertNotNull(list2);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Class<Object> class0 = Object.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertTrue(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "[java.lang.String");
      assertEquals("[java.lang.String", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) "", "");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("$");
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "NK(QR2DM[]");
      assertEquals("NK(QR2DM[]", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      String string0 = ClassUtils.getShortClassName((Object) classUtils0, "$");
      assertEquals("ClassUtils", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      try { 
        ClassUtils.getClass("[[[]");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getPackageCanonicalName("[wZ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "[[");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[");
      assertEquals("[]", string0);
  }
}
