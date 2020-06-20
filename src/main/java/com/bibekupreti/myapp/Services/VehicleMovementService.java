package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.VehicleMovementDao;
import com.bibekupreti.myapp.Models.VehicleMovement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VehicleMovementService {

    private VehicleMovementDao vehicleMovementDao;
@Autowired
    public VehicleMovementService(VehicleMovementDao vehicleMovementDao) {
        this.vehicleMovementDao = vehicleMovementDao;
    }
    //Return list of vehicleMovements
    public List<VehicleMovement> getVehicleMovements(){
        return vehicleMovementDao.findAll();
    }

    //SAve new vehicleMovement
    public void save(VehicleMovement vehicleMovement) {
        vehicleMovementDao.save(vehicleMovement);
    }

    //get by id
    public Optional<VehicleMovement> findById(int id) {
        return vehicleMovementDao.findById(id);
    }

    public void delete(Integer id) {
        vehicleMovementDao.deleteById(id);
    }
}
