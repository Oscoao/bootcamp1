public class D02DataType {
  public static void main (String[] args) {
    // int, double, string, boolean, char
    //"hello   WORLD  !!!!" -> String value
    // s1 -> String variable
    String s1 = "hello   WORLD  !!!!";
    System.out.println(s1);

    // variable naming convention -> camel case
    // Never: is_male, ismale, etc
    boolean isMale = true;

    int age = 66;
    boolean isElderly = age > 65;
    // Step 1: age > 65 -> true value
    // Step 2: assign true value into boolean variable
    System.out.println(isElderly); // true

    char gender = 'M';
    System.out.println(gender);
    // ! define char value -> use single quote ''
    // ! define String value -> use double quote ""
    // ! char value has to be single character

    // java ~30 years
    // byte, short, int and long
    byte age2 = 100;
    // byte: -128 to 127
    // short: -32xxx to 32xxx
    // int: -2.1 billion to 2.1 billion
    // long: -2^63 to 2^63

    // ! Java: long > int > short > byte (level of type)
    long l1 = 100;
    //Step 1: assign 100 int value into long type variable (ok)
    System.out.println(l1); // 100

    long l2 = 100L;
    // assign 100L long value into long type variable (ok)
    System.out.println(l2); // 100

    byte b1 = 127;
    byte b2 = -128;
    // byte b3 = 128; // out of range

    short s3 = 32767;
    // short s44 = 32768;
    short s4 = -32768;

    int result = b1 + 7;
    // Step1: byte value + int value -> int value
    // Step2: assign int value into int variable
    System.out.println(result); // 134


    // 100L (long value)
    // "100L" (String value)
    String s2 = "100L";
    System.out.println(s2); // 100L


  }
}
