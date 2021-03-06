package hu.basic;

import java.util.Random;

//1. feladat
//Lérezhonom a CalculatorService osztályt
public class CalculatorService {
    //Azonosítom az oszályt, hogy később hivatkozni tudjak rá
    public CalculatorService() {
    }

    //Létrehozom, az isIt Even metódust, ami publikus és azt mondom, hogy tartalamazzon egy Integer számot
    public boolean isItEven(int number) {
//Azt mondom, hogy a metódus visszatérési értéke a kettővel való oszts
        return !(number % 2 != 0);
    }

    public int calculate(int x, int y, char operation) {

        int result = 0;
        switch (operation) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Hibás művelet!");
        }
        return result;

    }

    public String randomgenerate(float min, float max) {
        Random random = new Random();
        float randomFloat = min + random.nextFloat() * (max - min);
        System.out.print(randomFloat + "\n");
        if (randomFloat == Math.round(randomFloat)) {
            return "Egész szám";
        } else return "Nem nem egész szám";
    }

    public void randomNumbers() {
        Random random = new Random();
        int numberA = random.nextInt(50) + 100;
        int numberB = random.nextInt(50) + 100;
        System.out.println(numberA + " " + numberB);
        if ((numberA > numberB && numberA % 2 == 0) || (numberA < numberB && numberA % 2 == 1)) {
            System.out.println(numberA);
        } else if (numberB > numberA && numberB % 2 == 1) {
            System.out.println(numberB);
        } else System.out.println(Math.pow(numberA, numberB));
    }

}

