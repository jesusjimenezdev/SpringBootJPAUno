package com.curso.datajpa.models.dao;

import com.curso.datajpa.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {


}
