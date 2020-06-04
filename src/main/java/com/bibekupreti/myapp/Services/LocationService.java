package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.LocationDao;
import com.bibekupreti.myapp.Models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LocationService {

    private LocationDao locationDao;
    @Autowired
    public LocationService(LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    //Return list of countries
    public List<Location> getLocations(){
        return locationDao .findAll();
    }

    //SAve new Location
    public void save(Location location) {
       locationDao.save(location);
    }

    //get by id
    public Optional<Location> findById(int id) {
        return locationDao.findById(id);
    }

    public void delete(Integer id) {
        locationDao.deleteById(id);
    }

}
