public class ABCTriangle2 {
    public static void main(String[] args) {
        int row =4;
        char k = 'A';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
