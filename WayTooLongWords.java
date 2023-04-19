import java.util.Scanner;

public class WayTooLongWords {  // O(n+m)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String[] words = new String[input];
        // O(n)
        for(int i=0;i<input;i++){
            words[i] = scanner.next();
        }
        for(int i=0;i<words.length;i++){ // O(n+m)
            int count = 0;
            if(words[i].length() >10){
                for(int j=1;j<words[i].length()-1;j++){
                    count++;
                }
                //localization
                //
                System.out.println(words[i].charAt(0)+""+count+""+words[i].charAt(words[i].length()-1));
            }
            else{
                System.out.println(words[i]);
            }
        }
    }
}
