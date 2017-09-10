package com.comunityapps.schoolbus.workflow.dto;

import com.comunityapps.schoolbus.profile.dto.Address;

public class RideDetails {
	
	private Long rideId;
	private Long requester;
	private Long childId;
	private Long driver;
	private PickupOptions pickupOptions;
	private Address pickupAddress;
}
