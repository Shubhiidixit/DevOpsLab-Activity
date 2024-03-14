//WAP to print reverse of 12345

class Reverse{
        public static void main(String args[]){
              int a= 12345;
              int b=0;
              int j;
              while(a!=0){
                           j= a%10;
                           b=b*10 +j;
                           a = a/10;   
                }         
              System.out.println(b);
           }
     }