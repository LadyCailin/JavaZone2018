
package com.methodscript.javazone;

import com.methodscript.PureUtilities.Common.Annotations.ForceImplementation;

/**
 *
 * @author Cailin
 */
public class S1_ForceImplementationDemo {
    public static abstract class BaseClass {
//        @ForceImplementation
        protected BaseClass(String s, Object o) {
            //
        }
        
//        @ForceImplementation
        public void method() {
            System.out.println("In BaseClass");
        }
    }
    
    public static class SubClass extends BaseClass {
        
//        public SubClass(String s, Object o) {
//            super(s, o);
//        }
        
        public SubClass() {
            super("", null);
        }

//        @Override
//        public void method() {
//            System.out.println("In SubClass");
//        }
                
    }
    
//    public static class SubSubClass extends SubClass {
//        
//    }
    
    public static void main(String[] args) {
        new SubClass().method();
    }
    
    public static interface MyInterface {
        @ForceImplementation
        void myMethod();
    }
    
    public static class A implements MyInterface {
        public void myMethod() {}        
    }
    
    public static class B extends A {
        public void myMethod() {}
    }
}
