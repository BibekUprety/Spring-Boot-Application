package com.bibekupreti.myapp.Controllers;

import com.bibekupreti.myapp.Models.Country;
import com.bibekupreti.myapp.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public String getCountries(Model model) {

        List<Country> countryList = countryService.getCountry();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @PostMapping("country/addCountry")
    public String addCountry(Country country){
        countryService.addCountry(country);
        return "redirect:/countries";
    }
    @RequestMapping("country/findById")
    @ResponseBody
    public Optional<Country> findById(int id) {
        return countryService.findById(id);
    }

    @RequestMapping(value="/country/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country) {
        countryService.addCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value="/country/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        countryService.delete(id);
        return "redirect:/countries";
    }
}
