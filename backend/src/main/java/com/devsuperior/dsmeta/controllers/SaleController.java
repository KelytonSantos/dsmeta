package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController//Configurando que isso é um componente, um controlador
@RequestMapping(value = "/sales")//valor da minha rota, do caminho que vou acessar
public class SaleController {
    
    @Autowired 
    private SaleService  service;//aqui lembrar da pilha controller chama o service, o service chama o repository

    @GetMapping // configurando minha função para ele responder via web no protocolo http
    public List<Sale> findSales() {
        return service.findSale(); /*aqui eu to acessando meu pacote services na classe SaleService na função findSale, 
        esta por sua vez chama a classe SaleRepository no pacote repositories e está também chama a entities sale*/
    }
}