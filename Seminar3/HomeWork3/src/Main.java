public class Main {
    public static void main(String[] args) {
        Employee[] array = new Employee[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Employee();
        }

        Employee[] array2 = new Employee[4];
        array2[0] = new Employee("John Martin","engineer",87687,3400,47);
        array2[1] = new Employee("Yan Mart","security",8347687,2454,34);
        array2[2] = new Employee("Martin Scop","StoreKeeper",89897,2300,60);
        array2[3] = new Director("Bob Fellan","Director",89999,5000,47);
        Employee.averageAge(array2);
        Employee.averageSalary(array2);
        Director.raisingStatic(array2 ,45,5000);
        for (int i = 0; i < array2.length; i++) {
            array2[i].allInfo();
        }

    }
}