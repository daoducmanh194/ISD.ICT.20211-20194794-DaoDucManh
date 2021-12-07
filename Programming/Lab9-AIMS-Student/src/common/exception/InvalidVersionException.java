package common.exception;;

/** 
 * Check for error in Version
 * @author genkibaskervillge
 *
 */

public class InvalidVersionException extends PaymentException{
	public InvalidVersionException() {
		super("ERROR: Invalid Version Information!");
	}
}
