package com.example.transferservice.entities;

import jakarta.persistence.ManyToOne;

import java.util.Date;

public class WalletItem {
    private String id;
    private double solde;
    private Date DateCreation;
    private String devise;
    //private Client client;
}
