public class Fibbonacci {

    public static void main(String[] args) {
        
        int firstTerm=0,secondTerm=1,n=5;
        System.out.println("fibbonaci series");
        for (int i=1;i<=n;i++){
          
            System.out.print(firstTerm+",");

            //calculation
           int nextTerm=firstTerm+secondTerm;
           firstTerm=secondTerm;
           secondTerm=nextTerm;

        }
    }
}