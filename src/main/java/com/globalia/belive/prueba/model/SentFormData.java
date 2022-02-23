package com.globalia.belive.prueba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SentFormData {

    String identification;
    String phone;
    String email;
    LocalDate dob;
    //No paso la contraseña: no tiene sentido mostrarla en una pantalla

}
