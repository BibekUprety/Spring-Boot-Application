package com.bibekupreti.myapp.Controllers;

import com.bibekupreti.myapp.Models.VehicleMaintenance;
import com.bibekupreti.myapp.Services.SupplierService;
import com.bibekupreti.myapp.Services.VehicleMaintenanceService;
import com.bibekupreti.myapp.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleMaintenanceController {


    private VehicleMaintenanceService vehicleMaintenanceService;
    private VehicleService vehicleService;
    private SupplierService supplierService;

    @Autowired
    public VehicleMaintenanceController(VehicleMaintenanceService vehicleMaintenanceService, VehicleService vehicleService, SupplierService supplierService) {
        this.vehicleMaintenanceService = vehicleMaintenanceService;
        this.vehicleService = vehicleService;
        this.supplierService = supplierService;
    }

    @GetMapping("/vehicleMaintenances")
    public String getVehicleMaintenances(Model model) {
        model.addAttribute("vehicleMaintenances", vehicleMaintenanceService.getVehicleMaintenance());

        model.addAttribute("vehicles", vehicleService.getVehicles());
        model.addAttribute("suppliers", supplierService.getSuppliers());


        return "VehicleMaintenance";
    }

    @PostMapping("/vehicleMaintenances/addNew")
    public String addNew(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceService.save(vehicleMaintenance);
        return "redirect:/vehicleMaintenances";
    }

    @RequestMapping("vehicleMaintenances/findById")
    @ResponseBody
    public Optional<VehicleMaintenance> findById(int id) {
        return vehicleMaintenanceService.findById(id);
    }

    @RequestMapping(value = "/vehicleMaintenances/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceService.save(vehicleMaintenance);
        return "redirect:/vehicleMaintenances";
    }

    @RequestMapping(value = "/vehicleMaintenances/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehicleMaintenanceService.delete(id);
        return "redirect:/vehicleMaintenances";
    }

}
