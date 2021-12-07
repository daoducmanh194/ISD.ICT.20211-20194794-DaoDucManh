package common.exception;

/**
 * Anouce for error in not enough transaction
 * @author genkibaskervillge
 *
 */
public class NotEnoughTransactionInfoException extends PaymentException {
public NotEnoughTransactionInfoException() {
	super("ERROR: Not Enough Transcation Information");
}
}
