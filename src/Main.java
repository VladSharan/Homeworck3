import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        while (true){
            System.out.println("Введите действие которое хотите выполнить:\n"+
                "1. Умножение числа а=12345679 на числа 9 ... 81\n"+
                "2. Распечатать в «столбик» таблицу умножения на X.\n" +
                "3. Напечатать «столбиком» значения sin 2, sin 3, ..., sin 20.\n" +
                "4. Вычислить Y по заданной формуле. \n"+
                "5. Вычисление значений функции F(x) на отрезке [a,b] с шагом h\n"+
                "6. Выход.");
            int n = k.nextInt();
            if (n==1){
                System.out.println("Результат умножения:");
                int a = 12345679;
                for (int b=9; b<=81 ; b=b+9){
                     int d = a*b;
                     System.out.println(d+" ");
                }
            }
            if (n==2){
                System.out.println("Введите число , таблицу умножения которого вS хотите посмотреть");
                int x = k.nextInt();
                int i;
                for(i=1;i<=10;i++){
                    System.out.println(x+"*"+i+"="+(x*i));
                }
            }
            if (n==3){
                System.out.println("Список синусов чисел от двух до 20");
                for (int i=2;i<=20;i++){
                    System.out.println("sin"+i+"="+Math.sin(i));
                }
            }
            if (n==4){
                System.out.println("Введите число X");
                int x = k.nextInt();
                double y = 0;
                for (int i=1;i<=13;i=i+2){
                    double y1 = ((Math.pow(x,i))/fac(i))+y;
                    if (i==13){
                    y = (-1)*y1;
                        System.out.println("результат:"+y1);
                        //Я проверял эту часть, и она все значения считает правильно кроме последнего
                    // Я не могу понять почему последнее значение она считает не правельно
                    }
                }
            }
            if (n==5){
                System.out.println("Введите начало и конец отрезка a и b соответственно");
                double a = k.nextInt();
                double b = k.nextInt();
                System.out.println("Введите интервал h с которым будет вычислятся значение фнкции F(x)");
                double h = k.nextInt();
                System.out.println("Далее х - точка исследования функции, и значения функций\n"+
                        "F(x)=tg(x) и F(x)=ctg(x)+1 соответственно равны:");
                for (double i=a;i<=b;i+=h){
                    double tan = Math.tan(i);
                    double ctg = ((1/(Math.tan(i)))+1);
                    System.out.println("F("+ i +")="+tan+"  и  F("+ i +")="+ctg);
                }
            }
            if (n==6){
                break;
            }
        }
    }

    static int fac(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}


