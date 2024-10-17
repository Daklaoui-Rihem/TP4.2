package employer;

public class test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Salarie s1=new Salarie(7021,"Ryyy",2014);
		s1.affiche();
		System.out.println(s1.Salaire(2014));
		Employer e1=new Employer(7021,"Ryyy",2014,5.00,30.00);
		e1.affiche();
		System.out.println(e1.Salaire(5.00,30.00));
		Vendeur v1=new Vendeur(6235,"yyy",2004,5.00,10.00);
		v1.affiche();
		System.out.println(v1.Salaire(5.00,10.00));*/
		
		Salarie tabSalarie[]=new Salarie[5];
		tabSalarie[0]=new Employer(12345,"Walid",2002,15.00,4.00);
		tabSalarie[1]=new Vendeur(234455,"Yessine",2007,1000.00,0.1);
		tabSalarie[2]=new Vendeur(65478,"Nassime",2000,700.00,0.1);
		tabSalarie[3]=new Employer(87698,"Aymen",2003,19.00,5.00);
		tabSalarie[4]=new Employer(12345,"Khaled",2008,7.00,4.00);
		System.out.println("******************************Liste des Employés******************************");
		for(int i=0;i<5;i++)
		{
			if(tabSalarie[i] instanceof Employer)
			{
				tabSalarie[i].affiche();
			}
		}
	    System.out.println("**********************************************************************************");
	    System.out.println("******************************Liste des Vendeur******************************");
		for(int i=0;i<5;i++)
		{
			if(tabSalarie[i] instanceof Vendeur)
			{
				tabSalarie[i].affiche();
			}
		}
	    System.out.println("****************************************************************************");
	    Salarie pa=tabSalarie[0];
	    for(int i=1;i<5;i++)
	    {
	    	if(tabSalarie[i].getDate()<pa.getDate())
	    	{
	    		pa=tabSalarie[i];
	    	}
	    }
	    System.out.println("******************************Nom du salarié le plus ancien dans l'entreprise******************************");
	    System.out.println("Nom:"+pa.getNom()+" recruté en l'an "+pa.getDate());
	    System.out.println("****************************************************************************");
	    int j=0;
	    while(tabSalarie[j] instanceof Employer && j<5)
	    {
	    	j++;
	    }
	    Salarie pgs=tabSalarie[j];
	    for(int k=j+1;k<5;k++)
	    {
	    	if(tabSalarie[k] instanceof Vendeur && tabSalarie[k].Salaire()>pgs.Salaire())
	    	{
	    		pgs=tabSalarie[k];
	    	}
	    }
	    System.out.println("******************************Matricule du vendeur diposant du plus grand salaire******************************");
	    System.out.println("Matricule:"+pgs.getMat()+" de salaire "+pgs.Salaire());
	    System.out.println("****************************************************************************");
	}
}
