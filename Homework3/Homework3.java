package Homework3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Homework3 {
        /**
         * @param args
         */
        public static void main(String[] args) {
        
        Set<Employee> employeers = new TreeSet<>();
        employeers.add(new Employee("Igor",20,2000,"Manager"));
        employeers.add(new Employee("Valeriy",21,2100,"Manager"));
        employeers.add(new Employee("Dmitriy",20,2200,"Manager"));
        employeers.add(new Employee("Marina",20,2500,"Manager"));
        employeers.add(new Employee("Irina",23,2800,"Director"));
        employeers.add(new Employee("Oksana",28,2200,"Developer"));
        employeers.add(new Employee("Mikhail",36,4400,"Developer"));
        employeers.add(new Employee("Nikolay",38,5400,"Developer"));
        employeers.add(new Employee("Vasiliy",42,5500,"Developer"));
        employeers.add(new Employee("Georgiy",37,4800,"Developer"));
        employeers.add(new Employee("Elena",30,3500,"Manager"));
        employeers.add(new Employee("Valentin",31,3100,"Manager"));
        employeers.add(new Employee("Evgeniy",33,3300,"Manager"));
        employeers.add(new Employee("Mikhail",40,4500,"Director"));
        employeers.add(new Employee("Petr",34,3400,"Manager"));
        employeers.add(new Employee("Alisa",35,3500,"Manager"));
        employeers.add(new Employee("Liza",28,3500,"Manager"));
        employeers.add(new Employee("Konstantin",41,4100,"Developer"));
        employeers.add(new Employee("Dmitriy",44,4900,"Director"));
        employeers.add(new Employee("Igor",46,4600,"Director"));
        Set<Employee> employeers1 = (Set<Employee>) ((TreeSet) employeers).clone();
        Set<Employee> employeers2 = (Set<Employee>) ((TreeSet) employeers).clone();
        System.out.println(employeers);
        
        //Comparator<Integer> SalarySortComparator = 
                  
        
        class SalarySortComparator implements Comparator <Integer>{
        
        //Comparator<Integer> SalarySortComparator = new Comparator<>(){
        @Override
        public int compare(Integer s1, Integer s2) {
              Iterator <Employee> iterator = employeers1.iterator();  
              while (iterator.hasNext()){
              s1 = iterator.next().getSalary();
              s2 = iterator.next().getSalary();
              }
              return s2 - s1;
            }
            SalarySortComparator salarySortComparator = new SalarySortComparator();
            Set<Employee> employeers1 = new TreeSet<>(salarySortComparator);
          
        }
            System.out.println(employeers1);  
        class NameDepartmentSortComparator implements Comparator <String>{
        
        //Comparator<Integer> SalarySortComparator = new Comparator<>(){
        @Override
        public int compare(String s1, String s2) {
              Iterator <Employee> iterator = employeers2.iterator();  
              while (iterator.hasNext()){
              s1 = iterator.next().getNameDepartment();
              s2 = iterator.next().getNameDepartment();
              }
              return s1.length() - s2.length();
            }
        
            NameDepartmentSortComparator nameDepartmentSortComparator = new NameDepartmentSortComparator();
            Set<Employee> employeers2 = new TreeSet<>(nameDepartmentSortComparator);  
    }
            System.out.println(employeers2);
        }
    }
    