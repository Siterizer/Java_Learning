package Factory;

public class Main {
    public static void main(String [] args){
        Integer[] r = new Integer[]{1,2,3};
        Integer[][] r2 = new Integer[][]{{1,2,3},{4,5,6}};
        Object t1,t2;
        mathFactory mfv = new vectorFactory();
        mathFactory mfm = new matrixFactory();
        IMath vecl = mfv.createMath(r);
        IMath matl = mfm.createMath(r2);
        t1 = vecl.getNumbers();
        t2 = matl.getNumbers();
        System.out.println((Integer[]) t1 + "    " + t2);




    }
}
