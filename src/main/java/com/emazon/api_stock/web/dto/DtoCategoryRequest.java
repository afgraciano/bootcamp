package com.emazon.api_stock.web.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoCategoryRequest {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 50, message = "El tamaño máximo del nombre es de 50 caracteres")
    private String name;




    @NotBlank(message = "La descripción es obligatoria")
    @Size(max = 90, message = "El tamaño máximo de la descripción es de 90 caracteres")
    private String description;


}

