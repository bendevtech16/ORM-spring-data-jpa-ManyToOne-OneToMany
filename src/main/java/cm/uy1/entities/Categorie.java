package cm.uy1.entities;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String nomCategorie;
		@OneToMany(mappedBy = "categorie", fetch = FetchType.LAZY)
		private Collection<Produit> ListProduit;
		
		public Categorie( String nomCategorie) {
			super();
			this.nomCategorie = nomCategorie;
		}
		public Categorie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNomCategorie() {
			return nomCategorie;
		}
		public void setNomCategorie(String nomCategorie) {
			this.nomCategorie = nomCategorie;
		}
		public Collection<Produit> getListProduit() {
			return ListProduit;
		}
		public void setListProduit(Collection<Produit> listProduit) {
			ListProduit = listProduit;
		}
		
		
}
