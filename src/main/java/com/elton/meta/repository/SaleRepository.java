package com.elton.meta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elton.meta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
