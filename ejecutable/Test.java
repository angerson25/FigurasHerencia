package ejecutable;
import javax.swing.JOptionPane;

import modelo.*;

public class Test {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo"));
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));

        Rectangulo rectangulo = new modelo.Rectangulo(base, altura);
        Circulo circulo = new modelo.Circulo(radio);
        
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        
        circulo.calcularArea();
        circulo.calcularPerimetro();
        
        System.out.println("El area del rectangulo es: " + rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.getPerimetro());
        
        System.out.println("El area del circulo es: " + circulo.getArea());
        System.out.println("El perimetro del circulo es: " + circulo.getPerimetro());
    }
}