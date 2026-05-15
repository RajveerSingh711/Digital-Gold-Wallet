package com.digitalgoldwallet.paymentandtransactionmodule.repositories;

import com.digitalgoldwallet.paymentandtransactionmodule.entities.Payment;
import com.digitalgoldwallet.paymentandtransactionmodule.enums.PaymentMethod;
import com.digitalgoldwallet.paymentandtransactionmodule.enums.PaymentStatus;
import com.digitalgoldwallet.paymentandtransactionmodule.enums.PaymentTransactionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "payments")
public interface PaymentRepository
        extends JpaRepository<Payment, Integer> {
    Page<Payment> findByUserUserId(
            Integer userId,
            Pageable pageable
    );
    Page<Payment> findByUserUserIdAndPaymentMethod(
            Integer userId,
            PaymentMethod paymentMethod,
            Pageable pageable
    );
    Page<Payment> findByUserUserIdAndPaymentTransactionType(
            Integer userId,
            PaymentTransactionType paymentTransactionType,
            Pageable pageable
    );
    Page<Payment> findByUserUserIdAndPaymentStatus(
            Integer userId,
            PaymentStatus paymentStatus,
            Pageable pageable
    );
    Page<Payment> findByUserUserIdOrderByCreatedAtDesc(
            Integer userId,
            Pageable pageable
    );
    Page<Payment> findByUserUserIdOrderByCreatedAtAsc(
            Integer userId,
            Pageable pageable
    );
    Page<Payment> findByUserUserIdOrderByAmountDesc(
            Integer userId,
            Pageable pageable
    );
    Page<Payment> findByUserUserIdOrderByAmountAsc(
            Integer userId,
            Pageable pageable
    );
}
