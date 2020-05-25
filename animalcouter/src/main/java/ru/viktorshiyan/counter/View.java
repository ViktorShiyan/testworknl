package ru.viktorshiyan.counter;

import java.io.*;
import java.util.ArrayList;

/**
 * Класс для ввода вывода информации
 * <p>
 * !!! в коде не реализована проверка правильности путей к файлу
 * !!! так как в задании написанно не реализовывать ничего лишнего
 * </p>
 *
 * @author viktorshiyan
 */
public class View {
    public static void main(String[] args) {
        String pathToAnimals = "";
        String pathToRules = "";
        try {
            File file = new File("property");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            String[] arr;
            while (line != null) {
                if (line.startsWith("a-")) {
                    pathToAnimals = line.substring(2);
                }
                if (line.startsWith("r-")) {
                    pathToRules = line.substring(2);
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> filesAnimals = getPathAnimals(pathToAnimals);
        ArrayList<String> filesRules = getPathRules(pathToRules);
        Logic logic = new Logic();
        for (String pAnimals : filesAnimals) {
            for (String pRules : filesRules) {
                System.out.println("Количество животных из файла: " + pAnimals);
                System.out.println("проходящих по правилу: " + pRules);
                System.out.println("ровно: " + logic.counter(pAnimals, pRules));
            }
        }
    }

    /**
     * Метод для получения списка путей для файлов с животными
     *
     * @param pathDir путь папки с животными
     * @return список путей с животными
     */
    static ArrayList<String> getPathAnimals(String pathDir) {
        if (pathDir.equals("")) {
            pathDir = "./";
        }
        ArrayList<String> arrAnimals = new ArrayList<>();
        File myFolder = new File(pathDir);
        File[] files = myFolder.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].toString().endsWith(".twa")) {
                arrAnimals.add(files[i].toString());
            }
        }
        return arrAnimals;
    }

    /**
     * Метод для получения списка с путями до правил
     *
     * @param pathDir путь до правил
     * @return список путей для правил
     */
    static ArrayList<String> getPathRules(String pathDir) {
        if (pathDir.equals("")) {
            pathDir = "./";
        }
        ArrayList<String> arrRules = new ArrayList<>();
        File myFolder = new File(pathDir);
        File[] files = myFolder.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].toString().endsWith(".twr")) {
                arrRules.add(files[i].toString());
            }
        }
        return arrRules;
    }
}
