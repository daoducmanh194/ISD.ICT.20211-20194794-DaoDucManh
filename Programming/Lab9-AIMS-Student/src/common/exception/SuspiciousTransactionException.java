package common.exception;;

/**
 * Anouce for the error in suspiciousTransaction 
 * @author genkibaskervillge
 *
 */
public class SuspiciousTransactionException extends PaymentException {
	public SuspiciousTransactionException() {
		super("ERROR: Suspicious Transaction Report!");
	}
}
