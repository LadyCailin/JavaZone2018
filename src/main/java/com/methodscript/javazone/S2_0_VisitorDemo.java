package com.methodscript.javazone;

/**
 *
 * @author Cailin
 */
public class S2_0_VisitorDemo {
    public static interface MyInterface extends MyInterfaceVisitable {}
    
    public static class FirstSubclass implements MyInterface {

        @Override
        public void accept(MyInterfaceVisitor mi) {
            mi.handle(this);
        }
    }
    public static class SecondSubclass implements MyInterface {

        @Override
        public void accept(MyInterfaceVisitor mi) {
            mi.handle(this);
        }
    }
    public static class ThirdSubclass implements MyInterface {

        @Override
        public void accept(MyInterfaceVisitor mi) {
            mi.handle(this);
        }
    }
    
    public static interface MyInterfaceVisitable {
        void accept(MyInterfaceVisitor mi);
    }
    
    public static interface MyInterfaceVisitor {
        void handle(FirstSubclass c);
        void handle(SecondSubclass c);
        void handle(ThirdSubclass c);
    }
    
    public static class MyVisitor1 implements MyInterfaceVisitor {

        @Override
        public void handle(FirstSubclass c) {
            System.out.println("MyVisitor1 FirstSubclass");
        }

        @Override
        public void handle(SecondSubclass c) {
            System.out.println("MyVisitor1 SecondSubclass");
        }

        @Override
        public void handle(ThirdSubclass c) {
            System.out.println("MyVisitor1 ThirdSubclass");
        }
        
    }
    
    public static class MyVisitor2 implements MyInterfaceVisitor {

        @Override
        public void handle(FirstSubclass c) {
            System.out.println("MyVisitor2 FirstSubclass");
        }

        @Override
        public void handle(SecondSubclass c) {
            System.out.println("MyVisitor2 SecondSubclass");
        }

        @Override
        public void handle(ThirdSubclass c) {
            System.out.println("MyVisitor2 ThirdSubclass");
        }
        
    }
    
    public static void main(String [] args) {
        MyInterfaceVisitor visitor = new MyVisitor2();
        //MyInterface mi = new ThirdSubclass();
        visitor.handle(new ThirdSubclass());
        
//        if(visitor instanceof FirstSubclass) {
//            //
//        } else if(visitor instanceof SecondSubclass) {
//            //
//        } else if(visitor instanceof ThirdSubclass) {
//            //
//        } else {
//            throw new RuntimeException();
//        }
    }
}
