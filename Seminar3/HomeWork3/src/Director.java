public class Director extends Employee {

    public Director(String fio,String position ,int  phone , int salary,int age){
        super(fio,position,phone,salary,age);
    }





    public static void raisingStatic(Employee[] employee , int minAge , int bonusSalary){
        for (int i = 0; i < employee.length ; i++) {
            if(employee[i] instanceof Director){
                continue;
            } else if (employee[i].age>minAge) {
                employee[i].salary = employee[i].salary + bonusSalary;
            }
        }
    }


}
