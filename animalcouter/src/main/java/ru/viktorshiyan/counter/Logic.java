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
    public int counter(List<Animal> list, Rule rule) {
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
    private List<Animal> filterWeight(List<Animal> list, Rule r) {
        List<Animal> animalList = new ArrayList<>();
        if (r.getWeight().equals("")) {
            return list;
        }
        if (r.isWeight()) {
            for (Animal animal : list) {
                if (animal.getWeight().equals(r.getWeight())) {
                    animalList.add(animal);
                }
            }
        } else {
            for (Animal animal : list) {
                if (!animal.getWeight().equals(r.getWeight())) {
                    animalList.add(animal);
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
    private List<Animal> filterHeight(List<Animal> list, Rule r) {
        List<Animal> animalList = new ArrayList<>();
        if (r.getHeight().equals("")) {
            return list;
        }
        if (r.isHeight()) {
            for (Animal animal : list) {
                if (animal.getHeight().equals(r.getHeight())) {
                    animalList.add(animal);
                }
            }
        } else {
            for (Animal animal : list) {
                if (!animal.getHeight().equals(r.getHeight())) {
                    animalList.add(animal);
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
    private List<Animal> filterType(List<Animal> list, Rule r) {
        List<Animal> animalList = new ArrayList<>();
        if (r.getType().equals("")) {
            return list;
        }
        if (r.isType()) {
            for (Animal animal : list) {
                if (animal.getType().equals(r.getType())) {
                    animalList.add(animal);
                }
            }
        } else {
            for (Animal animal : list) {
                if (!animal.getType().equals(r.getType())) {
                    animalList.add(animal);
                }
            }
        }
        return animalList;
    }
}
