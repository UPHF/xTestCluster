/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 23:00:58 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MinimizeExitPoints;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MinimizeExitPoints_ESTest extends MinimizeExitPoints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = Node.newString((-95), "h'ZxD\".1|[&?>pE@%", (-1072), 40);
      minimizeExitPoints0.tryMinimizeExits(node0, (-95), "h'ZxD\".1|[&?>pE@%");
      assertFalse(node0.isRegExp());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = Node.newString("");
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      minimizeExitPoints0.tryMinimizeExits(node0, 47, "");
      assertFalse(node0.isNew());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints((AbstractCompiler) null);
      Node node0 = new Node(0);
      Node node1 = new Node(4095, node0, node0, node0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.process(node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = Node.newString("");
      minimizeExitPoints0.process(node0, node0);
      assertEquals(0, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.visit((NodeTraversal) null, (Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MinimizeExitPoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.tryMinimizeExits((Node) null, 0, "com.google.javascript.jscomp.MinimizeExitPoints");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MinimizeExitPoints", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.process((Node) null, (Node) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = Node.newString((-95), "h'ZxD\".1|[&?>pE@%", (-1072), 40);
      minimizeExitPoints0.tryMinimizeExits(node0, (-2404), "com.google.javascript.jscomp.MinimizeExitPoints");
      assertEquals(50, Node.FREE_CALL);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Node node0 = Node.newString("");
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      node0.addChildToFront(node0);
      // Undeclared exception!
      try { 
        minimizeExitPoints0.tryMinimizeExits(node0, 40, "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid attempt to remove node: STRING  of STRING 
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, minimizeExitPoints0);
      Node node0 = new Node(0);
      minimizeExitPoints0.visit(nodeTraversal0, node0, (Node) null);
      assertEquals(0, node0.getType());
  }
}
