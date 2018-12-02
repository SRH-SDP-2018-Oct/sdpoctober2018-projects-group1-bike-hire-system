package edu.srh.bikehire.validator;

import edu.srh.bikehire.dtointerface.UserAccountDTO;
import edu.srh.bikehire.exception.BikeHireSystemException;
import edu.srh.bikehire.util.Util;

public class UserAccountValidator {

	private UserAccountDTO mUserAccount;

	public UserAccountValidator(UserAccountDTO pUserAccount) {
		mUserAccount = pUserAccount;
	}

	public void validateUserAccount() throws BikeHireSystemException {
		
		if (mUserAccount == null) {
			// TODO:Resolve
						throw new BikeHireSystemException(-1);
		}
		
		if(Util.isEmptyOrNullString(mUserAccount.getId())) {
			// TODO:Resolve
						throw new BikeHireSystemException(-1);
		}
		
		if(Util.isEmptyOrNullString(mUserAccount.getUserName())) {
			// TODO:Resolve
						throw new BikeHireSystemException(-1);
		}
		
		if(Util.isEmptyOrNullString(mUserAccount.getRole())) {
			// TODO:Resolve
						throw new BikeHireSystemException(-1);
		}

		if(Util.isEmptyOrNullString(mUserAccount.getAccountStatus())) {
			// TODO:Resolve
						throw new BikeHireSystemException(-1);
		}
		
		if(mUserAccount.getCreationTimeStamp() == null) {
			// TODO:Resolve
						throw new BikeHireSystemException(-1);
		}
		
		if(mUserAccount.getLastModifiedTimeStamp() == null) {
			// TODO:Resolve
			throw new BikeHireSystemException(-1);
	
		}
	}

}