package modelo;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    public void calcularArea() {
        this.area = this.base * this.altura;
    }
    
    
    public void calcularPerimetro() {
        this.perimetro = 2 * (this.base + this.altura);
    }
}