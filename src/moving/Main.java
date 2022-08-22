package moving;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        int box;
        int capacity;
        Scanner userinput = new Scanner(System.in);

        System.out.print("Saisissez le nombre de carton: ");
        box = userinput.nextInt();

        System.out.print("Saisissez la capacité en carton du camion: ");
        capacity = userinput.nextInt();

        int truckNb = box / capacity;
        System.out.println(truckNb + " voyage de " + capacity + " cartons, pour un nombre total de " + box + " cartons");
        // fermer les ressources
        userinput.close();

    }
}