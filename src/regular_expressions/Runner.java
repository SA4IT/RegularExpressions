package regular_expressions;

import java.util.regex.*;

public class Runner {
    public static void main(String[] args) {
        System.out.println('\n');
        //2.	Написать регулярное выражение, определяющее является ли данная строка строкой "abcdefghijklmnopqrstuv18340" или нет.
        //a)	пример правильных выражений: abcdefghijklmnopqrstuv18340
        String str = "abcdefghijklmnopqrstuv18340";
        Pattern ptr = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher m = ptr.matcher(str);
        System.out.print(str +" ");
        if(m.matches() == true){
            System.out.println("Является строкой");
        }else System.out.println("Не является строкой");
        System.out.println('\n');


        //1.	Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
        String str2 = "45п56п 6h56h6 PTU 4046732 USD а5е4п5234 644235.245 RUВ 435ю635 24453 EU 40432 ПSD 8547.546 EU  а5е45234 43654235.245 RUB";
        Pattern ptr2 = Pattern.compile("\\d+(\\.\\d+\\s{1}\\D[EUR]\\D{1,2}|\\s{1}[USR]\\D{1,2})");
        Matcher m2 = ptr2.matcher(str2);
        while (m2.find()) {
            System.out.println("Цены в валюте (USD, RUВ, EU) " + m2.group());
        }
        System.out.println('\n');

        //4.	Написать регулярное выражение, определяющее является ли данная строчка допустимым (корректным) е-mail адресом согласно RFC под номером 2822.
        //– пример правильных выражений: user@example.com, root@localhost
        String str3 = "gdfge5hrbgfh@gmail.com yukuyk_jujn@ korenev3544_4534@yandex.ru 5656_safa.ru 564tbybtyb naumov007@yandex.ru uytjjjjy 878787@gmail.";
        Pattern ptr3 = Pattern.compile("\\w+\\@\\w+\\.\\w{2,3}");
        Matcher m3 = ptr3.matcher(str3);
        while (m3.find()){
            System.out.println("e-mail: "+ m3.group());
        }
    }
}
