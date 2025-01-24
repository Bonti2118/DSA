public class ABCTriangle {
    public static void main(String[] args) {
        int row = 3;
        
        for(int i =1;i<=row;i++){
            for(int j=1;j<=i;j++){
                char k = (char)('A'+i-1);
                System.out.print(k);
              
            }
            System.out.println();
        }
    }
}
