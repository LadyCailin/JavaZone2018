
package com.methodscript.javazone;

import com.methodscript.PureUtilities.Common.Annotations.NonInheritImplements;

import static com.methodscript.PureUtilities.Common.Annotations.NonInheritImplements.Helper.*;

/**
 *
 * @author Cailin
 */
public class S3_NonInheritableImplements {

    public static interface CustomCloneable {
        Object customClone();
    }

    public static class A {
    }

//    @NonInheritImplements(CustomCloneable.class)
    public static class B extends A {
//        public Object customClone() {
//            System.out.println("Hello World!");
//            return new B();
//        }
    }

    public static class C extends B {

    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("nii instanceof a: " + NonInheritImplements.Helper.Instanceof(a, CustomCloneable.class));
        System.out.println("nii instanceof b: " + Instanceof(b, CustomCloneable.class));
        System.out.println("nii instanceof c: " + Instanceof(c, CustomCloneable.class));
        System.out.println("instanceof a    : " + (a instanceof CustomCloneable));
        System.out.println("instanceof b    : " + (b instanceof CustomCloneable));
        System.out.println("instanceof c    : " + (c instanceof CustomCloneable));

//        CustomCloneable mb = Cast(CustomCloneable.class, c);
//        mb.customClone();
    }
}
