package modelo;

public class Circulo {
    //Atributos
    private double radio;
    private double area;
    private double perimetro;
    
    //constructor
    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    //metodos
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    
    public void calcularArea() {
        this.area = Math.PI * (this.radio * this.radio);
    }
    
    public void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * this.radio;
    }
}