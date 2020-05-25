package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.CountryDao;
import com.bibekupreti.myapp.Models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private CountryDao countryDao;
    @Autowired
    public CountryService(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public List<Country> getCountry(){
        return countryDao.findAll();
    }

    public void addCountry(Country country){
        countryDao.save(country);
    }

    public Optional<Country> findById(int id){
        return countryDao.findById(id);
    }

    public void delete(Integer id){ countryDao.deleteById(id); }

}
