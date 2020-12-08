
public class Array2D {

    static int hourglassSum(int[][] arr) {
        int currentHourglassSum = 0;
    	int largestHourglassSum = arr[0][0] + arr[0][1] + arr[0][2] 
                + arr[1][1] + arr[2][0] + arr[2][1] 
                + arr[2][2];
        
        for(int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr.length-2; j++) {
                currentHourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
                    + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] 
                    + arr[i+2][j+2];
                if(currentHourglassSum > largestHourglassSum) {
                    largestHourglassSum = currentHourglassSum;
                }
            } 
        } return largestHourglassSum;
    }

}


