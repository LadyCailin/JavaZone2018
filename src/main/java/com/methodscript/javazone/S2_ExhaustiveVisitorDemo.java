package com.methodscript.javazone;

import com.methodscript.PureUtilities.ExhaustiveVisitor;

/**
 *
 * @author Cailin
 */
public class S2_ExhaustiveVisitorDemo {

    public static interface CarPart {
    }

    public static class Wheel implements CarPart {
    }

    public static class Engine implements CarPart {
    }

    public static class Body implements CarPart {
    }

//    public static class BrakeLights implements CarPart {
//    }

    public static class PartInspectorVisitor extends ExhaustiveVisitor<CarPart, Void> {

        public void visit(Wheel c) {
            System.out.println("PartInspector Wheel");
        }

        public void visit(Engine c) {
            System.out.println("PartInspector Engine");
        }

        public void visit(Body c) {
            System.out.println("PartInspector Body");
        }
    }

    public static class PartFixerVisitor extends ExhaustiveVisitor<CarPart, Void> {
        public void visit(Wheel c) {
            System.out.println("PartFixer Wheel");
        }

        public void visit(Engine c) {
            System.out.println("PartFixer Engine");
        }

        public void visit(Body c) {
            System.out.println("PartFixer Body");
        }
    }

    public static void main(String[] args) {
        ExhaustiveVisitor<CarPart, Void> e = new PartInspectorVisitor();
        CarPart m = new Wheel();
        e.visit(m);
    }
}
