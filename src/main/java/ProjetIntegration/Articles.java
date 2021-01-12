/**
 * 
 */
package ProjetIntegration;

/**
 * @author 33614
 *
 */
public class Articles {
	private int id, quantite_stock;
	private float tva, cout_fabrication, prix_unitaire_ht;
	private String nom, description;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the cout_fabrication
	 */
	public float getCout_fabrication() {
		return cout_fabrication;
	}
	/**
	 * @param cout_fabrication to set
	 */
	public void setCout_fabrication(float cout_fabrication) {
		this.cout_fabrication = cout_fabrication;
	}
	/**
	 * @return the tva
	 */
	public float getTva() {
		return tva;
	}
	/**
	 * @param tva the tva to set
	 */
	public void setTva(float tva) {
		this.tva = tva;
	}
	/**
	 * @return the quantite_stock
	 */
	public int getQuantite_stock() {
		return quantite_stock;
	}
	/**
	 * @param quantite_stock the quantite_stock to set
	 */
	public void setQuantite_stock(int quantite_stock) {
		this.quantite_stock = quantite_stock;
	}
	/**
	 * @return the prix_unitaire_ht
	 */
	public float getPrix_unitaire_ht() {
		return prix_unitaire_ht;
	}
	/**
	 * @param prix_unitaire_ht the prix_unitaire_ht to set
	 */
	public void setPrix_unitaire_ht(float prix_unitaire_ht) {
		this.prix_unitaire_ht = prix_unitaire_ht;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
