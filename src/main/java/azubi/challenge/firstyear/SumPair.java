package main.java.azubi.challenge.firstyear;

public class SumPair {

    /**
     * Für eine beliebige Anzahl an positiven Zahlen, finde ein Päarchen, deren
     * Summe der gegegeben Summe entspricht und gib eine Erfolgsmeldung (true)
     * zurück.
     * 
     * Falls kein Päarchen existiert, gebe false zurück.
     * 
     * Beispiel 1: numbers = [10, 3, 15, 15, 15, 7] sum = 17 result = true // 10 + 7
     * == 17
     * 
     * Beispiel 2: numbers = [1] sum = 17 result = false // es gibt keine Summe mit
     * nur einer Zahl
     * 
     * Beispiel 3: numbers = [1, 2] sum = 17 result = false // es gibt kein Päarchen
     * mit der Summe 17
     * 
     * @return true, if one pairs' total equals given sum
     */
    public static boolean sumPairExists(int sum, int[] numbers) {

        int length = numbers.length;
        int counter1 = 0;
        int counter2 = 1;

        while (counter1 < length && counter2 < length) {
            if (counter1 != counter2) {
                if (numbers[counter1] + numbers[counter2] == sum) {
                    return true;
                } else if(counter2 < length) {
                    counter2++;
                } if (counter2 == length) {
                    counter1++;
                }
            } else {
               counter2++;
           }
        }
        return false;
    } 
}