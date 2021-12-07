package common.exception;;

/**
 * Anouce for eror in payment
 * @author genkibaskervillge
 *
 */
public class PaymentException extends RuntimeException {
	public PaymentException(String message) {
		super(message);
	}
}
