public class D02Conditional {
  public static void main (String[] args) {
    // if else -> control program flow
    int x = 10;
    if (x > 12){
      System.out.println("hello");
    } else { // x <=12
      System.out.println("goodbye");
    }

    // declare y = ;
    // declare counter
    // check if double value y > 999.5, counter +1, otherwise, counter + 2
    // print out counter

    double y = 1000;
    int counter = 0;
    if (y > 999.5){
      counter =counter + 1;
    } else {
      counter = counter +2;
    }
    System.out.println(counter); // 1

    // and or
    int a = 10;
    int b = 90;

    //! && and
    if (a > 5 && b > 80) {
      System.out.println("do something..."); // print
    } else {
      System.out.println("do something else...");
    }

    // ! || or
    // && > ||
    // a > 9 && b > 90 -> ture && false -> false
    // b % 2 == 0 -> true
    // finally: false || ture -> ture
    if (a > 9 && b > 90 || b % 2 == 0){
      System.out.println("correct"); // print
    } else {
      System.out.println("incorrect");
    }

    int age = 66;
    // char gender = 'F'
    // char smoker = 'F'
    boolean isMale = false;
    boolean isSmoker = true;
    double premium = 100.0;

    // Conditions:
    // 1) Female -> 10% extra premium
    // 2) Smoker -> 15& extra premium
    // 3) Age > 50 and Male -> 8% extra premium

    //
    
      
      
    

    

    if (age > 50 ){
      if (isMale = true){
        premium = premium * 1.08;
      }
    }else{
      premium = premium * 1;
    }
    if (isMale = false){
      premium = premium * 1.1;
    }else{
      premium = premium * 1;
    }
    if (isSmoker = true){
      premium = premium * 1.15;
    }else{
      premium = premium * 1;
    
    }

    System.out.println(premium);


  }
  
}
