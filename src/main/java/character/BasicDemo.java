package character;

public class BasicDemo {

  public static void main(String[] args) {
    char letter1 = 'A';
    char letter2 = '\u0041';
    System.out.println(letter2);

    System.out.println(--letter2);

    //He said "Java" is fun
    System.out.println("He said\t \"Java\" is\n fun \\");

    char ch = (char) 0X0041;
    System.out.println(ch);

    byte b = (byte) '\uFFF4';
    System.out.println(b);
    System.out.println('\uFFF4');
    System.out.println(Math.pow(2, 8));

    char c1 = '\uFF13';
    //System.out.println('\u10002');
    System.out.println(c1);
//
//
    char[] math_fraktur_cap_g = Character.toChars(0x10280);
    System.out.println(math_fraktur_cap_g);

    char ch2 = (char) 0xAB0041;
    System.out.println(ch2);

    char ch3 = (char) 65.25;
    System.out.println(ch3);

    int i = 'A';
    System.out.println("i=" + i);

    byte j = (byte) '\uFF01';
    System.out.println("j=" + j);

    int k = '2'+'3';
    System.out.println("k="+k);

    int k1 = 2+'a';
    System.out.println((char)k1);
    System.out.println(k1);

    System.out.println("Andrew "+'5');

    //字符的比较和测试
    System.out.println('a'<'b');
    System.out.println('a'>'b');
    System.out.println('a'>='b');
    System.out.println('a'<='b');
    System.out.println('a'=='b');

    System.out.println("==================");

    System.out.println(Character.isDigit('8'));
    System.out.println(Character.isUpperCase('A'));
    System.out.println(Character.isLowerCase('a'));
  }
}
