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
     * Метод для установки веса
     *
     * @param weight вес
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Метод для установки роста
     *
     * @param height рост
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Метод установки типа
     *
     * @param type тип
     */
    public void setType(String type) {
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
