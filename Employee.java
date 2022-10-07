package employee;

public class Employee {
	String name ;
	double salary;
	int workHours;
	int hearYear;
	
	Employee( String name ,double salary,int workHours,int hearYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hearYear = hearYear;
		}

	public double tax() {
		if(this.salary <1000) {
			
			System.out.println("Vergi uygulanmamaktadir.");
			return this.salary;
		}
		else 
		{
			double tax = this.salary *0.03;
			return tax ;
		}
		
	}
	 public int bonus() {
	        if (this.workHours> 40){
	            int bonus = (this.workHours-40)*30;
	            return bonus;
	        }
	        return 0;
	    }
	 
	 
	 public double raiseSalary(){
	        if(this.hearYear<=0 || this.hearYear>2021){
	            System.out.println("Geçersiz bir çalışma yılı girdiniz, tekrar kontrol ediniz!");
	        } else {
	            int farkYil=2021 - this.hearYear;
	            double zam;

	            if (farkYil>0 && farkYil<10){
	                zam=this.salary*0.05;
	                return zam;
	            } else if (farkYil<9 && farkYil<20) {
	                zam=this.salary*0.01;
	                return zam;

	            } else if (farkYil>19) {
	                zam=this.salary*0.15;
	                return zam;
	            } else if (farkYil==0) {
	                return 0;

	            }
	        }
	        return 0;
	    }
	 double tot() {
		 double tot = this.salary - tax() +bonus() ;
		 return tot;
	 }
     double total() {
    	 double total = this.salary + raiseSalary();
    	 return total;
     }
	
	 
	public void toPrint() {
		System.out.println("Adi:"+this.name);
		System.out.println("Maasi:"+this.salary);
		System.out.println("Calistigi Saati:"+this.workHours);
		System.out.println("Baslangic Yili:"+this.hearYear);
		System.out.println("Vergi:"+tax());
		System.out.println("Bonus:"+bonus());
		System.out.println("Maaş Artışı : "+raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+ tot());
		System.out.println("Toplam Maaş : " + total());
		 
	   
		
		
		
		
	}
}
