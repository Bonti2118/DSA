public class ABCpattern2 {
    public static void main(String[] args) {
        int row = 3;
     
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row; j++) {
                char k = (char)('A'+i+j-2);
                System.out.print(k);
               
            }
            System.out.println();
        }
    }

}
