package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> 
{

}