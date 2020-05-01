package ru.viktorshiyan.counter;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Тест работы класса AnimalFileReader
 *
 * @author viktorshiyan
 */
public class AnimalFileReaderTest extends TestCase {

    /**
     * Проверка правильности создания списка из файла
     */
    public void testReadFileAnimals() {
        ArrayList<Animal> animals = AnimalFileReader.readFileAnimals("src/test/resources/animals.tw");
        assertEquals("Размер списка отличается от ожидаемого", 18, animals.size());
        assertEquals("Параметр животного отличается", "ВСЕЯДНОЕ", animals.get(0).getType());
        assertEquals("Параметр животного отличается", "ЛЕГКОЕ", animals.get(0).getWeight());
    }

    /**
     * Проверка правильности считывания правил
     */
    public void testReadFileRules() {
        Rule rule = AnimalFileReader.readFileRules("src/test/resources/rules3.tw");
        assertEquals("Правило отличается", "ВЫСОКОЕ", rule.getHeight());
        assertEquals("Правило отличается", "ТЯЖЕЛОЕ", rule.getWeight());
        assertFalse("Праметр в правиле отличается", rule.isHeight());
    }
}