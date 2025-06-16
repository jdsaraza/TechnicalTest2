import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please, introduce a word...");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        System.out.println("Repetitions: "+countLetters(word));

    }

    public static int countLetters (String word){

        int max = 1;
        Map<Character, Integer> aux = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (aux.isEmpty()) {
                aux.put(word.charAt(i), 1);//Add the first character
            } else {
                if (aux.containsKey(word.charAt(i))) {
                    aux.put(word.charAt(i), aux.get(word.charAt(i)) + 1);//Increase the repetitions
                } else {
                    aux.put(word.charAt(i), 1);//Add a new character
                }
            }
        }

        //Evaluate the maximum repetitions
        for( int aux2 : aux.values()){
            if(aux2 > max){
                max = aux2;
            }
        }
        return max;
    }
}
