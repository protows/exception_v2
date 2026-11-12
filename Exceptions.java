//Класс IntegerParser преобразует строку в целое число.
//Строку на вход передают пользователи, а это всегда риск некорректного ввода данных. 
//Исключения будут генерироваться в методе parseInt().
//Важно обработать все исключения так, чтобы в случае, если они произойдут, пользователи увидели сообщения,
//с помощью которых могут исправить допущенную ошибку ввода.
//Для каждого типа исключений должен быть настроен свой вывод.
//EmptyStringException — "Введена пустая строка."
//StringNotNumberException — "Вы ввели не целое число."
//StringIsTooBigNumberException — "Введённое число слишком большое."
//StringIsTooSmallNumberException — "Введённое число слишком маленькое."
//https://github.com/practicetasks/java_tasks/blob/main/exceptions/task_2/README.md
package exception.v1;
import java.util.Scanner;
public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        try{
            final int parsedValue = IntegerParser.parseInt(inputValue);
             System.out.println(parsedValue);
        }catch(EmptyStringException exc){
           System.out.println(exc);
        }catch(StringIsTooSmallNumberException exc){
           System.out.println(exc);
        }catch(StringIsTooBigNumberException exc){
           System.out.println(exc);
        }catch(StringNotNumberException exc){
           System.out.println(exc);
        }
    }
}
