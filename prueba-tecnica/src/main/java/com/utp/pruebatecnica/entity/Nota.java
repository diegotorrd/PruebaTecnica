package com.utp.pruebatecnica.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Nota")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Nota {

    @Id
    private Long id;
    private String titulo;
    private String contenido;


}
