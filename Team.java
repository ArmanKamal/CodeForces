import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count = 0;
        while(t-->0){
            int a,b,c;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            int sum = a+b+c;
            if(sum>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
