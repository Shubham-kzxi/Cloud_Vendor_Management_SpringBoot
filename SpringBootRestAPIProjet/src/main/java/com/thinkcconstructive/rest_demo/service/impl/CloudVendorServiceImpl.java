package com.thinkcconstructive.rest_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thinkcconstructive.rest_demo.model.CloudVendor;
import com.thinkcconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkcconstructive.rest_demo.service.CloudVendorService;


@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
	//	super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	
	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
	  cloudVendorRepository.save(cloudVendor);
	  
		return "success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}

}
