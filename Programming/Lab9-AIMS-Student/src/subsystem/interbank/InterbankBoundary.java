package subsystem.interbank;

import common.exception.UnrecognizedException;
import utils.ApplicationProgrammingInterface;

/**
 * This methods using url and data for input
 * for return the respond from server to program.
 * 
 * @author genkibaskervillge
 * @version 1.0
 * @param Sring url
 * @param String data
 * @return String respond
 */
public class InterbankBoundary {

	String query(String url, String data) {
		String response = null;
		try {
			response = ApplicationProgrammingInterface.post(url, data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new UnrecognizedException();
		}
		return response;
	}
}
