package com.accenture.academico.bancoapi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
public class ContaPoupancaModel {

    private AgenciaModelId agenciaModelId;

    private ClienteModelId clienteModelId;
}