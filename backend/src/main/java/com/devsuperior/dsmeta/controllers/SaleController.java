package com.devsuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import com.devsuperior.dsmeta.services.SmsService;

@RestController//Configurando que isso é um componente, um controlador
@RequestMapping(value = "/sales")//valor da minha rota, do caminho que vou acessar
public class SaleController {
    
    @Autowired 
    private SaleService  service;//aqui lembrar da pilha controller chama o service, o service chama o repository

    @Autowired
    private SmsService smsService;

    @GetMapping // configurando minha função para ele responder via web no protocolo http
    public Page<Sale> findSales(@RequestParam (value = "minDate", defaultValue = "") String minDate, //Definindo uma variavel String minDate(essa vai receber o valor do front(url))
                                @RequestParam (value = "maxDate", defaultValue = "") String maxDate, //mesma coisa; daqui elas passam retornando um findSale com os dados que vão para o SaleService onde vão ser tratadas.
                                Pageable pageable) {//Aqui estamos configurando os parametros de entrada definindo um valor e um valor padrão
        return service.findSale(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")//to indicando que é um parametro e que vou ter que indicar na requisição
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }
}