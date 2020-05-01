package ru.viktorshiyan.counter;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Тест для проверки логики программы
 */
public class LogicTest extends TestCase {

    /**
     * Проверка логики с правилом ТЯЖЕЛОЕ,!ВЫСОКОЕ,ВСЕЯДНОЕ
     */
    public void testWhenCounterWithRule3() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        Rule rule = AnimalFileReader.readFileRules("src/test/resources/rules3.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 1);
    }

    /**
     * Проверка логики с правилом ,МАЛЕНЬКОЕ,ТРАВОЯДНОЕ
     */
    public void testWhenCounterWithRule2() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        Rule rule = AnimalFileReader.readFileRules("src/test/resources/rules2.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 2);
    }

    /**
     * Проверка логики с правилом ,,ТРАВОЯДНОЕ
     */
    public void testWhenCounterWithRule1() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        Rule rule = AnimalFileReader.readFileRules("src/test/resources/rules1.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 7);
    }

    /**
     * Проверка логики с правилом ,,ТРАВОЯДНОЕ
     */
    public void testWhenCounterWithRule4() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        Rule rule = AnimalFileReader.readFileRules("src/test/resources/rules4.tw");
        Logic logic = new Logic();
        assertEquals("Колличество подходящих животных не соответсвует", logic.counter(animals, rule), 6);
    }
}