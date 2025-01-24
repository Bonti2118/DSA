public class ABCpatten {
    
    public static void main(String args[]){
        int row= 3;
        int col=3;
       
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
              char k = (char)('A'+j-1);  
               System.out.print(k);           
            } 
            System.out.println();   
        }
    }
}


// output:
// ABC
// ABC
// ABC