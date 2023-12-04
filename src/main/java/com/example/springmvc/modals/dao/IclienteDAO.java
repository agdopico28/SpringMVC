package com.example.springmvc.modals.dao;

import com.example.springmvc.modals.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IclienteDAO extends CrudRepository<Cliente,Long> {
}
