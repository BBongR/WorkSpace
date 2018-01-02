package com.spring51.jstl;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ElController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/el/el01", method = RequestMethod.GET)
    public String el01(Locale locale, Model model) {
        logger.info("el01");

        return "el/el01"; // --> views / el / el01.jsp
    }

    @RequestMapping(value = "/el/el02", method = RequestMethod.GET)
    public String jstl02(Model model) {
        logger.info("el02");

        return "el/el02";
    }

    @RequestMapping(value = "/el/el02sub", method = RequestMethod.GET)
    public String jstl02sub(Model model) {
    logger.info("el02sub");

    return "el/el02sub";
    }

}
