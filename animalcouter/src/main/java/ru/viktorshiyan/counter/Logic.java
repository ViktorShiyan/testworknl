package ru.viktorshiyan.counter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Класс отвечающий за подсчёт вхождений по правилам
 *
 * @author viktorshiyan
 */
public class Logic {
    /**
     * Метод возвращающий число вхождений по правилам
     *
     * @param pathAnimals путь к файлу с животными для подсчёта
     * @param pathRule    путь к файлу  правила
     * @return количество вхождений по правилам
     */
    public int counter(String pathAnimals, String pathRule) {
        ArrayList<Rule> rules = AnimalFileReader.readFileRules(pathRule);
        int count = 0;
        try {
            Animal animal;
            File file = new File(pathAnimals);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            String[] arr;
            while (line != null) {
                arr = line.split(",");
                animal = new Animal(arr[0], arr[1], arr[2]);
                if (this.filterAll(animal, rules)) {
                    count++;
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * Обобщающий фильтр
     *
     * @param animal животное
     * @param r      список правил
     * @return подходит ли животное под правила
     */
    boolean filterAll(Animal animal, ArrayList<Rule> r) {
        return this.filterWeight(animal, r) && this.filterHeight(animal, r) && this.filterType(animal, r);
    }

    /**
     * Фильтр пропускающий или удаляющий нужные значения по весу
     *
     * @param animal животное
     * @param r      правило
     * @return подходит ли животное под правило
     */
    boolean filterWeight(Animal animal, ArrayList<Rule> r) {
        boolean result = false;
        boolean ruleEmpty = true;
        for (Rule rule : r) {
            if (!rule.getWeight().equals("")) {
                ruleEmpty = false;
                break;
            }
        }
        if (ruleEmpty) {
            return true;
        }
        for (Rule rule : r) {
            if (rule.isWeight()) {
                if (animal.getWeight().equals(rule.getWeight())) {
                    result = true;
                    break;
                }
            } else {
                if (!animal.getWeight().equals(rule.getWeight())) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Фильтр пропускающий или удаляющий нужные значения по высоте
     *
     * @param animal животное
     * @param r      правило
     * @return подходит ли животное под правило
     */
    boolean filterHeight(Animal animal, ArrayList<Rule> r) {
        boolean result = false;
        boolean ruleEmpty = true;
        for (Rule rule : r) {
            if (!rule.getHeight().equals("")) {
                ruleEmpty = false;
                break;
            }
        }
        if (ruleEmpty) {
            return true;
        }
        for (Rule rule : r) {
            if (rule.isHeight()) {
                if (animal.getHeight().equals(rule.getHeight())) {
                    result = true;
                    break;
                }
            } else {
                if (!animal.getHeight().equals(rule.getHeight())) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Фильтр пропускающий или удаляющий нужные значения по типу
     *
     * @param animal животное
     * @param r      правило
     * @return подходит ли животное под правило
     */
    boolean filterType(Animal animal, ArrayList<Rule> r) {
        boolean result = false;
        boolean ruleEmpty = true;
        for (Rule rule : r) {
            if (!rule.getType().equals("")) {
                ruleEmpty = false;
                break;
            }
        }
        if (ruleEmpty) {
            return true;
        }
        for (Rule rule : r) {
            if (rule.isType()) {
                if (animal.getType().equals(rule.getType())) {
                    result = true;
                    break;
                }
            } else {
                if (!animal.getType().equals(rule.getType())) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
}
