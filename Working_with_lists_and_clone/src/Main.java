public class Main {
    public static void main(String[] args){
        A_Bad_example a1 = new A_Bad_example();
        A_Bad_example a2 = a1;
        a2.setA(5);
        System.out.println(a1.getA() + "  " + a2.getA());

        B_Good_example b1 = new B_Good_example();
        B_Good_example b2 =  (B_Good_example) b1.clone();
        b2.setB(5);
        System.out.println(b1.getB() + "  " + b2.getB());

        C_Good_example c1 = new C_Good_example();
        c1.c.add(1);
        C_Good_example c2 = (C_Good_example) c1.clone();
        c2.c.add(0, 3);
        System.out.println(c1.c.get(0) + "  " + c2.c.get(0));



    }
}
