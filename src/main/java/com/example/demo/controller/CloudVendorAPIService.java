package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cloudVendor.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

	CloudVendor cloudvendor;
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return cloudvendor;
				//new CloudVendor( "c1","ashit","addressone","xxxx");
		
	}
	
	@PostMapping
	public String createcloudvendordetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor=cloudvendor;
		return "cloud vendor created successfully";
	}
	@DeleteMapping("{vendorId}")
	public String deletecloudvendordetails(String vendorId) {
		this.cloudvendor=null;
		return "cloud vendor deleted successfully";
	}
	
}
