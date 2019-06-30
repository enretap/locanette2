package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
