package hienthimatrannhiphan;

import java.util.Scanner;

public class HienThiMaTranNhiPhan {

    public static void printMatrix(int n){
        int [][] a= new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double x =Math.random();
                if(x>0.5) a[i][j]=1;
                else a[i][j]=0;
            }
        }
        
        for(int []element : a){
            for(int x : element){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size=sc.nextInt();
        printMatrix(size);
    }
    
}
