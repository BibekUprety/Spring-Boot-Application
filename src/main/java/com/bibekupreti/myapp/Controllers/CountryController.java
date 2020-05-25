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
//@RestController
//@RequestMapping("/country")
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country")
    public String getCountries(Model model) {

        List<Country> countryList = countryService.getCountry();
        model.addAttribute("country", countryList);
        return "country";
    }

    @PostMapping("country/addCountry")
    public String addCountry(Country country){
        countryService.addCountry(country);
        return "redirect:/country";
    }
    @RequestMapping("country/findById")
    @ResponseBody
    public Optional<Country> findById(int id) {
        return countryService.findById(id);
    }

    @RequestMapping(value="/country/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country) {
        countryService.addCountry(country);
        return "redirect:/country";
    }

    @RequestMapping(value="/country/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        countryService.delete(id);
        return "redirect:/country";
    }
}
