package com.globalia.belive.prueba.controllers;

import com.globalia.belive.prueba.model.FormData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping(FormController.BASE_MAPPING)
public class FormController {

    public static final String BASE_MAPPING = "/form";
    private static final String SUBMIT_FORM_MAPPING = "/submit";

    @PostMapping(value = SUBMIT_FORM_MAPPING)
    public ModelAndView submitForm(@ModelAttribute FormData formData) {
        log.info("The form is being submitted.");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("formData", formData);
        modelAndView.setViewName("html/sent-form-page");
        return modelAndView;
    }

}
