package com.demiroren.service.business;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.demiroren.Entity.Contact;
import com.demiroren.dto.request.AddContactRequest;
import com.demiroren.dto.response.AddContactResponse;
import com.demiroren.repository.ContactRepository;
import com.demiroren.service.ContactService;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Service
public class StandartContactService implements ContactService {

	private ModelMapper modelmapper;
	private ContactRepository contactRepository;
	
	/**
	 * @param modelmapper
	 * @param contactRepository
	 */
	public StandartContactService(ModelMapper modelmapper, ContactRepository contactRepository) {
		this.modelmapper = modelmapper;
		this.contactRepository = contactRepository;
	}

	@Override
	public AddContactResponse addContact(AddContactRequest request) {

	//	var newContact= contactRepository.findby..newContact.equals(newContact);
		
		try {
			var newContact= contactRepository.save(modelmapper.map(request, Contact.class));
			System.out.println(newContact.toString());
			return modelmapper.map(newContact, AddContactResponse.class);
		} catch (Exception e) {
			throw new IllegalAccessError("NO SUCCESS");
		}
		
	}

	@Override
	public AddContactResponse getContact(AddContactRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
