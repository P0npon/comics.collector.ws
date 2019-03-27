package web.jax.rs.data.jpa.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import web.jax.rs.data.jpa.domain.Metier;

@Repository
public interface MetierRepository extends PagingAndSortingRepository<Metier, Integer>{

}
