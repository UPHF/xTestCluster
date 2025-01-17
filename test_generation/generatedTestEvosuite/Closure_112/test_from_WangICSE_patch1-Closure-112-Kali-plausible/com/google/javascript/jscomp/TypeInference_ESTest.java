/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 15 14:45:21 GMT 2022
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypeInference;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeInference_ESTest extends TypeInference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>((Node) null, true, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      compiler0.initCompilerOptionsIfTesting();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter0 = new ClosureReverseAbstractInterpreter(googleCodingConvention0, jSTypeRegistry0);
      Scope scope0 = Scope.createLatticeBottom((Node) null);
      HashMap<String, CodingConvention.AssertionFunctionSpec> hashMap0 = new HashMap<String, CodingConvention.AssertionFunctionSpec>();
      TypeInference typeInference0 = null;
      try {
        typeInference0 = new TypeInference(compiler0, controlFlowGraph0, closureReverseAbstractInterpreter0, scope0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeInference", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.TRUE;
      // Undeclared exception!
      try { 
        TypeInference.getBooleanOutcomes((BooleanLiteralSet) null, booleanLiteralSet0, false);
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
      BooleanLiteralSet booleanLiteralSet0 = BooleanLiteralSet.EMPTY;
      BooleanLiteralSet booleanLiteralSet1 = TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet0, true);
      assertSame(booleanLiteralSet1, booleanLiteralSet0);
  }
}
