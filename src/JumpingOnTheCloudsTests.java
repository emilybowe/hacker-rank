
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpingOnTheCloudsTests {

	@Test
	void givenClouds_shouldReturnMinimumJumps() {
		//given
		int[] clouds = {0, 0, 1, 0, 0, 1, 0};
		//then
		JumpingOnTheClouds game = new JumpingOnTheClouds();
		//when
		Assertions.assertEquals(4, game.jumpingOnClouds(clouds));
	}

}
