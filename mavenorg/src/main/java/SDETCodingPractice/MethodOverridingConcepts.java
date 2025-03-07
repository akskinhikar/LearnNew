public class MethodOverridingConcepts {

    public static void main(String[] args) {

        AA aa = new AA();
        aa.test();

        BB bb = new BB();
        bb.test();

        AA bb1 = new BB();
        bb1.test();
    }

}


class AA{
    public void test(){
        System.out.println("In Class AA");
    }
}

class BB extends AA{
    public void test(){
        System.out.println("In Class BB");
    }
}
