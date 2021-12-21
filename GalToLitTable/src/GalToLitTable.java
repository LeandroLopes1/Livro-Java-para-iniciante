public class GalToLitTable {
    public static void main(String[] args) throws Exception {
        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1 ; gallons <= 100 ; gallons++) {
            liters = gallons * 3.7854; // 1 gallon = 3.7854 liters
            System.out.println(gallons + " gallons is " + liters + " liters.");
           
         counter++;
         if(counter == 10) {
             // se o contador for igual a 10, exibe uma linha em branco
             System.out.println();
             counter = 0; // zera o contador de linhas
         }
        }
    }
}
