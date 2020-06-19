package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.ContactDao;
import com.bibekupreti.myapp.Models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContactService {


    private ContactDao contactDao;

    @Autowired
    public ContactService(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    //Return list of Contacts
    public List<Contact> getContacts() {
        return contactDao.findAll();
    }

    //SAve new Contact
    public void save(Contact Contact) {
        contactDao.save(Contact);
    }

    //get by id
    public Optional<Contact> findById(int id) {
        return contactDao.findById(id);
    }

    public void delete(Integer id) {
        contactDao.deleteById(id);
    }


}
