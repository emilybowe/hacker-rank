public class CountingValleys {

    public int countingValleys(int steps, String path) {
        char[] ar = path.toCharArray();
        int elevation = 0;
        int valleyCount = 0;
        for(int i = 0; i < (steps - 1); i++) {

            if(ar[i] == 'U') {
                elevation++;
            } else {
                elevation--;
            }
            if(elevation == -1 && ar[i + 1] == 'U') {
                    valleyCount++;
            } 
        } return valleyCount;

    }

}

