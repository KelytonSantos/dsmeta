package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {// Fazer consulta ao banco(salvar, deletar, etc)
                                                                   // <tipo da entidade, tipo do ID>

    @Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
    Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable); // aqui eu faço a consulta ao meu
                                                                           // banco(linguagem especifica Jsql)
                                                                           // utilizando os dados passados: min data,
                                                                           // max data e em paginas
    /*Importante ressaltar a lógica da ponte entre eles (entrada, tratamento e saída), onde cada um sai e qual a estrutura para envia-los de um local para outro(conseitos basicos)*/

}