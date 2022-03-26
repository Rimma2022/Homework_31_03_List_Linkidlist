package home31_03_task1_9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Задача 1
         * Дан список некоторых целых чисел, найдите значение 20 в нем и, если оно присутствует, замените его на 200.
         * Обновите список только при первом вхождении числа 20.
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(20);
        System.out.println(numbers);
        int index = numbers.indexOf(20);
        numbers.set(index, 200);
        System.out.println(numbers);

        // Задача 2
        //Необходимо удалить пустые строки из списка строк.
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Rimma");
        strings.add(null);
        strings.add("Oksana");
        strings.add(null);
        System.out.println(strings);
        strings.removeIf(x -> x == null);
        //or
//        for (int i = 0; i < strings.size(); i++) {
//            if (strings.get(i) == null) {
//                strings.remove(null);
//            }
//        }
        System.out.println(strings);

        // Задача 3
        //Дан список чисел. Превратите его в список квадратов этих чисел.
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        System.out.println(numbers2);
        numbers2.forEach(x -> {
            System.out.print(x * x + " ");
        });
        System.out.println();

        // Задача 4
        //Дан список чисел, необходимо удалить все вхождения числа 20 из него.
        LinkedList<Integer> numbers3 = new LinkedList<>();
        numbers3.add(5);
        numbers3.add(10);
        numbers3.add(15);
        numbers3.add(20);
        numbers3.add(25);
        numbers3.add(20);
        System.out.println(numbers3);
        numbers3.removeIf(x -> x == 20);
        System.out.println(numbers3);

        // Задача 5
        //Необходимо вывести список в обратном порядке.
        List<Integer> numbers4 = new ArrayList<>();
        numbers4.add(1);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.add(4);
        numbers4.add(5);
        System.out.println(numbers4);
        for (int i = numbers4.size() - 1; i >= 0; i--) {
            System.out.print(numbers4.get(i) + " ");
        }
        System.out.println();

        // Задача 6
        //Заполнить список ста нулями, кроме первого и последнего элементов, которые должны быть равны единице.
        List<Integer> numbers5 = new ArrayList<>();
        numbers5.add(1);
        for (int i = 1; i < 101; i++) {
            numbers5.add(0);
        }
        numbers5.add(1);
        System.out.println(numbers5);
        System.out.println(numbers5.size());

        LinkedList<Integer> numbers5_1 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            numbers5_1.add(0);
        }
        numbers5_1.addFirst(1);
        numbers5_1.addLast(1);
        System.out.println(numbers5_1);
        System.out.println(numbers5_1.size());

        // Задача 7.
        //Сформировать возрастающий список из чётных чисел (количество элементов 45).
        List<Integer> num = new ArrayList<>();
        while (num.size() < 45) {
            int a = (int) (Math.random() * 100);
            if (a % 2 == 0) {
                num.add(a);
            }
        }
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);

        // Задача 8.
        //Пользователь вводит число. Определить, содержит ли список данное число x. Если содержит, то вывести на экран число 7145, если не содержит, то вывести на экран число 5741;
        //Найдите сумму и произведение элементов списка. Результаты вывести на экран.
        List<Integer> num1 = new ArrayList<>();
        while (num1.size() < 10) {
            int a = (int) (Math.random() * 100);
            num1.add(a);
        }
        System.out.println(num1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number:");
        String nString = reader.readLine();
        Integer n = Integer.parseInt(nString);
        int sum = 0;
        int mult = 1;
        if (num1.contains(n)) {
            System.out.println(7145);
        } else {
            for (int i = 0; i < num1.size(); i++) {
                sum = sum + num1.get(i);
                mult *= num1.get(i);
            }
            System.out.println(sum + " - сумма элементов списка\n" + mult + " - произведение элементов списка");
        }

        // Задача 9.
        //Найти наибольший элемент списка и вывести его на экран;
        //Определите, есть ли в списке повторяющиеся элементы, если да, то вывести на экран это значение;
        //Поменять местами самый большой и самый маленький элементы списка

        List<Integer> num2 = new ArrayList<>();
        while (num2.size() < 10) {
            int a = (int) (Math.random() * 10);
            num2.add(a);
        }
        System.out.println(num2);
        Collections.sort(num2);
        System.out.println(num2);
        int X = num2.get((num2.size() - 1));
        int x = num2.get(0);
        System.out.println("Наибольший элемент списка: " + X + "\nНаименьший элемент списка: " + x);
        num2.set(0, X);
        num2.set(num2.size() - 1, x);
        System.out.println(num2);
        for (int i = 0; i < num2.size(); i++) {
            for (int j = i+1; j < num2.size(); j++) {
                if (num2.get(i).equals(num2.get(j))) {
                    System.out.print(num2.get(i) + " ");
                }
            }
        }
    }
}
