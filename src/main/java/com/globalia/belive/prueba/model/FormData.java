package com.globalia.belive.prueba.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor //Lombok para crear constructor con todos los parámetros
@NoArgsConstructor
public class FormData {

    String name;
    String surname;
    String phone;
    String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dob;
    String password;

}
