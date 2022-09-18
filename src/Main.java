import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {902, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) ;
                {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {

            System.out.print("Массивы одинаковые");
        } else {
            System.out.print("Массивы разные");
        }


        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }

        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }


        //Задание 1
        //
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //
        //в формате: «Сумма трат за месяц составила … рублей».
        //
        java.util.Random random = new java.util.Random();
        int[] summ = new int[30];
        int sum = 0;
        for (int i = 0; i < summ.length; i++) {
            summ[i] = random.nextInt(100_000) + 100_000;
            sum += summ[i];
            System.out.println("За " + i + " день месяца общая сумма затрат составила: " + sum + " рублей.");
        }

        //Задача 2
        //
        //Следующая задача — найти минимальную и максимальную трату за день.
        //
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».


            int MinSum = -1;
            int Maxsum = -1;
            for (int i = 0; i < summ.length; i++) {
                if (sum > Maxsum) {
                    Maxsum = sum;
                }
                if (summ[0] > MinSum) {
                    MinSum = summ[0];
                }
            }
                System.out.println("Минимальная сумма трат за день составила " + MinSum + " рублей, а максимальная сумма трат за день составила " + Maxsum + " рублей.");

        //Задание 3
        //
        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».

        double average = 0;
        average = sum/30;
        System.out.println("Средняя сумма трат за месяц составила " + average);

        //Задание 4 В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        //
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        //
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //
        //В результате в консоль должно быть выведено "Ivanov Ivan".

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char name = 0;
        for (int i = reverseFullName.length -1 ; i >= 0;i--) {
            if (i >= 0) {
                System.out.print(reverseFullName[i]);


           }
        }












    }
}