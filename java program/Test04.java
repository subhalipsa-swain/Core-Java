class Test04{
    public static void main(String args[]){
       int n=14;
       int i=2;
       int count=0;
       while(i<n){
         if(n%i==0){
           count++;
         }
         if(i/n!=0){
           i++;    
         }
    
         if(count==0){
            System.out.println("no is prime");
         }else{
            System.out.println("no is not prime");
          }
        }
      }
   }
   