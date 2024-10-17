package employer;

public class Employer extends Salarie{
	
	private Double Hsupp;
	private Double PHsupp;
	
	public Employer(int mat,String nom,int date,Double Hsupp,Double PHsupp)
	{
		super(mat,nom,date);
		this.Hsupp=Hsupp;
		this.PHsupp=PHsupp;
	}

	public Double getHsupp() {
		return Hsupp;
	}

	public void setHsupp(Double hsupp) {
		Hsupp = hsupp;
	}

	public Double getPHsupp() {
		return PHsupp;
	}

	public void setPHsupp(Double pHsupp) {
		PHsupp = pHsupp;
	}

	@Override
	public String toString() {
		return "Employer [Hsupp=" + Hsupp + ", PHsupp=" + PHsupp + "]";
	}
	public void affiche()
	{
		System.out.println("C'est un employer");
		System.out.println(super.toString());
		System.out.println(this);
	}
	public Double Salaire()
	{
		double s=super.Salaire();
		double sa=(Hsupp*PHsupp)+s;
		return sa;
	}
}
