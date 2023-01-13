package annotationexample;

class SuperClass {
    public void example() {
        System.out.println("example() of SuperClass");
    }
}

class SubClass extends SuperClass {

    @Override
    public void example() {
        System.out.println("example() of SubClass");
    }
}
