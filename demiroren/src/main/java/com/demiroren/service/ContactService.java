package com.demiroren.service;

import com.demiroren.dto.request.AddContactRequest;
import com.demiroren.dto.response.AddContactResponse;

/**
 * @author Remzi ŞAHBAZ
 *
 */

public interface ContactService {

	public AddContactResponse addContact(AddContactRequest request) ;
	public AddContactResponse getContact(AddContactRequest request) ;
	
	
}
