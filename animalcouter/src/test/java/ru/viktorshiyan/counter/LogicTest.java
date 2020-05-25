package ru.viktorshiyan.counter;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Тест для проверки логики программы
 */
public class LogicTest extends TestCase {

    /**
     * ,!ВЫСОКОЕ,ВСЕЯДНОЕ
     */
    public void testLogicFilterAllTrue() {
        Logic logic = new Logic();
        Animal animal = new Animal("", "!ВЫСОКОЕ", "ВСЕЯДНОЕ");
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules3.twr");
        assertTrue(logic.filterWeight(animal, rule));
        assertTrue(logic.filterHeight(animal, rule));
        assertTrue(logic.filterType(animal, rule));
    }

    /**
     * !ТЯЖЕЛОЕ,!ВЫСОКОЕ,!ВСЕЯДНОЕ
     */
    public void testLogicFilterAllFalse() {
        Logic logic = new Logic();
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules4.twr");
        Animal animal = new Animal("ТЯЖЕЛОЕ", "ВЫСОКОЕ", "ВСЕЯДНОЕ");
        assertFalse(logic.filterWeight(animal, rule));
        assertFalse(logic.filterHeight(animal, rule));
        assertFalse(logic.filterType(animal, rule));
        animal = new Animal("ЛЕГКОЕ", "НИЗКОЕ", "ТРАВОЯДНОЕ");
        assertTrue(logic.filterWeight(animal, rule));
        assertTrue(logic.filterHeight(animal, rule));
        assertTrue(logic.filterType(animal, rule));
    }

    /**
     * ,МАЛЕНЬКОЕ,ТРАВОЯДНОЕ
     * ,МАЛЕНЬКОЕ,ПЛОТОЯДНОЕ
     */
    public void testLogicFilterRulesAND() {
        Logic logic = new Logic();
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules2.twr");
        Animal animal = new Animal("ТЯЖЕЛОЕ", "МАЛЕНЬКОЕ", "ТРАВОЯДНОЕ");
        assertTrue(logic.filterWeight(animal, rule));
        assertTrue(logic.filterHeight(animal, rule));
        assertTrue(logic.filterType(animal, rule));
        animal = new Animal("ТЯЖЕЛОЕ", "МАЛЕНЬКОЕ", "ПЛОТОЯДНОЕ");
        assertTrue(logic.filterWeight(animal, rule));
        assertTrue(logic.filterHeight(animal, rule));
        assertTrue(logic.filterType(animal, rule));
        animal = new Animal("ТЯЖЕЛОЕ", "ВЫСОКОЕ", "ВСЕЯДНОЕ");
        assertTrue(logic.filterWeight(animal, rule));
        assertFalse(logic.filterHeight(animal, rule));
        assertFalse(logic.filterType(animal, rule));
    }

    /**
     * ,МАЛЕНЬКОЕ,ТРАВОЯДНОЕ
     * ,МАЛЕНЬКОЕ,ПЛОТОЯДНОЕ
     */
    public void testLogicFilterURules() {
        Logic logic = new Logic();
        ArrayList<Rule> rule = AnimalFileReader.readFileRules("src/test/resources/rules2.twr");
        Animal animal = new Animal("ТЯЖЕЛОЕ", "МАЛЕНЬКОЕ", "ТРАВОЯДНОЕ");
        assertTrue(logic.filterAll(animal, rule));
        animal = new Animal("ТЯЖЕЛОЕ", "ВЫСОКОЕ", "ВСЕЯДНОЕ");
        assertFalse(logic.filterAll(animal, rule));
    }

    /**
     * Проверка логики с правилом ,!ВЫСОКОЕ,ВСЕЯДНОЕ
     */
    public void testWhenCounterWithRule3() {
        String pathAnimals = "src/test/resources/animals.twa";
        String pathRule = "src/test/resources/rules3.twr";
        String message = "Колличество подходящих животных не соответсвует";
        Logic logic = new Logic();
        assertEquals(message, logic.counter(pathAnimals, pathRule), 5);
    }

    /**
     * Проверка логики с правилом
     * ,МАЛЕНЬКОЕ,ТРАВОЯДНОЕ
     * ,МАЛЕНЬКОЕ,ПЛОТОЯДНОЕ
     * Травоядное или плотоядное и они при этом маленькие
     */
    public void testWhenCounterWithRule2() {
        String pathAnimals = "src/test/resources/animals.twa";
        String pathRule = "src/test/resources/rules2.twr";
        String message = "Колличество подходящих животных не соответсвует";
        Logic logic = new Logic();
        assertEquals(message, logic.counter(pathAnimals, pathRule), 3);
    }

    /**
     * Проверка логики с правилом ,,ТРАВОЯДНОЕ
     * Животные только травоядные
     */
    public void testWhenCounterWithRule1() {
        String pathAnimals = "src/test/resources/animals.twa";
        String pathRule = "src/test/resources/rules1.twr";
        String message = "Колличество подходящих животных не соответсвует";
        Logic logic = new Logic();
        assertEquals(message, logic.counter(pathAnimals, pathRule), 7);
    }

    /**
     * Проверка логики с правилом !ТЯЖЕЛОЕ,!ВЫСОКОЕ,!ВСЕЯДНОЕ
     */
    public void testWhenCounterWithRule4() {
        String pathAnimals = "src/test/resources/animals.twa";
        String pathRule = "src/test/resources/rules4.twr";
        String message = "Колличество подходящих животных не соответсвует";
        Logic logic = new Logic();
        assertEquals(message, logic.counter(pathAnimals, pathRule), 6);
    }

    /**
     * Проверка логики с правилом ТЯЖЕЛОЕ,!ВЫСОКОЕ,
     */
    public void testWhenCounterWithRule5() {
        String pathAnimals = "src/test/resources/animals.twa";
        String pathRule = "src/test/resources/rules5.twr";
        String message = "Колличество подходящих животных не соответсвует";
        Logic logic = new Logic();
        assertEquals(message, logic.counter(pathAnimals, pathRule), 5);
    }
}