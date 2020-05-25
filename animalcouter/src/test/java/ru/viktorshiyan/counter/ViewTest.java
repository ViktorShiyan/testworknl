package ru.viktorshiyan.counter;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Тесты на проверку работы методов из View
 */
public class ViewTest extends TestCase {

    public void testGetPathAnimals() {
        ArrayList<String> arrayList = View.getPathAnimals("src/test/resources/");
        assertEquals(1, arrayList.size());
    }

    public void testGetPathRules() {
        ArrayList<String> arrayList = View.getPathRules("src/test/resources/");
        assertEquals(5, arrayList.size());
    }
}