class invertedTraingle1{
    public static void main(String[] args) {
        int row = 4;
        for(int i = 1; i<= row; i++){
            for(int j = 1; j <= i ; j++){
                int m = i - j +1;
                System.out.print(m);
            }
            System.out.println("");
        }
    }
}