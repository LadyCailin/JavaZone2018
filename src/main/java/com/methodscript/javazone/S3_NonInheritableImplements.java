
package com.methodscript.javazone;

import com.methodscript.PureUtilities.Common.Annotations.NonInheritImplements;

import static com.methodscript.PureUtilities.Common.Annotations.NonInheritImplements.Helper.*;

/**
 *
 * @author Cailin
 */
public class S3_NonInheritableImplements {
    
    public static interface MyInterface {
        void aMethod();
    }
    
    public static class A {
    }
    
//    @NonInheritImplements(MyInterface.class)
    public static class B extends A {        
//        public void aMethod() {
//            System.out.println("Hello World!");
//        }
    }
    
    public static class C extends B {
        
    }
    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        System.out.println("nii instanceof a: " + NonInheritImplements.Helper.Instanceof(a, MyInterface.class));
        System.out.println("nii instanceof b: " + Instanceof(b, MyInterface.class));
        System.out.println("nii instanceof c: " + Instanceof(c, MyInterface.class));
        System.out.println("instanceof a    : " + (a instanceof MyInterface));
        System.out.println("instanceof b    : " + (b instanceof MyInterface));
        System.out.println("instanceof c    : " + (c instanceof MyInterface));
        
//        MyInterface mb = Cast(MyInterface.class, b);
//        mb.aMethod();
    }
}
