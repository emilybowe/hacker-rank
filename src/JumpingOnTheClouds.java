
public class JumpingOnTheClouds {

    public int jumpingOnClouds(int[] c) {
        int minJumps = (c.length)/2;
        for(int i = 0; i < (c.length-1); i++) {
            if(c[i] == 1 && i%2 == 0) {
                minJumps++;
            }
        } return minJumps;
    }
}

