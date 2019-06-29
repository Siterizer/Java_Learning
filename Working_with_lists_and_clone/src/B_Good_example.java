public class B_Good_example implements Cloneable {
    private int b;

    B_Good_example(){
        this.b = 1;
    }

    int getB(){
        return b;
    }
    void setB(int b){
        this.b = b;
    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch(Exception ex){
            return null;
        }

    }
}
