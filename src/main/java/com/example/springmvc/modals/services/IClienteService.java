package com.example.springmvc.modals.services;

import com.example.springmvc.modals.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
