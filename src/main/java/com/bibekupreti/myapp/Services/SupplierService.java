package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.SupplierDao;
import com.bibekupreti.myapp.Models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SupplierService {

    private SupplierDao supplierDao;

    @Autowired
    public SupplierService(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    //Return list of suppliers
    public List<Supplier> getSuppliers() {
        return supplierDao.findAll();
    }

    //SAve new supplier
    public void save(Supplier supplier) {
        supplierDao.save(supplier);
    }

    //get by id
    public Optional<Supplier> findById(int id) {
        return supplierDao.findById(id);
    }

    public void delete(Integer id) {
        supplierDao.deleteById(id);
    }

}
