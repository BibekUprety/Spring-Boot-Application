package com.bibekupreti.myapp.Controllers;

import com.bibekupreti.myapp.Models.Supplier;
import com.bibekupreti.myapp.Services.CountryService;
import com.bibekupreti.myapp.Services.StateService;
import com.bibekupreti.myapp.Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SupplierController {


    private SupplierService supplierService;
    private CountryService countryService;
    private StateService stateService;

    @Autowired
    public SupplierController(SupplierService supplierService, CountryService countryService, StateService stateService) {
        this.supplierService = supplierService;
        this.countryService = countryService;
        this.stateService = stateService;
    }

    @GetMapping("/suppliers")
    public String getSuppliers(Model model) {
        model.addAttribute("suppliers", supplierService.getSuppliers());

        model.addAttribute("countries", countryService.getCountry());

        model.addAttribute("states", stateService.getAllState());


        return "supplier";
    }

    @PostMapping("/suppliers/addNew")
    public String addNew(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping("suppliers/findById")
    @ResponseBody
    public Optional<Supplier> findById(int id) {
        return supplierService.findById(id);
    }

    @RequestMapping(value = "/suppliers/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping(value = "/suppliers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        supplierService.delete(id);
        return "redirect:/suppliers";
    }

}
