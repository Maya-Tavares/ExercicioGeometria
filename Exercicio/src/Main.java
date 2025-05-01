import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Coordenadas>  lista = new ArrayList<>();

        lista.add(new Circulo(2,2,5));
        lista.add(new Cilindro(1,1,2,2));
        lista.add(new Circulo(3,3,6));
        lista.add(new Circulo(1,1,2));

        for(Coordenadas c : lista){
            if (c instanceof Circulo){
                System.out.println("Circulo ---> ");
            }

            else {
                System.out.println("Cilindro ---> ");
            }
            System.out.println(c);
            System.out.println(c.getClass());
            System.out.println("Area: " + c.calcArea());
            System.out.println();

            if (c instanceof Cilindro){
                System.out.println(((Cilindro) c).calcVolume());
            }
        }

    }
}