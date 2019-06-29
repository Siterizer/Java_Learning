import java.util.ArrayList;

public class C_Good_example implements Cloneable {
    ArrayList<Integer> c = new ArrayList<Integer>();


    @Override
    public Object clone() {
        try {
            C_Good_example temp = (C_Good_example) super.clone();
            temp.c = new ArrayList<>(temp.c);
            return temp;
        }
        catch(Exception ex){
            return null;
        }

    }
}
