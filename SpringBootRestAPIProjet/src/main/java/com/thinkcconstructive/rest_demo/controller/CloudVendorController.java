package com.thinkcconstructive.rest_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thinkcconstructive.rest_demo.model.CloudVendor;
import com.thinkcconstructive.rest_demo.service.CloudVendorService;
import com.thinkcconstructive.rest_demo.model.*;





@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

	CloudVendorService cloudVendorService;
	
	
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		//super();
		this.cloudVendorService = cloudVendorService;
	}
   //read specific cloud vendor details
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		
		return cloudVendorService.getCloudVendor(vendorId);

	}
	
	//read all cloud vendors from db
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		
		return cloudVendorService.getAllCloudVendors();

	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor Created Successully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	   cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor updated Successully";
	}
	
	//@DeleteMapping({"vendorId"})   

@RequestMapping(value = "/{vendorId"
		+ "}",method=RequestMethod.DELETE)
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String VendorId) {
		cloudVendorService.deleteCloudVendor(VendorId);
		return "Cloud Vendor deleted Successully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
