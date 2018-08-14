/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laytonsmith.javazone;

import com.laytonsmith.PureUtilities.Common.Annotations.ForceImplementation;

/**
 *
 * @author Cailin
 */
public class ForceImplementationDemo {
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
    
    public static class SubClass1 extends BaseClass {
        
//        public SubClass1(String s, Object o) {
//            super(s, o);
//        }
        
        public SubClass1() {
            super("", null);
        }

//        @Override
//        public void method() {
//            System.out.println("In SubClass");
//        }
                
    }
    
//    public static class SubSubClass extends SubClass1 {
//        
//    }
    
    public static void main(String[] args) {
        new SubClass1().method();
    }
}
