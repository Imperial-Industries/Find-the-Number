import java.util.Scanner;
public class app {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int min = 0;
    int max = 1000;
    int pre_num = (int)(Math.random() * ((max-min) + 1)) + min;
    int num = Math.round(pre_num);
    System.out.println("Take a guess (the range is 0 to 1000)!");
    int guess_prime = input.nextInt();
    int guess = Math.round(guess_prime);
    if(guess!=num){
      while(guess!=num){
        if(guess>num){
          System.out.println("Too high! Try again!");
        }
        if(guess<num){
          System.out.println("Too low! Try again");
        }
        guess_prime = input.nextInt();
        guess = Math.round(guess_prime);
      }
    }
    System.out.println("Correct! Would you like to play again (0 for no or 1 for yes)?");
    int restart = input.nextInt();
    if(restart==1){
      while(restart==1){
        System.out.println("You got it!");
        pre_num = (int)(Math.random() * ((max-min) + 1)) + min;
        num = Math.round(pre_num);
        System.out.println("Take a guess!");
        guess_prime = input.nextInt();
        guess = Math.round(guess_prime);
        if(guess!=num){
          while(guess!=num){
            if(guess>num){
              System.out.println("Too high! Try again!");
            }
            if(guess<num){
              System.out.println("Too low! Try again!");
            }
            guess_prime = input.nextInt();
            guess = Math.round(guess_prime);
          }
        }
        System.out.println("Correct! Would you like to play again (0 for no or 1 for yes)?");
        restart = input.nextInt();
      }
    }
    if(restart==0){
      System.out.println("Thank you for playing!");
      System.exit(0);
    }
  }
}
