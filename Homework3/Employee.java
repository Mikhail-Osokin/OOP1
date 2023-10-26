package Homework3;

final class Employee implements Comparable<Employee>{
    String name;
    int age;
    int salary;
    String nameDepartment;

    public Employee(String name, int age, int salary, String nameDepartment){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.nameDepartment = nameDepartment;
    }

    public void setEmployee(String name, int age, int salary, String nameDepartment){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.nameDepartment = nameDepartment;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }
    public String getNameDepartment(){
        return nameDepartment;
    }
@Override

    public int compareTo(Employee employee){
        return age - employee.getAge();
    }

@Override

    public String toString(){
        return "(" + name +","+ age + "," +salary+ "," + nameDepartment +")";
    }
}
