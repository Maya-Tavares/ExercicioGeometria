public class Circulo extends Coordenadas{

    public Circulo(int coordY, int coordX, double raio) {
        super(coordY, coordX, raio);
    }

    @Override
    public double calcArea() {
        double raio = super.getRaio();
        double area = pi * Math.pow(2, raio);
        return area;
    }
}
