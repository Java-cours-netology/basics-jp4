import ru.netology.calcTarif.CalcMethods;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        int money, anwser, revenue = 0, expense = 0;
        String input;

        do {
            System.out.println("Выберите операцию и введите её номер:\n 1. Добавить новый доход;\n" +
                                " 2. Добавить новый расход;\n 3. Выбрать систему налогообложения.");
            input = scanner.nextLine();
            if (input.equals("end")){
                anwser = -1;
                end = true;
            } else {
                anwser = Integer.parseInt(input);
            }

            switch (anwser){
                case 1:
                    System.out.print("Введите сумму дохода: ");
                    input = scanner.nextLine();
                    money = Integer.parseInt(input);
                    revenue += money;
                    break;
                case 2:
                    System.out.print("Введите сумму расхода: ");
                    input = scanner.nextLine();
                    money = Integer.parseInt(input);
                    expense += money;
                    break;
                case 3:
                    int firstTarif = CalcMethods.firstVariant(revenue);
                    int secondTarif = CalcMethods.secondVariant(revenue, expense);
                    System.out.println("Ваш налог составит: " + Math.min(firstTarif, secondTarif));
                    System.out.println("Налог на другой системе: " + Math.max(firstTarif, secondTarif));
                    System.out.println("Экономия: " + Math.abs(firstTarif - secondTarif));
                    break;
                default:
                    if (end){
                        System.out.println("Программа завершена!");
                    } else {
                        System.out.println("Вы ввели недопустимое значение.");
                    }
            }
        } while (! end);
    }
}