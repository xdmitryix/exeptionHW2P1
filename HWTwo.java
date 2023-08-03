import java.util.Scanner;

// 1.
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
// 4.
// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class HWTwo {

    public static void main(String[] args) {
        NumReturn();

    }

    public static void NumReturn(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введи число");
        String number = iScanner.nextLine();
        if (number.isEmpty()){
            throw new NullPointerException("Введена пустая строка!");
        }else{
            try {
                Float.parseFloat(number);
                System.out.println(number);
            } catch (Exception e) {
                System.out.println("Попробуйте ещё раз. Ошибка преобразования!");
            }

        }
    }
}