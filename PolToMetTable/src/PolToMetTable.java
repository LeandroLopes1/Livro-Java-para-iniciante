public class PolToMetTable {
    public static void main(String[] args) throws Exception {
        double pol, met;
        int counter;

        counter = 0;

        for(pol = 1 ; pol <= 100 ; pol++) {
            met = pol / 39.37; // 1 metro = 39.37 polegadas
            System.out.println(pol + " pol is " + met + " metros.");

            counter++;
            if(counter == 12) {
                // se o contador for igual a 12, exibe uma linha em branco
                System.out.println();
                counter = 0; // zera o contador de linhas
            }
        }
    }
}
