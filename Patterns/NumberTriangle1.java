public class NumberTriangle1 {
    public static void main(String args[]){
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
             
                System.out.print(i-j+1);
            }
            System.out.println();
        }
    }
}

// output:
// 1
// 21
// 321
// 4321
