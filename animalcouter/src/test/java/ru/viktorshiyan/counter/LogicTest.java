package ru.viktorshiyan.counter;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Тест для проверки логики программы
 */
public class LogicTest extends TestCase {

    /**
     * Проверка логики с правилом ,!ВЫСОКОЕ,ВСЕЯДНОЕ
     */
    public void testWhenCounterWithRule3() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules3.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 5);
    }

    /**
     * Проверка логики с правилом ,МАЛЕНЬКОЕ,ТРАВОЯДНОЕ
     *                            ,МАЛЕНЬКОЕ,ПЛОТОЯДНОЕ
     * Травоядное или плотоядное и они при этом маленькие
     */
    public void testWhenCounterWithRule2() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules2.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 6);
    }

    /**
     * Проверка логики с правилом ,,ТРАВОЯДНОЕ
     * Животные только травоядные
     */
    public void testWhenCounterWithRule1() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules1.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 7);
    }

    /**
     * Проверка логики с правилом !ТЯЖЕЛОЕ,!ВЫСОКОЕ,!ВСЕЯДНОЕ
     */
    public void testWhenCounterWithRule4() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules4.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 6);
    }

    /**
     * Проверка логики с правилом ТЯЖЕЛОЕ,!ВЫСОКОЕ,
     */
    public void testWhenCounterWithRule5() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules5.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 5);
    }
}