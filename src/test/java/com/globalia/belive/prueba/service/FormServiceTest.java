package com.globalia.belive.prueba.service;

import com.globalia.belive.prueba.model.FormData;
import com.globalia.belive.prueba.model.SentFormData;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class FormServiceTest {

    private static final SentFormData EXPECTED_FORM = new SentFormData("Maria Rabanales", "600000000", "maria@rabanales.es", LocalDate.of(2000, 1, 1));
    private static final SentFormData EXPECTED_FORM_WITHOUT_SURNAME = new SentFormData("Maria", "600000000", "maria@rabanales.es", LocalDate.of(2000, 1, 1));

    private final FormService formService = new FormService();

    @Test
    public void when_all_fields_come_in_SentFormData_is_filled_correctly() {
        FormData receivedForm = new FormData("Maria", "Rabanales", "600000000", "maria@rabanales.es", LocalDate.of(2000, 1, 1), "123456789");
        assertEquals(EXPECTED_FORM, formService.handleForm(receivedForm));
    }

    @Test
    public void when_name_and_surname_have_extra_spaces_SentFormData_is_filled_correctly() {
        FormData receivedForm = new FormData("    Maria  ", "  Rabanales   ", "600000000", "maria@rabanales.es", LocalDate.of(2000, 1, 1), "123456789");
        assertEquals(EXPECTED_FORM, formService.handleForm(receivedForm));
    }

    @Test
    public void when_surname_is_null_SentFormData_is_filled_correctly() {
        FormData receivedForm = new FormData("Maria", null, "600000000", "maria@rabanales.es", LocalDate.of(2000, 1, 1), "123456789");
        assertEquals(EXPECTED_FORM_WITHOUT_SURNAME, formService.handleForm(receivedForm));
    }

    @Test
    public void when_surname_is_blank_SentFormData_is_filled_correctly() {
        FormData receivedForm = new FormData("Maria", "  ", "600000000", "maria@rabanales.es", LocalDate.of(2000, 1, 1), "123456789");
        assertEquals(EXPECTED_FORM_WITHOUT_SURNAME, formService.handleForm(receivedForm));
    }
}