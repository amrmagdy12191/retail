package com.mobile.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.model.Invoice;

@Repository
@Transactional
public interface InvoiceRepository extends CrudRepository<Invoice, Integer>{
	List<Invoice> findByBillNumber(String billNumber);
}
