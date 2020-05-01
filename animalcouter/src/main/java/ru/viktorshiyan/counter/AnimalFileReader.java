package ru.viktorshiyan.counter;

import java.io.*;
import java.util.ArrayList;

/**
 * Класс для получения информации о животных из файла
 * <p>
 * !!!Не реализованы проверка существования файла, а так же проверкв целостности данных
 * !!!т.к в задании сказано не тратить время на неоговоренный функционал
 * </p>
 *
 * @author viktorshiyan
 * @since 20.05.2020
 */
public class AnimalFileReader {
    /**
     * Метод для получения списка животных из файла
     *
     * @param path путь к файлу
     * @return список животных
     */
    public static ArrayList<Animal> readFileAnimals(String path) {
        ArrayList<Animal> animals = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            String[] arr;
            while (line != null) {
                arr = line.split(",");
                animals.add(new Animal(arr[0], arr[1], arr[2]));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return animals;
    }

    /**
     * Метод для получения правил из файла
     *
     * @param path путь к файлу правил
     * @return правило
     */
    public static Rule readFileRules(String path) {
        Rule result = new Rule();
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            String[] arr = line.split(",");
            result = new Rule(arr[0], arr[1], arr[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
