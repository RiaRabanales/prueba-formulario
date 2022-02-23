package com.globalia.belive.prueba.service;

import com.globalia.belive.prueba.model.FormData;
import com.globalia.belive.prueba.model.SentFormData;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    public SentFormData handleForm(FormData formData) {
        SentFormData convertedFormData = new SentFormData();
        convertedFormData.setIdentification(buildIdentification(formData));
        convertedFormData.setEmail(formData.getEmail());
        convertedFormData.setPhone(formData.getPhone());
        convertedFormData.setDob(formData.getDob());

        return convertedFormData;
    }

    private String buildIdentification(FormData formData) {
        //nombre es obligatorio, apellido no y puede venir nulo
        return formData.getSurname() == null || formData.getSurname().trim().equals("")
                ? formData.getName().trim()
                : formData.getName().trim() + " " + formData.getSurname().trim();
    }


}
