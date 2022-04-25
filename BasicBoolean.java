/**
Name: lucas lu
Date: Oct 18 
Description: 
*/

public class BasicBoolean {
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either ____true____ or _____false____
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int fNum = 5;
    int sNum = 10;
    double tNum = 5.5;

    //this prints out ____true____ because ________sNum is bigger than fNum________
    System.out.println("1: " + (fNum < sNum)); 

    //this prints out ________ because ________________
    System.out.println("2: " + (fNum > sNum)); 

    //this prints out ________ because ________________
    System.out.println("3: " + (fNum <= (int)tNum)); 
    //this prints out ________ because ________________
    System.out.println("4: " + (fNum <= tNum)); 

    /*Test out these boolean operators. Figure out the meaning
      > means: Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.	
      < means: Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.
      <= means: Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.	
      >= means: Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.	
      == means: Checks if the values of two operands are equal or not, if yes then condition becomes true.	
      != means: Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.	
    */ 


    /*
      Conjunctions
    */

    System.out.println("\nPart 2 - Conjunctions\n");
    boolean isHungry = false;
    boolean isThirsty = false;

    System.out.println((isHungry && isThirsty));
    System.out.println((isHungry || isThirsty));

    //Change the values of isHungry and isThirsty.
    //What do you think || means?

       //Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.	

    //What do you think && means?
    
      //Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.	


    System.out.println();
    System.out.println("That I am I hungry is " + !isHungry);
    System.out.println("That I should eat and drink is " + !(isHungry && isThirsty));

    //What do you think the ! means?

      //opposite operation

    System.out.println("\nPart 3 - Syntax and Understanding\n");

    //What do you think this code is trying to say?
    /*
    int val = 5
    System.out.println(0 < val < 100);
    System.out.println(val < 100 && > 0);
    System.out.println(val > 0 && val < 100);
    */
        // this code is trying to say that there should be a name of variable beside the operator

    //This happens because: 
    
        //there loss a variable name on the operator's right


    //Explain the code. Predict what it the result, and see if you are correct
    
    int x = 2;
      int y = -5;
    System.out.println((x > 0) && (x % 2 == 0));
    System.out.println((x > 0) && (x % 2 != 0));
      System.out.println((y > 0) || (y % 2 == 0));
    
    // correct
    System.out.print(!true);
    
//test for changes
    
  }
}