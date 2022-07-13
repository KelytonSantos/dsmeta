package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{//Fazer consulta ao banco(salvar, deletar, etc) <tipo da entidade, tipo do ID>
 
    
    
}