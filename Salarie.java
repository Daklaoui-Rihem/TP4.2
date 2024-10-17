package employer;

public class Salarie {
	
	protected int mat;
	protected String nom;
	protected int date;
	
	public Salarie(int mat,String nom, int date)
	{
		this.mat=mat;
		this.nom=nom;
		this.date=date;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Salarie [mat=" + mat + ", nom=" + nom + ", date=" + date + "]";
	}
	public void affiche()
	{
		System.out.println(this);
	}
	public Double Salaire()
	{
		if(date<2005)
		{
			return 400.00;
		}
		else
		{
			return 280.00;
		}
	}
	
}
