package com.comunityapps.schoolbus.profile;

import java.util.List;

import com.comunityapps.schoolbus.profile.dto.ChildDetails;
import com.comunityapps.schoolbus.profile.dto.Trust;
import com.comunityapps.schoolbus.profile.dto.UserProfile;

public interface IProfileManager {
	
	UserProfile getUserProfile() throws Exception;
	boolean createProfile(UserProfile userProfile, String password) throws Exception;
	boolean delteProfile(Long userId) throws Exception;
	
	boolean addChild(ChildDetails child) throws Exception;
	boolean deleteChild(ChildDetails child) throws Exception;
	boolean updateChild(ChildDetails child) throws Exception;
	ChildDetails getChild(Long childId)  throws Exception;
	List<ChildDetails> getAllChildren() throws Exception;
	
	boolean reuestToAddToTrust(String emailId, Integer phoneNumber);
	boolean approveReuestToAddToTrust(List<Long> childIds);
	boolean addDefaultPickUpForTheChild(Long userId, List<Long> childIds);
	Trust getTrust(Long UserId)  throws Exception;
	List<Trust> getAllTrusts() throws Exception;
	
	
	

}
