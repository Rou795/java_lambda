
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

// происходит попытка деления 3 (a) на 0 (b) в строке ниже. Обработчик поставил в класс Calculator
// поскольку обертывать в него вызываемую функцию деления в main кажды раз выглядит слишком сложным.
// Однако из-за этого пришлось изменить тип переменной для результата опреации с примитивного (int) на ссылочный (Integer)
// - это связано с ошибкой NullPointerException, которую каким-либо другим способом я перехватить не смог(

        Integer c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}