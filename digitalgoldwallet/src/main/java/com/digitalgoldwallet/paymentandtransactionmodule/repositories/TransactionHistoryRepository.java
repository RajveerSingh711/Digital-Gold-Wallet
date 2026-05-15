package com.digitalgoldwallet.paymentandtransactionmodule.repositories;

import com.digitalgoldwallet.paymentandtransactionmodule.entities.TransactionHistory;
import com.digitalgoldwallet.paymentandtransactionmodule.enums.TransactionStatus;
import com.digitalgoldwallet.paymentandtransactionmodule.enums.TransactionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "transactions")
public interface TransactionHistoryRepository
        extends JpaRepository<TransactionHistory, Integer> {

    Page<TransactionHistory> findByUserUserId(
            Integer userId,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByUserUserIdAndTransactionType(
            Integer userId,
            TransactionType transactionType,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByUserUserIdAndTransactionStatus(
            Integer userId,
            TransactionStatus transactionStatus,
            Pageable pageable
    );
    Page<TransactionHistory>
    findByUserUserIdOrderByCreatedAtDesc(
            Integer userId,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByUserUserIdOrderByCreatedAtAsc(
            Integer userId,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByUserUserIdOrderByAmountDesc(
            Integer userId,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByUserUserIdOrderByAmountAsc(
            Integer userId,
            Pageable pageable
    );

    // ==========================================
    // VENDOR TRANSACTIONS
    // ==========================================

    Page<TransactionHistory>
    findByBranchVendorVendorId(
            Integer vendorId,
            Pageable pageable
    );

    // ==========================================
    // VENDOR FILTERS
    // ==========================================

    Page<TransactionHistory>
    findByBranchVendorVendorIdAndTransactionType(
            Integer vendorId,
            TransactionType transactionType,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByBranchVendorVendorIdAndTransactionStatus(
            Integer vendorId,
            TransactionStatus transactionStatus,
            Pageable pageable
    );

    // ==========================================
    // BRANCH TRANSACTIONS
    // ==========================================

    Page<TransactionHistory>
    findByBranchBranchId(
            Integer branchId,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByBranchVendorVendorIdOrderByCreatedAtDesc(
            Integer vendorId,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByBranchVendorVendorIdOrderByCreatedAtAsc(
            Integer vendorId,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByBranchVendorVendorIdOrderByAmountDesc(
            Integer vendorId,
            Pageable pageable
    );

    Page<TransactionHistory>
    findByBranchVendorVendorIdOrderByAmountAsc(
            Integer vendorId,
            Pageable pageable
    );
}
