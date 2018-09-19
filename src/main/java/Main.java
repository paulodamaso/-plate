import plate.NewPlate;
import plate.OldPlate;
import printers.Console;
import printers.Dialog;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Qual placa deseja converter?");
                String placa = scanner.nextLine();
                if (placa.equalsIgnoreCase("quit")) {
                    break;
                } else {
                    new Console(new NewPlate(new OldPlate(placa))).print();
                }
            }catch (Exception error) {
                System.out.println("Fecha quietinho...");
            }
        }
        System.exit(0);
    }
}
