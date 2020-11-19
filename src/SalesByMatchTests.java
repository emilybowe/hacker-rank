

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SalesByMatchTests {

	@Test
	void givenSockArray_ShouldReturnPairCount() {
		//given
		int[] ar = {10, 10, 20, 20, 30, 10, 20, 10, 50};
		int n = 9;
		//when
		SalesByMatch sale = new SalesByMatch();
		//then
		Assertions.assertEquals(3, sale.sockMerchant(n, ar));
	}

}
