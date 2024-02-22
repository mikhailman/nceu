package com.verishko.nceu.controller;

import com.verishko.nceu.model.CurrencyFormFields;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Controller
public class RequestController {

    @RequestMapping("/response") // https://www.nbrb.by/api/exrates/currencies/431
    public String postBody(@ModelAttribute CurrencyFormFields currencyFormFields, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String currencyBaseURL = "https://www.nbrb.by/api/exrates/currencies/" + currencyFormFields.getSelectedCurrencyCode();
        Object currencyInfo = restTemplate.getForObject(currencyBaseURL, Object.class);
        model.addAttribute("currency", currencyInfo);
        String baseDynamicsURL = "https://www.nbrb.by/api/exrates/rates/dynamics/"
                + currencyFormFields.getSelectedCurrencyCode()
                + "?startdate=" + (currencyFormFields.getDateFrom().isBlank() ? LocalDateTime.now().toLocalDate() : currencyFormFields.getDateFrom())
                + "&enddate=" + (currencyFormFields.getDateUntil().isBlank() ? LocalDateTime.now().toLocalDate() : currencyFormFields.getDateUntil());

        System.out.println("Cur_ID: " + currencyFormFields.getSelectedCurrencyCode());

        Object[] currencyDynamics = restTemplate.getForObject(baseDynamicsURL, Object[].class);
        model.addAttribute("startDate", currencyFormFields.getDateFrom().isBlank() ? LocalDateTime.now().toLocalDate() : currencyFormFields.getDateFrom());
        model.addAttribute("endDate", currencyFormFields.getDateUntil().isBlank() ? LocalDateTime.now().toLocalDate() : currencyFormFields.getDateUntil());
        model.addAttribute("currencyDynamics", currencyDynamics);

        return "currencyInfo";
    }
}