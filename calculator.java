import java.util.Scanner;

public class calculator{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
          // take input from user till the user does not press X or x
          int ans = 0;
          while(true){
              //take the operator as input
              System.out.print("Enter The Operator: ");
              char op = in.next().trim().charAt(0);
              if(op == '+' || op == '-'|| op == '*' || op == '/' || op == '%'){
                  // input two numbers
                  System.out.print("Enter num1: ");
                  int num1 = in.nextInt();
                  // int num1 = x;
                  System.out.print("Enter num2: ");
                  int num2 = in.nextInt();
                  // int num2 = y;

                  if (op == '+'){
                      ans = num1 + num2;
                  } else if (op == '-'){
                      ans = num1 - num2;
                  } else if (op == '*'){
                      ans = num1 * num2;
                  } else if (op == '/'){
                      ans = num1 / num2;
                  } else if (op == '%'){
                      ans = num1 % num2;
                  }
              } else if (op == 'X' || op == 'x'){
                  break;
              } else {
                  System.out.println("Invalid Operator");
              }
              System.out.println(ans);
          }
          in.close();
  }
}