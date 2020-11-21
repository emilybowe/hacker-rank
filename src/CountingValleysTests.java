import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingValleysTests {

	@Test
	void givenPath_shouldReturnValleyCount() {
		//given
		
		//when
		CountingValleys valley = new CountingValleys();
		//then
		Assertions.assertEquals(2, valley.countingValleys(12, "DDUUDDUDUUUD"));
	}

}
