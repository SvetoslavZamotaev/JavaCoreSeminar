public class Employee {
    protected String fio;
    protected String position;
    protected int phone;
    protected int salary;
    protected int age;

    public Employee(){

    }
    public Employee(String fio,String position ,int  phone , int salary,int age){
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void allInfo(){
        System.out.println(String.format("fio : %s,position:%s,phone:%d,salary:%d,age:%d",fio,position,phone,salary,age));
    }

    public void raisingSalary(Employee[] employee , int minAge , int bonusSalary){
        for (int i = 0; i < employee.length ; i++) {
            if(employee[i].age>minAge){
                employee[i].salary = employee[i].salary + bonusSalary;
            }
        }
    }





    public static void averageAge(Employee[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i].age + sum;
        }
        System.out.println("Average age is :" + sum/array.length);
    }

    public static void averageSalary(Employee[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i].salary + sum;
        }
        System.out.println("Average salary is :" + sum/array.length);
    }






}
