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
public class JstlController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/jstl/jstl01", method = RequestMethod.GET)
    public String jstl01(Locale locale, Model model) {
        logger.info("jstl01");

        return "jstl/jstl01"; // --> views / jstl / jstl01.jsp
    }

    @RequestMapping(value = "/jstl/jstl02", method = RequestMethod.GET)
    public String jstl02(Locale locale, Model model) {
        logger.info("jstl02");

        int num1 = 7;
        int num2 = 9;

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);

        return "jstl/jstl02"; // --> views / jstl / jstl02.jsp
    }

    @RequestMapping(value = "/jstl/jstl03", method = RequestMethod.GET)
    public String jstl03(Locale locale, Model model) {
        logger.info("jstl03");

        return "jstl/jstl03"; // --> views / jstl / jstl03.jsp
    }

    @RequestMapping(value = "/jstl/jstl11", method = RequestMethod.GET)
    public String jstl11(Locale locale, Model model) {
        logger.info("jstl11");

        return "jstl/jstl11"; // --> views / jstl / jstl11.jsp
    }

    @RequestMapping(value = "/jstl/jstl12", method = RequestMethod.GET)
    public String jstl12(Locale locale, Model model) {
        logger.info("jstl12");

        return "jstl/jstl12"; // --> views / jstl / jstl12.jsp
    }

    @RequestMapping(value = "/jstl/jstl21for", method = RequestMethod.GET)
    public String jstl21for(Locale locale, Model model) {
        logger.info("jstl21for");

        return "jstl/jstl21for"; // --> views / jstl / jstl21for.jsp
    }

    @RequestMapping(value = "/jstl/jstl22foreach", method = RequestMethod.GET)
    public String jstl22foreach(Model model) {
        logger.info("jstl22foreach");

        /* ====String 배열===== */
        String[] arr = { "순두부", "된장찌개", "제육덮밥" };
        model.addAttribute("array", arr);

        /* ====ArrayList 배열===== */
        List<String> arr1 = new ArrayList<String>();
        arr1.add("두부");
        arr1.add("찌개");
        arr1.add("덮밥");

        model.addAttribute("list", arr1);

        return "jstl/jstl22foreach";
    }

    @RequestMapping(value = "/jstl/jstl23fortokens", method = RequestMethod.GET)
    public String jstl23fortokens(Model model) {
    logger.info("jstl23fortokens");

    model.addAttribute("member", "효성^^지은~선화/징거");

    return "jstl/jstl23fortokens";
    }
    
    @RequestMapping(value = "/jstl/jstl31includefile", method = RequestMethod.GET)
    public String jstl31includefile(Model model) {

    return "jstl/jstl31includefile";
    }

    @RequestMapping(value = "/jstl/jstl32includepage", method = RequestMethod.GET)
    public String jstl32includepage(Model model) {

    return "jstl/jstl32includepage";
    }
    
    @RequestMapping(value = "/jstl/jstl32sub", method = RequestMethod.GET)
    public String jstl32sub(Model model) {

    return "jstl/jstl32sub";
    }
    
    @RequestMapping(value = "/jstl/jstl33import", method = RequestMethod.GET)
    public String jstl33import(Model model) {

    return "jstl/jstl33import";
    }
    
    @RequestMapping(value = "/jstl/jstl41redirect", method = RequestMethod.GET)
    public String jstl41redirect(Model model) {

    return "jstl/jstl41redirect";
    }
    
    @RequestMapping(value = "/jstl/jstl42forward", method = RequestMethod.GET)
    public String jstl42forward(Model model) {

    return "jstl/jstl42forward";
    }
    
     @RequestMapping(value = "/jstl/jstl61scope", method = RequestMethod.GET)
     public String jstl61scope(Model model) {
     logger.info("jstl61scope");

     return "jstl/jstl61scope";
     }
     
     @RequestMapping(value = "/jstl/jstl61sub", method = RequestMethod.GET)
     public String jstl61sub(Model model) {
     logger.info("jstl61sub");

     return "jstl/jstl61sub";
     }
     
}
