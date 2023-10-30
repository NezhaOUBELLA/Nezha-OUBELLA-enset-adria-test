package com.example.walletservice.repository;

import com.example.walletservice.entities.Client;
import com.example.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface WalletRepository extends JpaRepository<Wallet, String> {
    @RestResource(path = "/byCustomerId")
    List<Wallet> findByClient_Id(@Param("customerId") Long customerId);
}
