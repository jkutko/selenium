package src.zadaniaTesty;

public class Palindrom {

    //palindrom to wyraz który czytany od przodu i od tyłu brzmi tak samo
    //kajak

    public static void main(String[] args) {
        System.out.println(isPalindrom("oko"));
    }



    public static boolean isPalindrom(String word) {
        int n = word.length();   //zwraca dlugosc tablicy

        for (int i = 0; i < (n/2); i++) {
            if(word.charAt(i) != word.charAt(n-i-1)) {   //jeśli pierwsza jest różna od ostaniej
                return false;
            }
        }
        return true;


    }


}
