package common.exception;

/**
 * Anouce for error of not enough balance
 * @author genkibaskervillge
 *
 */
public class NotEnoughBalanceException extends PaymentException{

	public NotEnoughBalanceException() {
		super("ERROR: Not enough balance in card!");
	}

}
