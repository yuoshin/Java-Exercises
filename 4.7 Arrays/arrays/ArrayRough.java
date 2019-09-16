package arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ArrayRough {
	
	static int diagonalDifference(int[][] arr) {
        int priDia = 0;
        int secDia = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == arr[0][0] || arr[i][j] == arr[1][1] || arr[i][j] == arr[2][2]){
                    priDia = priDia + (arr[i][j]);
                }
                if(arr[i][j] == arr[0][2] || arr[i][j] == arr[1][1] || arr[i][j] == arr[2][0]){
                    secDia = secDia + (arr[i][j]);
                }                
            }
        }
        int difference = priDia - secDia;
        return difference;
    }

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}