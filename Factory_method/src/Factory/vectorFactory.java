package Factory;

public class vectorFactory extends mathFactory {


    @Override
    IMath createMath(Object size) {
        return (IMath) new Vector(size);
    }
}
