package com.bibekupreti.myapp.Controllers;

import com.bibekupreti.myapp.Models.Client;
import com.bibekupreti.myapp.Services.ClientService;
import com.bibekupreti.myapp.Services.CountryService;
import com.bibekupreti.myapp.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class ClientController {
    private ClientService clientService;
    private CountryService countryService;
    private StateService stateService;

    @Autowired
    public ClientController(ClientService clientService, CountryService countryService, StateService stateService) {
        this.clientService = clientService;
        this.countryService = countryService;
        this.stateService = stateService;
    }

    @GetMapping("/clients")
    public String getClients(Model model) {
        model.addAttribute("clients", clientService.getClients());

        model.addAttribute("countries", countryService.getCountry());

        model.addAttribute("states", stateService.getAllState());


        return "Client";
    }

    @PostMapping("/clients/addNew")
    public String addNew(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping("clients/findById")
    @ResponseBody
    public Optional<Client> findById(int id) {
        return clientService.findById(id);
    }

    @RequestMapping(value="/clients/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value="/clients/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        clientService.delete(id);
        return "redirect:/clients";
    }
}
