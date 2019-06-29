package Factory;

public class matrixFactory extends mathFactory {


    @Override
    IMath createMath(Object size) {
        return (IMath) new Matrix(size);
    }
}
