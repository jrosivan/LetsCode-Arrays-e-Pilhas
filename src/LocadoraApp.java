import domain.Carro;

import java.util.Arrays;

public class LocadoraApp  {

    public static void main(String[] args) {

        Carro[] frota = new Carro[10];

        System.out.println("┌".concat("─".repeat(50)).concat("┐"));
        System.out.println("│                PANGEIA RENT A CAR                │");
        System.out.println("└".concat("─".repeat(50)).concat("┘"));

        System.out.println("1) Comprando meus carros...");
        frota[0] = new Carro("JRB-6591","FIAT", "CROSS", 35.00, true);
        frota[1] = new Carro("BOB-3333","WOLKS", "HB20", 120.00, true);
        frota[2] = new Carro("DIK-1234","ALFA", "SUV", 350.00, true);
        frota[3] = new Carro("PAT-8970","CHERRY", "HATCH", 435.00, false);
        frota[4] = new Carro("MIK-1358","TOYOTA", "SW4", 275.00, true);
        frota[5] = new Carro("AAA-4798","FIAT", "SEDAN", 217.00, true);
        frota[6] = new Carro("BBB-1358","WOLKS", "SUV", 312.00, false);
        frota[7] = new Carro("CCC-6328","TOYOTA", "AX30", 123.00, true);
        frota[8] = new Carro("DDD-5638","TESLA", "SW4", 271.00, false);
        frota[9] = new Carro("EEE-2318","TIGUAN", "HATCH", 83.00, true);
        System.out.println("   ......feito! (comprei 10).....");

        System.out.println("2) Preciso organizar eles, por valor de aluguel...");
        frota = ordenarVeiculos(frota);
        System.out.println("   ......feito!.....");

        System.out.println("3) Listando minha frota:");
        System.out.println(Arrays.toString(frota));

    }

    public static Carro[] ordenarVeiculos(Carro[] veiculos) {
        Arrays.sort(veiculos);
        return veiculos;
    }

}
