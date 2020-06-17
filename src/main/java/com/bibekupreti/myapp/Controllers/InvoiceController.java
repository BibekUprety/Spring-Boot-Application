package com.bibekupreti.myapp.Controllers;

import com.bibekupreti.myapp.Models.Invoice;
import com.bibekupreti.myapp.Services.ClientService;
import com.bibekupreti.myapp.Services.InvoiceService;
import com.bibekupreti.myapp.Services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class InvoiceController {

    private InvoiceService invoiceService;
    private ClientService clientService;
    private InvoiceStatusService invoiceStatusService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService, ClientService clientService, InvoiceStatusService invoiceStatusService) {
        this.invoiceService = invoiceService;
        this.clientService = clientService;
        this.invoiceStatusService = invoiceStatusService;
    }

    @GetMapping("/invoices")
    public String getInvoices(Model model) {
        model.addAttribute("invoices", invoiceService.getInvoices());
        model.addAttribute("clients", clientService.getClients());
        model.addAttribute("invoiceStatuses", invoiceStatusService.getInvoiceStatuses());
        return "invoice";
    }

    @PostMapping("/invoices/addNew")
    public String addNew(Invoice invoice) {
        invoiceService.save(invoice);
        return "redirect:/invoices";
    }

    @RequestMapping("invoices/findById")
    @ResponseBody
    public Optional<Invoice> findById(int id) {
        return invoiceService.findById(id);
    }

    @RequestMapping(value = "/invoices/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Invoice invoice) {
        invoiceService.save(invoice);
        return "redirect:/invoices";
    }

    @RequestMapping(value = "/invoices/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        invoiceService.delete(id);
        return "redirect:/invoices";
    }
}
