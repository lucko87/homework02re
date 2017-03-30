package hu.basic;
//beimportálom a scannert

import java.util.Scanner;
public class CalculatorHelper {

    // létrehozom a imput publikus osztályt
    public int input() {
        // behívom a calculatorSevice osztályt
        CalculatorService calculatorService = new CalculatorService();
        //jelzem, hogy a number nevű válozóba, ami a Servicebe megadtam be szeretnék értéket olvastatni
        Scanner number = new Scanner(System.in);
        //bekérem és az a nevű integerbe tárolom a két számot
        System.out.println("Kérem az első számot: ");
        int a = number.nextInt();
        System.out.println("Kérem a második számot: ");
        int b = number.nextInt();
        //berkérem az operátort, de mivel már korábban használtam az operation változót, ezért operat lett a neve
        Scanner operat = new Scanner(System.in);
        System.out.println("Kérek egy műveletet! (+,-,*,/) ");
        char op = operat.nextLine().charAt(0);
        //a visszaértő értéket adja át a Service osztály, calculate metódusának
        return calculatorService.calculate(a, b, op);
    }
}
