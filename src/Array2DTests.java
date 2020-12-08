import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Array2DTests {

	@Test
	void whenGivenArray_shouldReturnHourglassSum() {
		//given
		Array2D array = new Array2D();
		//when
		int[][] arr = {	{-1, -1, 0, -9, -2, -2},
						{-2, -1, -6, -8, -2, -5},
						{-1, -1, -1, -2, -3, -4},
						{-1, -9, -2, -4, -4, -5},
						{-7, -3, -3, -2, -9, -9},
						{-1, -3, -1, -2, -4, -5}};
		//then
		Assertions.assertEquals(-6, array.hourglassSum(arr));
	}

}
