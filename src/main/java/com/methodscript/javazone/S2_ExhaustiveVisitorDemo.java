package com.methodscript.javazone;

import com.methodscript.PureUtilities.ExhaustiveVisitor;

/**
 *
 * @author Cailin
 */
public class S2_ExhaustiveVisitorDemo {

    public static interface MyInterface {
    }

    public static class FirstSubclass implements MyInterface {
    }

    public static class SecondSubclass implements MyInterface {
    }

    public static class ThirdSubclass implements MyInterface {
    }
    
//    public static class FourthSubclass implements MyInterface { 
//    }

    public static class MyVisitor1 extends ExhaustiveVisitor<MyInterface, Void> {

        public void visit(FirstSubclass obj) {
            System.out.println("MyVisitor1 FirstSubclass");            
        }
        
        public void visit(SecondSubclass obj) {
            System.out.println("MyVisitor1 SecondSubclass");
        }

        public void visit(ThirdSubclass obj) {
            System.out.println("MyVisitor1 ThirdSubclass");
        }
    }
    
    public static class MyVisitor2 extends ExhaustiveVisitor<MyInterface, Void> {
        public void visit(FirstSubclass obj) {
            System.out.println("MyVisitor2 FirstSubclass");            
        }
        
        public void visit(SecondSubclass obj) {
            System.out.println("MyVisitor2 SecondSubclass");
        }

        public void visit(ThirdSubclass obj) {
            System.out.println("MyVisitor2 ThirdSubclass");
        }
    }
    
    public static void main(String[] args) {
        ExhaustiveVisitor<MyInterface, Void> e = new MyVisitor1();
        MyInterface m = new FirstSubclass();
        e.visit(m);
    }
}
