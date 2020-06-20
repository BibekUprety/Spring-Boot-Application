package com.bibekupreti.myapp.Controllers;

import com.bibekupreti.myapp.Models.VehicleMovement;
import com.bibekupreti.myapp.Services.LocationService;
import com.bibekupreti.myapp.Services.VehicleMovementService;
import com.bibekupreti.myapp.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleMovementController {


    private VehicleMovementService vehicleMovementService;
    private VehicleService vehicleService;
    	private LocationService locationService;
@Autowired
    public VehicleMovementController(VehicleMovementService vehicleMovementService, VehicleService vehicleService, LocationService locationService) {
        this.vehicleMovementService = vehicleMovementService;
        this.vehicleService = vehicleService;
        this.locationService = locationService;
    }

    @GetMapping("/vehicleMovements")
    public String getVehicleMovements(Model model) {
        model.addAttribute("vehicleMovements", vehicleMovementService.getVehicleMovements());

        model.addAttribute("vehicles", vehicleService.getVehicles());
        model.addAttribute("locations", locationService.getLocations());



        return "VehicleMovement";
    }

    @PostMapping("/vehicleMovements/addNew")
    public String addNew(VehicleMovement vehicleMovement) {
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovements";
    }

    @RequestMapping("vehicleMovements/findById")
    @ResponseBody
    public Optional<VehicleMovement> findById(int id) {
        return vehicleMovementService.findById(id);
    }

    @RequestMapping(value="/vehicleMovements/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMovement vehicleMovement) {
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovements";
    }

    @RequestMapping(value="/vehicleMovements/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehicleMovementService.delete(id);
        return "redirect:/vehicleMovements";
    }
}
