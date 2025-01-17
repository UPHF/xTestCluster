/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 15:19:37 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.AstChangeProxy;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AstChangeProxy_ESTest extends AstChangeProxy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      ImmutableList<Node> immutableList0 = ImmutableList.of(node0, node0, node0, node0, node0, node0, node0, node0);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node0, node0, immutableList0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString(126, "com.google.common.base.CharMatcher$2", 149, (-1844));
      Node node1 = new Node(126, node0, node0, node0);
      Node node2 = Node.newString(1, "", 42, 4);
      ImmutableList<Node> immutableList0 = ImmutableList.of(node1, node2);
      astChangeProxy0.replaceWith(node1, node0, immutableList0);
      assertEquals((-1), node2.getLineno());
      assertTrue(node1.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString("");
      Node node1 = new Node(0, node0, node0, node0, 38, 42);
      astChangeProxy0.removeChild(node1, node0);
      assertEquals(12, Node.COLUMN_BITS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node(126);
      Node node1 = new Node(126, node0, node0, node0, node0, (-461), 4095);
      PriorityQueue<Node> priorityQueue0 = new PriorityQueue<Node>();
      ImmutableList<Node> immutableList0 = ImmutableList.copyOf((Iterable<? extends Node>) priorityQueue0);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node1, node1, immutableList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith((Node) null, (Node) null, (List<Node>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // \"replacements\" is null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString("");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node1 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
      Node node2 = Node.newNumber(1.0, 153, 38);
      Node node3 = new Node(56, node0, node2, node1, node2);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node3, node1, node3);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString(126, "com.google.common.base.CharMatcher$2", 126, (-1844));
      Node node1 = new Node(1, node0, node0, 47, 322);
      astChangeProxy0.registerListener((AstChangeProxy.ChangeListener) null);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node1, node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AstChangeProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newNumber((double) (-705));
      Node node1 = new Node((-705), node0, node0, node0, node0);
      // Undeclared exception!
      try { 
        astChangeProxy0.removeChild(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString(126, "com.google.common.base.CharMatcher$2", 149, (-1844));
      Node node1 = Node.newString(1, "", 42, 4);
      ImmutableList<Node> immutableList0 = ImmutableList.of(node0, node1);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node0, node0, immutableList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString(126, "com.google.common.base.CharMatcher$2", 149, (-1844));
      Node node1 = new Node(126, node0, node0, node0);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node0, node0, node1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The existing child node of the parent should not be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node(4071);
      ImmutableList<Node> immutableList0 = ImmutableList.of();
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node0, node0, immutableList0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node(132);
      ImmutableList<Node> immutableList0 = ImmutableList.of(node0, node0, node0, node0);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node0, node0, immutableList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The existing child node of the parent should not be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString(125, "DATA_FLOW");
      ImmutableList<Node> immutableList0 = ImmutableList.of();
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node0, node0, immutableList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node((-862048933));
      Node node1 = new Node(31, node0, 32, 36);
      Node node2 = new Node(57, node1, 16, 8);
      astChangeProxy0.replaceWith(node1, node0, node2);
      ImmutableList<Node> immutableList0 = ImmutableList.of(node2);
      // Undeclared exception!
      astChangeProxy0.replaceWith(node1, node2, immutableList0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node((-862048933));
      astChangeProxy0.replaceWith(node0, node0, node0);
      assertEquals(1, Node.FLAG_GLOBAL_STATE_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      astChangeProxy0.registerListener((AstChangeProxy.ChangeListener) null);
      Node node0 = Node.newString("jscomp_throw_param");
      Node node1 = new Node(2, node0, 12, 4095);
      // Undeclared exception!
      try { 
        astChangeProxy0.removeChild(node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AstChangeProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      astChangeProxy0.unregisterListener((AstChangeProxy.ChangeListener) null);
  }
}
