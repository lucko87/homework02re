package hu.basic;

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
}
