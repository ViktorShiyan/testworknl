package ru.viktorshiyan.counter;

/**
 * Класс для хранения правил
 *
 * @author viktorshiyan
 */
public class Rule {
    private boolean isWeight = true;
    private boolean isHeight = true;
    private boolean isType = true;

    private String weight;
    private String height;
    private String type;

    /**
     * Конструктор класса
     *
     * @param weight вес
     * @param height рост
     * @param type   тип
     */
    public Rule(String weight, String height, String type) {

        if (weight.startsWith("!")) {
            this.isWeight = false;
            this.setWeight(weight.substring(1));
        } else {
            this.weight = weight;
        }
        if (height.startsWith("!")) {
            this.isHeight = false;
            this.setHeight(height.substring(1));
        } else {
            this.height = height;
        }
        if (type.startsWith("!")) {
            this.isType = false;
            this.setType(type.substring(1));
        } else {
            this.type = type;
        }
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

    public String getWeight() {
        return weight;
    }

    public String getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }
}
