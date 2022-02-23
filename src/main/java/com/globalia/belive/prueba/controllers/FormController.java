package com.globalia.belive.prueba.controllers;

import com.globalia.belive.prueba.model.FormData;
import com.globalia.belive.prueba.model.SentFormData;
import com.globalia.belive.prueba.service.FormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping(FormController.BASE_MAPPING)
public class FormController {

    /* Inyección por bean:
    private final FormService formService;

    @Autowired  //no necesario pero recomendado por claridad de código
    public FormController(FormService formService) {
        this.formService = formService;
    }
     */

    /* Inyección autowired */
    @Autowired
    private FormService formService;

    public static final String BASE_MAPPING = "/form";
    private static final String SUBMIT_FORM_MAPPING = "/submit";

    @PostMapping(value = SUBMIT_FORM_MAPPING)
    public ModelAndView submitForm(@ModelAttribute FormData formData) {
        log.info("The form is being submitted.");
        return buildModelAndView(formService.handleForm(formData));
    }

    private ModelAndView buildModelAndView(SentFormData convertedFormData) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("formData", convertedFormData);
        modelAndView.setViewName("html/sent-form-page");
        return modelAndView;
    }


}
