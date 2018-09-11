package com.methodscript.javazone;

/**
 *
 * @author Cailin
 */
public class S2_0_VisitorDemo {
    public static interface CarPart extends CarPartVisitable {}

    public static class Wheel implements CarPart {

        @Override
        public void accept(CarPartVisitor mi) {
            mi.visit(this);
        }
    }
    public static class Engine implements CarPart {

        @Override
        public void accept(CarPartVisitor mi) {
            mi.visit(this);
        }
    }
    public static class Body implements CarPart {

        @Override
        public void accept(CarPartVisitor mi) {
            mi.visit(this);
        }
    }

    public static interface CarPartVisitable {
        void accept(CarPartVisitor mi);
    }

    public static interface CarPartVisitor {
        void visit(Wheel c);
        void visit(Engine c);
        void visit(Body c);
    }

    public static class PartInspectorVisitor implements CarPartVisitor {

        @Override
        public void visit(Wheel c) {
            System.out.println("PartInspector Wheel");
        }

        @Override
        public void visit(Engine c) {
            System.out.println("PartInspector Engine");
        }

        @Override
        public void visit(Body c) {
            System.out.println("PartInspector Body");
        }

    }

    public static class PartFixerVisitor implements CarPartVisitor {

        @Override
        public void visit(Wheel c) {
            System.out.println("PartFixer Wheel");
        }

        @Override
        public void visit(Engine c) {
            System.out.println("PartFixer Engine");
        }

        @Override
        public void visit(Body c) {
            System.out.println("PartFixer Body");
        }

    }

    public static void main(String [] args) {
        CarPartVisitor visitor = new PartFixerVisitor();
//        CarPart mi = new Body();
//        visitor.visit(mi);
        visitor.visit(new Body());

//        if(inspectPart) {
//            if(visitor instanceof Wheel) {
//                //
//            } else if(visitor instanceof Engine) {
//                //
//            } else if(visitor instanceof Body) {
//                //
//            } else {
//                throw new RuntimeException();
//            }
//        } else if(fixPart) {
//            // Duplicate above
//        }
    }
}
