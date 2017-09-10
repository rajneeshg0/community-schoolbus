package com.comunityapps.schoolbus.workflow;

import java.time.LocalDate;
import java.util.List;

import com.comunityapps.schoolbus.profile.dto.Address;
import com.comunityapps.schoolbus.workflow.dto.PickupOptions;

public interface IRideManager {
	
	String requestSchoolRide(Long childId, LocalDate date, List<Long> userIds);
	String acceptSchoolRide(Long rideId, PickupOptions pickupOption, Address pickupAddress);
	String deleteSchoolRide(Long rideId);
	String proposeChangeInPickup(Long rideId, PickupOptions pickupOption, Address pickupAddress);
	String acceptChangesInPickup(Long rideId);
	String rideComplete(Long rideId);
}
