import domain.Carro;

import java.util.Arrays;

public class LocadoraApp  {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("PANGEIA RENT A CAR");
        System.out.println("--------------------------------");


    }

    public static Carro[] ordenarVeiculos(Carro[] veiculos) {
        Arrays.sort(veiculos);
        return veiculos;
    }



}
