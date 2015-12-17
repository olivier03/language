/**
 * 
 */
package com.redhat.bpm.process.languageproject.service;

import com.redhat.bpm.process.languageproject.Address;
import com.redhat.bpm.process.languageproject.Customer;

/**
 * @author rahmanoridedi
 *
 */
public interface CustomerService {

	public Long startCustomerOnboardProcess( Customer customer);
	
	public int getNumberOfCustomerOnboardProcessesInProgress();
	
	public boolean isProcessComplete( Long processId );
	
	public void addAddress( Long processId, Address address );
}