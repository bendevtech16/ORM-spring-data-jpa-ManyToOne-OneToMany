package cm.uy1.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cm.uy1.dao.ProduitRepository;
import cm.uy1.entities.Produit;

@RestController
public class ProduitRestService {
	@Autowired
	private ProduitRepository produitRepository;

	@GetMapping("/produits")
	List<Produit> produit() {
		return produitRepository.findAll();
	}

	@GetMapping("/produits/{id}")
	Produit findProduit(@PathVariable Long id) {
		return produitRepository.findById(id).get();
	}

	@GetMapping("/delete/{id}")
	void deleteProduit(@PathVariable Long id) {
		produitRepository.deleteById(id);
	}

}
