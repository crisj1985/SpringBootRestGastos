package services;

import java.util.List;

import modelo.Cliente;

public interface IClienteService {
	
	Cliente create(Cliente cli);
	Cliente update(Cliente cli);
	Cliente findById (Integer id);
	List<Cliente> findAll ();
	void delete (Integer id);
	
}
