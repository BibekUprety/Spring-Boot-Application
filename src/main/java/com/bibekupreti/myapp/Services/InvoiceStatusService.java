package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.InvoiceStatusDao;
import com.bibekupreti.myapp.Models.InvoiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {


    private InvoiceStatusDao invoiceStatusDao;
    @Autowired
    public InvoiceStatusService(InvoiceStatusDao invoiceStatusDao) {
        this.invoiceStatusDao = invoiceStatusDao;
    }


    //Return list of countries
    public List<InvoiceStatus> getInvoiceStatuses(){
        return invoiceStatusDao.findAll();
    }

    //SAve new InvoiceStatus
    public void save(InvoiceStatus invoiceStatus) {
        invoiceStatusDao.save(invoiceStatus);
    }

    //get by id
    public Optional<InvoiceStatus> findById(int id) {
        return invoiceStatusDao.findById(id);
    }

    public void delete(Integer id) {
        invoiceStatusDao.deleteById(id);
    }
}
