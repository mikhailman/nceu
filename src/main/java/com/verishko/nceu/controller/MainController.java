package com.verishko.nceu.controller;

import com.verishko.nceu.model.CurrencyFormFields;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

@Controller
@RequestMapping("/")
public class MainController {

//        return "Hello World!";
//        return "https://www.nbrb.by/API/ExRates/Rates/Dynamics/145?startDate=2016-7-1&endDate=2016-7-30";

//        return "https://www.nbrb.by/api/exrates/currencies/298";    // RUB
//        return "https://www.nbrb.by/api/exrates/currencies/145";    // USD
//        return "https://www.nbrb.by/api/exrates/currencies/431";    // USD

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        String baseURL = "https://www.nbrb.by/api/exrates/currencies";
        RestTemplate restTemplate = new RestTemplate();
        model.addAttribute("title", "Main page");
        model.addAttribute("formFields", new CurrencyFormFields());
        Object[] list = restTemplate.getForObject(baseURL, Object[].class);
//        assert list != null;
//        for (int i = 0; i < list.length; i++) {
//            if ((Integer.parseInt(((LinkedHashMap) list[i]).get("Cur_DateEnd").toString().substring(0, 4))) > LocalDateTime.now().getYear()) {
//                list[i] = null;
//            }
//        }

        model.addAttribute("curList", list);


//        WebClient webClient = WebClient.create(baseURL);
//        webClient.get().uri(baseURL);


//        return webClient.get().uri(baseURL).retrieve().bodyToFlux(CurrencyFormFields.class).blockFirst();
        return "home";
    }

}
