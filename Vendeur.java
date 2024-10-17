package employer;

public class Vendeur extends Salarie{
	
	private Double vente;
	private Double pourcentage;
	
	public Vendeur(int mat,String nom,int date,Double vente,Double pourcentage)
	{
		super(mat,nom,date);
		this.vente=vente;
		this.pourcentage=pourcentage;
	}

	public Double getVente() {
		return vente;
	}

	public void setVente(Double vente) {
		this.vente = vente;
	}

	public Double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "Vendeur [vente=" + vente + ", pourcentage=" + pourcentage + "]";
	}
	public void affiche()
	{
		System.out.println("C'est un vendeur");
		System.out.println(super.toString());
		System.out.println(this);
	}
	public Double Salaire()
	{
		double s=super.Salaire();
		double sa=(vente*pourcentage)+s;
		return sa;
	}
	
}
