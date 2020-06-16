package com.bibekupreti.myapp.Controllers;


import com.bibekupreti.myapp.Models.Country;
import com.bibekupreti.myapp.Models.State;
import com.bibekupreti.myapp.Services.CountryService;
import com.bibekupreti.myapp.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {


    private StateService stateService;

    private CountryService countryService;
    @Autowired
    public StateController(StateService stateService, CountryService countryService) {
        this.stateService = stateService;
        this.countryService = countryService;
    }

    @GetMapping("/states")
    public String getStates(Model model) {
        List<State> stateList = stateService.getAllState();
        model.addAttribute("states", stateList);

        List<Country> countryList = countryService.getCountry();
        model.addAttribute("countries", countryList);

        return "state";
    }

    @PostMapping("/states/addNew")
    public String addNew(State state) {
        stateService.addState(state);
        return "redirect:/states";
    }

    @RequestMapping("states/findById")
    @ResponseBody
    public Optional<State> findById(int id) {
        return stateService.getById(id);
    }

    @RequestMapping(value="/states/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(State state) {
        stateService.addState(state);
        return "redirect:/states";
    }

    @RequestMapping(value="/states/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        stateService.deleteState(id);
        return "redirect:/states";
    }

}
