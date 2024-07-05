//Print even numbers between 1 to 50

public class LoopsP3 {
        public static void main(String[] args) {
        for (int i = 0; i < 51; i = i + 2) {
            System.out.print(i);
        }
        for (int i = 0; i < 51; i++) {
           if ( i % 2 == 0 ) {
            System.out.println(i);
           }
        }
    }

}
