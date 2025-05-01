public class Cilindro extends Coordenadas{
    private int h;

    public Cilindro(int coordY, int coordX, double raio, int h) {
        super(coordY, coordX, raio);
        this.h = h;
    }

    @Override
    public double calcArea() {
        double raio = super.getRaio();

        double At = ( (2 * pi) * Math.pow(2, raio) ) + ( (2 * 3.1415926) * raio * h);
        return At;
    }

    public double calcVolume(){
        double raio = super.getRaio();

        double vol = pi * Math.pow(2, raio) * h;
        return vol;
    }

}
