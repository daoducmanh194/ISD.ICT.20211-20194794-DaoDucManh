package common.exception;;

/**
 * Check for error in InternalSeverException
 * 
 * @author genkibaskervillge
 *
 */
public class InternalServerErrorException extends PaymentException {
	public InternalServerErrorException() {
		super("ERROR: Internal Server Error!");
	}
}
