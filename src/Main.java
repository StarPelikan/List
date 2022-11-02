import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String number;
        while (true) {
            System.out.println("Выберете операцию:");
            System.out.println("1.Добавить");
            System.out.println("2. Показать");
            System.out.println("3. Удалить");
            String operation = scanner.nextLine();
            switch (operation) {
                case ("1"): {
                    System.out.println("Какую покупку хотите добавить?");
                    String adding = scanner.nextLine();
                    list.add(adding);
                    System.out.println("Итого в списке покупок:" + list.size() + "товар(-а,-ов)");
                    break;
                }
                case ("2"): {
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                    break;
                }
                case ("3"): {
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String numberOrName = scanner.nextLine();
                    try {
                        Integer.parseInt(numberOrName);
                        list.remove((Integer.parseInt(numberOrName)) - 1);
                        System.out.println(" Покупка " + numberOrName + " удалена, список покупок:");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + "." + list.get(i));
                        }

                    } catch (NumberFormatException e) {
                        list.remove(numberOrName);
                        System.out.println(" Покупка " + numberOrName + " удалена, список покупок:");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + "." + list.get(i));
                        }
                    }
                }
            }

        }

    }
}