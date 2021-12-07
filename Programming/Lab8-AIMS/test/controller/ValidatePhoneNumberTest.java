package controller;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidatePhoneNumberTest {
	
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"0123456789,true",
		"01234,false",
		"abc123,false",
		"1234567890,false"
	})

	//@Test
	// chi dung dinh nghia cho 1 testcase duy nhat
	public void test(String phone, boolean expected) {
		// boolean isValided = placeOrderController.validatePhoneNumber("0123456789");
		// assertEquals(true, isValided);
		
		// When
		boolean isValid = placeOrderController.validatePhoneNumber(phone);
		// then
		assertEquals(expected, isValid);
	}

}
