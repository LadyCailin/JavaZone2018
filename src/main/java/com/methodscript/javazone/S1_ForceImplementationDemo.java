
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
        
//        public SubClass1(String s, Object o) {
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
}
