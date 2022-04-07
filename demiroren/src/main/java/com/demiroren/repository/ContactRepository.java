/**
 * 
 */
package com.demiroren.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demiroren.Entity.Contact;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, String>
{

}
