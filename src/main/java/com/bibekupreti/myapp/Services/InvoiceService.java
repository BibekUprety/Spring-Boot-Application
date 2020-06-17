package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.InvoiceDao;
import com.bibekupreti.myapp.Models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {


    private InvoiceDao invoiceDao;

    @Autowired
    public InvoiceService(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }

    //Return list of invoices
    public List<Invoice> getInvoices() {
        return invoiceDao.findAll();
    }

    //SAve new invoice
    public void save(Invoice invoice) {
        invoiceDao.save(invoice);
    }

    //get by id
    public Optional<Invoice> findById(int id) {
        return invoiceDao.findById(id);
    }

    public void delete(Integer id) {
        invoiceDao.deleteById(id);
    }

}
