package org.woehlke.addresslist.web;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.addresslist.entities.Address;
import org.woehlke.addresslist.services.AddressService;

@Controller
public class HomeController {

	private final static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private AddressService addressService;
	
	/**
     * Zeigt die Liste der bisher gespeicherten Addressen an.
     */
    @RequestMapping(value = "/")
    public String home(Model model) {
        LOGGER.info("HTTP-Request for /");
        List<Address> addresses = addressService.getAllAddresses();
        model.addAttribute("addresses",addresses);
        return "home";
    }
    
    /**
     * delete.
     */
    @RequestMapping(value = "/delete/{id}")
    public String delete(Model model, @PathVariable long id) {
        LOGGER.info("HTTP-Request for /delete/"+id);
        addressService.delete(id);
        return "redirect:/";
    }
    
    
    /* Neu */ 
    
    /* Edit/Update */
}
