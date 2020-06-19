package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.VehicleDao;
import com.bibekupreti.myapp.Models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {


    private VehicleDao vehicleDao;

    @Autowired
    public VehicleService(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    //Return list of vehicles
    public List<Vehicle> getVehicles() {
        return vehicleDao.findAll();
    }

    //SAve new vehicle
    public void save(Vehicle vehicle) {
        vehicleDao.save(vehicle);
    }

    //get by id
    public Optional<Vehicle> findById(int id) {
        return vehicleDao.findById(id);
    }

    public void delete(Integer id) {
        vehicleDao.deleteById(id);
    }
}
