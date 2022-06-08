package Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000 && this.salary > 0)
            return salary;
        else if (this.salary > 1000) {
            double tax = salary * 0.03;
            return tax;
        }
        return 0;
    }

    public int bonus() {
        if (this.workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    public double raiseSalary() {
        int yearDiff = 2021 - hireYear;
        double zam;

        if (yearDiff > 0 && yearDiff < 10) {
            zam = salary * 0.05;
            return zam;
        } else if (yearDiff > 9 && yearDiff < 20) {
            zam = salary * 0.1;
            return zam;
        } else if (yearDiff > 19) {
            zam = salary * 0.15;
            return zam;
        } else
            return 0;
    }

    public String toString() {
        double tax = tax();
        int bonus = bonus();
        double raiseSalary = raiseSalary();
        double tbSalary = salary + bonus - tax;
        double sumSalary = salary + raiseSalary;

        System.out.println("Adı: " + name);
        System.out.println("Maasi: " + salary);
        System.out.println("Calisma Saati: " + workHours);
        System.out.println("Baslangic Yili: " + hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Artisi: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas: " + tbSalary);
        System.out.println("Toplam Maas: " + sumSalary);

        return null;
    }
}
