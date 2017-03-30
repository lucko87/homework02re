package hu.basic;

public class Main {

    public static void main(String[] args) {
        // 1. Feladat

        //Kiírom, hogy melyik feladatról van szó, majd sortörlést használok a függvényben
        System.out.println("1. feladat: A 6-os szám értéke páros, ez az állítás: \n");
        // Behívom a CalculatorServic osztályt, és azt mondom, hogy új értéket akarok neki küldeni
        CalculatorService calculatorService = new CalculatorService();
        //Kiirítom a CalculatorServic osztály, isItEven metódusának eredményét, ha a küldött érték 6
        System.out.println(calculatorService.isItEven(6) + "\n");

    }
}
