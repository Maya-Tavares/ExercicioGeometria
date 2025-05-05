public abstract class Coordenadas {
    private int coordX;
    private int coordY;
    private double raio;
    double pi = 3.1415926;


    public Coordenadas(int coordY, int coordX, double raio) {
        this.coordY = coordY;
        this.coordX = coordX;
        this.raio = raio;
    }

    public abstract double calcArea();

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Coordenadas{" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", raio=" + raio +
                '}';
    }
}

