public class Main {

    public static void main(String[] args) {

        Employee tam = new Employee("Tam","11/11/1970","01/01/2022");
        System.out.println(tam);
        System.out.println("Age = " + tam.getAge());
        System.out.println("Pay = " + tam.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe","11/03/1990","03/03/2022",35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970","03/03/2021",15);
        System.out.println(mary);
        System.out.println("MAry's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

//        SalariedEmployee salariedEmployee = new SalariedEmployee();
//        HourlyEmployee hourlyEmployee =new HourlyEmployee();
//
//        System.out.println(salariedEmployee.getAge());
//        System.out.println(salariedEmployee.collectPay());
////        System.out.println(salariedEmployee.retire());
//
//        System.out.println(hourlyEmployee.getAge());
//        System.out.println(hourlyEmployee.collectPay());
////        System.out.println(hourlyEmployee.getDoublePay());
    }
}
