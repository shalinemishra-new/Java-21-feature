package org.example.java21.feautres;

public sealed class SealedClass  permits  A,B,C{

    public void test(){
        
    }
}




sealed class A extends SealedClass {

    @Override
    public void test() {

    }
}

 final class B extends SealedClass {

    @Override
    public void test() {

    }
}

final class C extends SealedClass {

    @Override
    public void test() {

    }


}

non-sealed class D extends A {

    @Override
    public void test() {

    }

     class E extends D{

        @Override
        public void test() {

        }
    }
}
