package com.globalia.belive.prueba.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest //esto me hace cargar el entorno entero!!! Seguir investigando en https://www.baeldung.com/spring-boot-testing
public class FormControllerTest {

    @Autowired
    private FormController formController;

    @Test
    public void contextLoads() {
        assertNotNull(formController);
    }

}