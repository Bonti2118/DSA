

public class NumberTriangle {
    public static void main(String[] args) {
        int row = 4,m=1;
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >=i; j--) {
                System.out.print(m + " "); 
                m++;             
            }
         System.out.println();  
        }
    }
}
