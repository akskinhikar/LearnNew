class A{
    protected int ner = 10;
    public A(){
        System.out.println("in A class constructor");
    }

    public void abc(){
        System.out.println("in abc method");
    }
}

class B extends A{
    public B(){
        super();
    }
    public void AB() {
        super.abc();
        System.out.println(super.ner);
    }
}


class SuperKeyword{
    public static void main(String[] args) {
        A aa = new B();
        aa.abc();

        B bb = new B();
        bb.AB();
    }




}