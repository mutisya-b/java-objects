     //Name:  peninah kasyoka
    //Reg no:S08-8436-2024
import java.util.scanner;
classEmployee {
  string name;
  double salary;

  Employee (string name,double salary){
   this. name=name;
   this. salary=salary;
  }
  void displaydetails(){
    system.out.printIn("Name:"+name);
    system.out.printIn("salary:"+salary);
  }
}
class salary calculator{
    double calculatorBonus(double salary){
        return 0.1*salaly;
}
double tax(double salary){
   return 0.3*salary;
}

}

class MainApp_3{
   Run main/Debug main/Run/Debug
   public static void main(string[]args){
      scanner scanner=new scanner(system.in);

      system.out.printIn(x:"Enter name and salary");
      string name=scanner.nextline();
      double sal=scanner.next double();

      Employee emp=new employee(name,sal);
      emp.displayDetails();

      salaryCalculator calc=new salary calculator();
      double a=calc.calculateBonus(sal);
      double b=calc.Tax(sal);
      system.out.printIn("Bonus:"+a);
      system.out.printIn("Tax:"+b);
    }
}

