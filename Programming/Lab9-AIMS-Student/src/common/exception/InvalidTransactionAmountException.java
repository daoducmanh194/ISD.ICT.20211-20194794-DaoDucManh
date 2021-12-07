package common.exception;;

/**
 * Check for error in transaction amout
 * @author genkibaskervillge
 *
 */
public class InvalidTransactionAmountException extends PaymentException {
	public InvalidTransactionAmountException() {
		super("ERROR: Invalid Transaction Amount!");
	}
}
