import Caesar.CeasarDecoder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        CeasarDecoder decoder = new CeasarDecoder();
        Scanner in = new Scanner(System.in);
        System.out.println("Программа для расшифровки кода цезаря.\nfor test:ЮАЛЙЕ ИЫУАЮЙ ЭЛАЗАИД, 2, 5\n" +
                "Введите строку:");
        String str = in.nextLine();
        System.out.println("Введите значение 1 или 2(1 - двигаться назад по алфавиту, 2 двигаться вперед по алфавиту:");
        int sign =in.nextInt();
        System.out.println("Введите шаг:");
        int shift = in.nextInt();
        System.out.println("Расшифрованная строка:"+decoder.decoderMethod(str,sign,shift));
    }//for test ЮАЛЙЕ ИЫУАЮЙ ЭЛАЗАИД, 2, 5
}
