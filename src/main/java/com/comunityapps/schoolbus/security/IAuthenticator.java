package com.comunityapps.schoolbus.security;

public interface IAuthenticator {
	boolean authenticate(String email, String password) throws Exception;
	void forgotPassword(String emailId);
	void changePassword(String emailId, String oldPassword, String newPassword);
	

}
