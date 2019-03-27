package web.jax.rs.data.jpa.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import web.jax.rs.data.jpa.domain.Editeur;

@Repository
public interface EditeurRepository extends PagingAndSortingRepository<Editeur, Integer>{

}
