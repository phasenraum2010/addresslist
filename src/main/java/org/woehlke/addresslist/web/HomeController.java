package org.woehlke.addresslist.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private final static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	/**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/")
    public String home(Model model) {
        LOGGER.info("HTTP-Request for /");
        return "home";
    }
}
