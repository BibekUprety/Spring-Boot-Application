package com.bibekupreti.myapp.Controllers;

import com.bibekupreti.myapp.Models.Contact;
import com.bibekupreti.myapp.Services.ContactService;
import com.bibekupreti.myapp.Services.CountryService;
import com.bibekupreti.myapp.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {

    private CountryService countryService;
    private StateService stateService;
    private ContactService contactService;

    @Autowired
    public ContactController(CountryService countryService, StateService stateService, ContactService contactService) {
        this.countryService = countryService;
        this.stateService = stateService;
        this.contactService = contactService;
    }

    @GetMapping("/contacts")
    public String getContacts(Model model) {
        model.addAttribute("contacts", contactService.getContacts());

        model.addAttribute("countries", countryService.getCountry());

        model.addAttribute("states", stateService.getAllState());


        return "contact";
    }

    @PostMapping("/contacts/addNew")
    public String addNew(Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping("contacts/findById")
    @ResponseBody
    public Optional<Contact> findById(int id) {
        return contactService.findById(id);
    }

    @RequestMapping(value = "/contacts/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value = "/contacts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        contactService.delete(id);
        return "redirect:/contacts";
    }
}
