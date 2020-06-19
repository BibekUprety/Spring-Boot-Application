package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.VehicleMaintenanceDao;
import com.bibekupreti.myapp.Models.VehicleMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenanceService {


    private VehicleMaintenanceDao vehicleMaintenanceDao;


    //Return list of vehicleMaintenances
    public List<VehicleMaintenance> getVehicleMaintenance() {
        return vehicleMaintenanceDao.findAll();
    }

    //SAve new vehicleMaintenance
    public void save(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceDao.save(vehicleMaintenance);
    }

    //get by id
    public Optional<VehicleMaintenance> findById(int id) {
        return vehicleMaintenanceDao.findById(id);
    }

    public void delete(Integer id) {
        vehicleMaintenanceDao.deleteById(id);
    }


}
