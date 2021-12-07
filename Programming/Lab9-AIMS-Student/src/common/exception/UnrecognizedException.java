package common.exception;;

/**
 * Anouce for error with unrecognized exception
 * @author genkibaskervillge
 *
 */
public class UnrecognizedException extends RuntimeException {
	public UnrecognizedException() {
		super("ERROR: Something went wrowng!");
	}
}
