package com.comunityapps.schoolbus.security;

import com.comunityapps.schoolbus.profile.dto.ChildDetails;
import com.comunityapps.schoolbus.profile.dto.UserProfile;

public interface IAuthrorizer {
	boolean authorize(UserProfile userProfile, ChildDetails childDetails);
}
