import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x%2 ==0 && x!=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

}
