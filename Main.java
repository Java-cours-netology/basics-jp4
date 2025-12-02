import ru.netology.calcTarif.CalcMethods;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fin = false;
        int argent, reponse, revenu = 0, depense = 0;
        String entree;

        do {
            System.out.println("Выберите операцию и введите её номер:\n 1. Добавить новый доход;\n" +
                                " 2. Добавить новый расход;\n 3. Выбрать систему налогообложения.");
            entree = scanner.nextLine();
            if (entree.equals("end")){
                reponse = -1;
                fin = true;
            } else {
                reponse = Integer.parseInt(entree);
            }

            switch (reponse){
                case 1:
                    System.out.print("Введите сумму дохода: ");
                    entree = scanner.nextLine();
                    argent = Integer.parseInt(entree);
                    revenu += argent;
                    break;
                case 2:
                    System.out.print("Введите сумму расхода: ");
                    entree = scanner.nextLine();
                    argent = Integer.parseInt(entree);
                    depense += argent;
                    break;
                case 3:
                    int premImpot = CalcMethods.premiereVariante(revenu);
                    int deuxImpot = CalcMethods.deuxiemeVariante(revenu, depense);
                    System.out.println("Ваш налог составит: " + Math.max(premImpot, deuxImpot));
                    System.out.println("Налог на другой системе: " + Math.min(premImpot, deuxImpot));
                    System.out.println("Экономия: " + Math.abs(premImpot - deuxImpot));
                    break;
                default:
                    if (fin){
                        System.out.println("Программа завершена!");
                    } else {
                        System.out.println("Вы ввели недопустимое значение.");
                    }
            }
        } while (! fin);
    }
}