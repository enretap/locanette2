package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.InvoicePayment;

public interface InvoicePaymentRepository extends JpaRepository<InvoicePayment, Long>{

}
