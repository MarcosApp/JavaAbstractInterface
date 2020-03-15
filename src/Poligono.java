public class Poligono extends Figura {
    private double base;
    private double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}