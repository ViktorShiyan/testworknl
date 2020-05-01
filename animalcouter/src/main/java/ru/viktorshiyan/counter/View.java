package ru.viktorshiyan.counter;

import java.util.ArrayList;
import java.util.Scanner;

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
        String path;
        ArrayList<Animal> animals;
        ArrayList<Rule> rule;
        Logic logic = new Logic();
        int res;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите путь до файла со списком животных");
            path = in.nextLine();
            animals = AnimalFileReader.readFileAnimals(path);
            System.out.println("Введите путь до файла с правилами");
            path = in.nextLine();
            rule = AnimalFileReader.readFileRules(path);
            res = logic.counter(animals, rule);
            System.out.printf("Количество животных подходящих под правило %d\n", res);
            in = new Scanner(System.in);
            System.out.println("Для выхода из программы введите exit, для продолжения нажмите enter");
            if (in.nextLine().equals("exit")) {
                break;
            }

        }
    }
}
