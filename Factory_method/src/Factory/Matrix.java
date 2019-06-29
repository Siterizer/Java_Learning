package Factory;

public class Matrix implements IMath {
    private Integer[][] params;

    Matrix(Object temp){
        this.params = (Integer[][]) temp;
    }

    public Object getNumbers(){
        return getParams();
    }

    public Integer[][] getParams(){
        return params;
    }
}