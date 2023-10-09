package cm.uy1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cm.uy1.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
