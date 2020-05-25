package ru.viktorshiyan.counter;

/**
 * Класс описывающий животное
 *
 * @author viktorshiyan
 * @since 01.05.2020
 */
public class Animal {
    private String weight;
    private String height;
    private String type;

    /**
     * Конструктор класса
     *
     * @param weight вес животного
     * @param height рост животного
     * @param type   тип животного
     */
    public Animal(String weight, String height, String type) {
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    /**
     * Метод для получения значения веса
     *
     * @return вес
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Метод для получения значения роста
     *
     * @return рост
     */
    public String getHeight() {
        return height;
    }

    /**
     * Метод для получения значения типа
     *
     * @return тип животного
     */
    public String getType() {
        return type;
    }
}
