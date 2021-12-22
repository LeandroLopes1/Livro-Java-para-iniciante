class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;

        for (i = 2; i <= 100; i++) {
            isprime = true;

            // ve se o numero tem divisoes exatas
            for (j = 2; j < i; j++)
            
            // se tem divisoes exatas, nao e primo
                if (i % j == 0) 
                    isprime = false;
                  
           
            if (isprime) 
                System.out.println(i + " is prime");
            
        }
    }
}




         
        
      

       
    

