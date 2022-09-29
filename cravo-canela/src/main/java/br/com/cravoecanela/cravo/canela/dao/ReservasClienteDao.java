package br.com.cravoecanela.cravo.canela.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cravoecanela.cravo.canela.model.ReservasCliente;

@Repository
public interface ReservasClienteDao extends CrudRepository<ReservasCliente, Integer> {

}
