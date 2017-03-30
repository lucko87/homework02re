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

        // 2. Feladat

        //Kiírom, hogy melyik feladatról van szó, majd sortörlést használok a függvényben
        System.out.println("2. feladat: Az 5-ös és a 2-es szám szorzata: \n");
        // Elküdlöm calculculate metódusnak a három értéket, és kiíratom az vissakapott értéket
        System.out.println(calculatorService.calculate(5, 2, '*') + "\n");

        // 3. Feladat

        //Kiírom, hogy melyik feladatról van szó, majd sortörlést használok a függvényben
        System.out.println("3. feladat: Két számmal végezett művelet eredményét adja: \n");
        // Behívom a CalculatorHelper osztályt, és azt mondom, hogy új értéket akarok neki küldeni
        CalculatorHelper calculatorHelper = new CalculatorHelper();
        // Elküldöm a Helper metódusnak azt az osztály
        System.out.println("A művelet eredménye: " + calculatorHelper.input() + "\n");

        // 4. Feladat

        //Kiírom, hogy melyik feladatról van szó, majd sortörlést használok a függvényben
        System.out.println("4. feladat: Egy random szám, melynek értéke: \n");
        /*Behívom a CalculatorService osztályt, randomgenerate metódusátés azt mondom,
        hogy új értéket akarok neki küldeni */
        System.out.println(calculatorService.randomgenerate(25, 50));



    }
}
