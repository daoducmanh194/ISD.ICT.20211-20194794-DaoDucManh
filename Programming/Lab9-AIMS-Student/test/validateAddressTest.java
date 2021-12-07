import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class validateAddressTest {
	
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"haiduong, true",
		"HO CHI MINH, true",
		"So 45 Truong Dinh Ha Noi, true",
		"So # Nha Trang, false",
		"null, false"
	})

	//@Test
	void test(String address, boolean expected) {
		boolean isValid = placeOrderController.validateAddress(address);
		assertEquals(expected, isValid);
		// fail("Not yet implemented");
	}

}
