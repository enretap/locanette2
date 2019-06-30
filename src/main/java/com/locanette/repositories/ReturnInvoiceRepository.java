package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.ReturnInvoice;

public interface ReturnInvoiceRepository extends JpaRepository<ReturnInvoice, Long>{

}
