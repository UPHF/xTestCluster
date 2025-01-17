/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 14:46:46 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.JqueryCodingConvention;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypeInference;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeInference_ESTest extends TypeInference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>((Node) null, true, true);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      JqueryCodingConvention jqueryCodingConvention0 = new JqueryCodingConvention(closureCodingConvention0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(jqueryCodingConvention0, jSTypeRegistry0);
      TypeInference typeInference0 = null;
      try {
        typeInference0 = new TypeInference(compiler0, controlFlowGraph0, closureReverseAbstractInterpreter0, (Scope) null, (Map<String, CodingConvention.AssertionFunctionSpec>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.EMPTY;
      // Undeclared exception!
      try { 
        TypeInference.getBooleanOutcomes(booleanLiteralSet0, (BooleanLiteralSet) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeInference", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.BOTH;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, false);
      assertEquals(BooleanLiteralSet.BOTH, booleanLiteralSet1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.EMPTY;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, true);
      assertSame(booleanLiteralSet0, booleanLiteralSet1);
  }
}
