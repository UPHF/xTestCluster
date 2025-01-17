/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 15:28:02 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.AstChangeProxy;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AstChangeProxy_ESTest extends AstChangeProxy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node(123);
      Node node1 = new Node(126, node0, node0, node0, node0, 1, 1);
      ImmutableList<Node> immutableList0 = ImmutableList.of(node1, node0, node0, node0, node0, node0);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node1, node0, immutableList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString(722, "=^roDr(Om");
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node0, node0, linkedList0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newNumber((double) 473);
      Node node1 = Node.newString(49, "v");
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
  public void test03()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node(123);
      node0.addChildrenToFront(node0);
      Stack<Node> stack0 = new Stack<Node>();
      stack0.add(node0);
      // Undeclared exception!
      astChangeProxy0.replaceWith(node0, node0, stack0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node(123);
      Node node1 = new Node(126, node0, node0, node0, node0, 1, 1);
      Stack<Node> stack0 = new Stack<Node>();
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node1, node1, stack0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Stack<Node> stack0 = new Stack<Node>();
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith((Node) null, (Node) null, stack0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AstChangeProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith((Node) null, (Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AstChangeProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(57, node0, node0, node0, node0);
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node0, node1, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The existing child node of the parent should not be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node(123);
      Node node1 = new Node(126, node0, node0, node0, node0, 1, 1);
      Stack<Node> stack0 = new Stack<Node>();
      stack0.add(node0);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node1, node1, stack0);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      Node node1 = new Node(126, node0, node0, 4095, 31);
      ArrayList<Node> arrayList0 = new ArrayList<Node>();
      astChangeProxy0.replaceWith(node1, node0, arrayList0);
      assertTrue(node1.hasChildren());
      assertEquals(31, node1.getCharno());
      assertTrue(node1.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = new Node(132);
      ImmutableList<Node> immutableList0 = ImmutableList.of(node0, node0, node0);
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
      Node node0 = Node.newString("[");
      Node node1 = new Node(0, node0, node0, node0, 38, 42);
      astChangeProxy0.removeChild(node1, node0);
      Node node2 = new Node(125, node1, node0, 796, (-152));
      ImmutableList<Node> immutableList0 = ImmutableList.of(node0, node2, node1, node1, node0, node0, node0, node0, node2, node0);
      // Undeclared exception!
      try { 
        astChangeProxy0.replaceWith(node2, node0, immutableList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The new child node already has a parent.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      Node node0 = Node.newString("[");
      ImmutableList<Node> immutableList0 = ImmutableList.of(node0, node0, node0, node0, node0, node0, node0, node0, node0, node0);
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
  public void test14()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(57, node0, node0, node0, node0);
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      astChangeProxy0.registerListener((AstChangeProxy.ChangeListener) null);
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
  public void test15()  throws Throwable  {
      Node node0 = Node.newString("H7");
      Node node1 = new Node(36, node0, node0, node0);
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      astChangeProxy0.replaceWith(node1, node0, node1);
      // Undeclared exception!
      try { 
        astChangeProxy0.removeChild(node1, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = Node.newString("H7");
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      astChangeProxy0.replaceWith(node0, node0, node0);
      assertFalse(node0.isReturn());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AstChangeProxy astChangeProxy0 = new AstChangeProxy();
      astChangeProxy0.unregisterListener((AstChangeProxy.ChangeListener) null);
  }
}
