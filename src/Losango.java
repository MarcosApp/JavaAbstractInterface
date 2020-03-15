public class Losango extends Quadrilatero {
    public Losango(double base, double altura){
        super(base, altura);
    }

    @Override
    public double area(){
        return getBase() * getAltura();
    }
}