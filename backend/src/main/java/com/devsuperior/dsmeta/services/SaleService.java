package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service //estou registrando o SaleService como componente do sistema
public class SaleService {
    
    @Autowired
    private SaleRepository repository; /* Apenas o saleRepository que pode acessar meus dados no banco por isso ele foi declarado aqui */

    public List<Sale> findSale(){ //função para encontrar minhas vendas
        return repository.findAll(); //busca todas as minhas vendas
    }    
}