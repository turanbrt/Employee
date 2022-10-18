public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if(this.salary>1000){
            return this.salary*0.03;
        }
        return 0;
    }
    double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }
    double raiseSalary(){
        int year=2021-this.hireYear;
        if(year<10){
            return 0.05*this.salary;
        } else if (year<20 && year>9) {
            return 0.1*this.salary;
        }
        return 0.15*this.salary;
    }
    void tooString(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı:" +this.hireYear);
        System.out.println("Vergi: "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Maaş Artışı:"+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: "+(this.salary-this.tax()+this.bonus()));
        System.out.println("Toplam Maaş: "+(this.salary-this.tax()+this.bonus()+raiseSalary()));



    }
}
