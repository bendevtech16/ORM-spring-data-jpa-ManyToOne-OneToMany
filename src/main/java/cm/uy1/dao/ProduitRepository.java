package cm.uy1.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cm.uy1.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>, Serializable {
	@Query("select p from Produit p where p.designation like :x")
	public List<Produit> findByDesignation(@Param("x")String mc);
}
