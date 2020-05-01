package ru.viktorshiyan.counter;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс отвечающий за подсчёт вхождений по правилам
 *
 * @author viktorshiyan
 */
public class Logic {
    /**
     * Метод возвращающий число вхождений по правилам
     *
     * @param list список животных
     * @param rule правило
     * @return количество вхождений по правилам
     */
    public int counter(List<Animal> list, ArrayList<Rule> rule) {
        List<Animal> animalList = this.filterWeight(list, rule);
        animalList = this.filterHeight(animalList, rule);
        animalList = this.filterType(animalList, rule);
        return animalList.size();
    }

    /**
     * Фильтр пропускающий или удаляющий нужные значения по весу
     *
     * @param list список животных
     * @param r    правило
     * @return отфильтрованный список
     */
    private List<Animal> filterWeight(List<Animal> list, ArrayList<Rule> r) {
        List<Animal> animalList = new ArrayList<>();
        boolean ruleEmpty = true;
        for (Rule rule : r) {
            if (!rule.getWeight().equals("")) {
                ruleEmpty = false;
                break;
            }
        }
        if (ruleEmpty) {
            return list;
        }
        for (Rule rule : r) {
            if (rule.isWeight()) {
                for (Animal animal : list) {
                    if (animal.getWeight().equals(rule.getWeight())) {
                        animalList.add(animal);
                    }
                }
            } else {
                for (Animal animal : list) {
                    if (!animal.getWeight().equals(rule.getWeight())) {
                        animalList.add(animal);
                    }
                }
            }
        }

        return animalList;
    }

    /**
     * Фильтр пропускающий или удаляющий нужные значения по высоте
     *
     * @param list список животных
     * @param r    правило
     * @return отфильтрованный список
     */
    private List<Animal> filterHeight(List<Animal> list, ArrayList<Rule> r) {
        List<Animal> animalList = new ArrayList<>();
        boolean ruleEmpty = true;
        for (Rule rule : r) {
            if (!rule.getHeight().equals("")) {
                ruleEmpty = false;
                break;
            }
        }
        if (ruleEmpty) {
            return list;
        }
        for (Rule rule : r) {
            if (rule.isHeight()) {
                for (Animal animal : list) {
                    if (animal.getHeight().equals(rule.getHeight())) {
                        animalList.add(animal);
                    }
                }
            } else {
                for (Animal animal : list) {
                    if (!animal.getHeight().equals(rule.getHeight())) {
                        animalList.add(animal);
                    }
                }
            }
        }

        return animalList;
    }

    /**
     * Фильтр пропускающий или удаляющий нужные значения по типу
     *
     * @param list список животных
     * @param r    правило
     * @return отфильтрованный список
     */
    private List<Animal> filterType(List<Animal> list, ArrayList<Rule> r) {
        List<Animal> animalList = new ArrayList<>();
        boolean ruleEmpty = true;
        for (Rule rule : r) {
            if (!rule.getType().equals("")) {
                ruleEmpty = false;
                break;
            }
        }
        if (ruleEmpty) {
            return list;
        }
        for (Rule rule : r) {
            if (rule.isType()) {
                for (Animal animal : list) {
                    if (animal.getType().equals(rule.getType())) {
                        animalList.add(animal);
                    }
                }
            } else {
                for (Animal animal : list) {
                    if (!animal.getType().equals(rule.getType())) {
                        animalList.add(animal);
                    }
                }
            }
        }

        return animalList;
    }
}
