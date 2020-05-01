package ru.viktorshiyan.counter;

/**
 * Класс для хранения правил
 *
 * @author viktorshiyan
 */
public class Rule extends Animal {
    private boolean isWeight = true;
    private boolean isHeight = true;
    private boolean isType = true;

    /**
     * Конструктор класса
     *
     * @param weight вес животного
     * @param height рост животного
     * @param type   тип животного
     */
    public Rule(String weight, String height, String type) {
        super(weight, height, type);
        if (weight.startsWith("!")) {
            this.isWeight = false;
            this.setWeight(weight.substring(1));
        }
        if (height.startsWith("!")) {
            this.isHeight = false;
            this.setHeight(height.substring(1));
        }
        if (type.startsWith("!")) {
            this.isType = false;
            this.setType(type.substring(1));
        }
    }

    /**
     * Конструктор для создания пустого правила
     */
    public Rule() {
        super("", "", "");
    }

    public boolean isWeight() {
        return isWeight;
    }

    public boolean isHeight() {
        return isHeight;
    }

    public boolean isType() {
        return isType;
    }
}
