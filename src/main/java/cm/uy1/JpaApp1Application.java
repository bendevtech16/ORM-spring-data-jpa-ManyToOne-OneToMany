package cm.uy1;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cm.uy1.dao.CategorieRepository;
import cm.uy1.dao.ProduitRepository;
import cm.uy1.entities.Categorie;
import cm.uy1.entities.Produit;

@SpringBootApplication
public class JpaApp1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JpaApp1Application.class, args);
		ProduitRepository produitDao = ctx.getBean(ProduitRepository.class);
		CategorieRepository categorieRepository = ctx.getBean(CategorieRepository.class);

		Categorie c1 = new Categorie("ELECTRONIQUE");
		Categorie c2 = new Categorie("RESTAURATION");
		Categorie c3 = new Categorie("AUTOMOBILE");
		Categorie c4 = new Categorie("LOGICIEL");
		categorieRepository.save(c1);
		categorieRepository.save(c2);
		categorieRepository.save(c3);
		categorieRepository.save(c4);
		Produit p1 = new Produit("land cruiser", 3000, 1, c3);
		Produit p = new Produit("Eclipse", 100000, 4, c4);
		produitDao.save(new Produit("SAMSUNG GALAXIE TAB", 8000, 4, c1));
		produitDao.save(new Produit("Poulet DG", 4500, 2, c2));
		produitDao.save(p1);
		produitDao.save(new Produit("Autocad CIVIL", 2000, 4, c4));
		produitDao.save(p);
		produitDao.delete(p1);
		System.out.println(produitDao.findById(Long.valueOf(1)));

		List<Produit> listProduit = produitDao.findAll();

		for (Iterator iterator = listProduit.iterator(); iterator.hasNext();) {
			Produit produit = (Produit) iterator.next();
			System.out.println("{");
			System.out.println("ID du produit : " + produit.getId());
			System.out.println("DESIGNATION du produit : " + produit.getDesignation());
			System.out.println("PRIX du produit : " + produit.getPrix());
			System.out.println("QUANTITE du produit : " + produit.getQuantite());
			System.out.println("}");
		}

	}

}
