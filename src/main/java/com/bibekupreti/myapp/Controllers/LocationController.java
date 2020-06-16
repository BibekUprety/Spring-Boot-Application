package com.bibekupreti.myapp.Controllers;

import com.bibekupreti.myapp.Dao.StateDao;
import com.bibekupreti.myapp.Models.Country;
import com.bibekupreti.myapp.Models.Location;
import com.bibekupreti.myapp.Models.State;
import com.bibekupreti.myapp.Services.CountryService;
import com.bibekupreti.myapp.Services.LocationService;
import com.bibekupreti.myapp.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {


    private StateService stateService;
    private CountryService countryService;
    private LocationService locationService;

    @Autowired
    public LocationController(StateService stateService, CountryService countryService, LocationService locationService) {
        this.stateService = stateService;
        this.countryService = countryService;
        this.locationService = locationService;
    }

    @GetMapping("/locations")
    public String getStates(Model model) {

        List<State> stateList = stateService.getAllState();
        List<Country> countryList = countryService.getCountry();
        List<Location> locationList = locationService.getLocations();

        model.addAttribute("countries", countryList);
        model.addAttribute("locations", locationList);
        model.addAttribute("states", stateList);
        return "location";
    }

    @PostMapping("/locations/addNew")
    public String addNew(Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping("locations/findById")
    @ResponseBody
    public Optional<Location> findById(int id) {
        return locationService.findById(id);
    }

    @RequestMapping(value = "/locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping(value = "/locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        locationService.delete(id);
        return "redirect:/locations";
    }
}
