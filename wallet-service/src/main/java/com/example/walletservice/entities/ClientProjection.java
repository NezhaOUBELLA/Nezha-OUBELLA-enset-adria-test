package com.example.walletservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullClient", types = Client.class)

public interface ClientProjection {

    public Long getId();
    public String getNom();
    public String getEmail();
}
