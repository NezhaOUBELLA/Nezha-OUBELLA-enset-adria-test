package com.example.transferservice.entities;

import com.example.transferservice.enumeration.Etat;

import java.util.Date;

public class Transfert {
    private Long id;
    private Date date;
    private String sourceId;
    private WalletItem source;
    private String destinationId;
    private WalletItem destination;
    private double montant;
    private Etat etat;
}
