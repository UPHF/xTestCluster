import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList2 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList2, nodeArray1);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList2, node4, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", nodeList1, node2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.util.List<com.google.javascript.rhino.Node> nodeList1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", nodeList1, node2, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

