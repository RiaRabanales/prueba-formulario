package com.globalia.belive.prueba.model;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class FormData {

    String name;
    String surname;
    String phone;
    String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dob;
    String password;

}
