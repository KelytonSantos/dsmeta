package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service //estou registrando o SaleService como componente do sistema
public class SaleService {
    
    @Autowired
    private SaleRepository repository; /* Apenas o saleRepository que pode acessar meus dados no banco por isso ele foi declarado aqui */

    public Page<Sale> findSale(String minDate, String maxDate, Pageable pageable){ //aqui eu estou passando os dados que peguei em SaleController e convertendo elas
        
        LocalDate today = LocalDate.ofInstant(Instant.now(),ZoneId.systemDefault()); //Criando data com o dia de hoje (instante do pc, fuso do pc)
        

                     //minDate é igual vazio(equals) caso for verdade(?) min é igual a today - 365 dias(.minusDay); caso não for converta. 
        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);//aqui eu converto minhas datas para o tipo LocalDate ou seja elas vão deixar de ser string
                      //maxDate é igual a vazio(comparação:equals) se for verdade(?) max é igual a today; caso não for(:) converta

        return repository.findSales(min, max, pageable); //aqui eu retorno meus dados tratados na qual vão ser utilizados no SaleRepository. OBS: o pageable é uma função prontapara retornar até 20 paginas(visto em aula)
    }    
}