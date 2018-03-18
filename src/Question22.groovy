class Question22 {
    static void main(String[] args) {
        NewEmployee newEmployee1 = new NewEmployee("chunks", 22, 101, 1, 15000)
        NewEmployee newEmployee2 = new NewEmployee("abc", 22, 102, 2, 1500)
        NewEmployee newEmployee3 = new NewEmployee("abc2", 22, 102, 2, 1500)
        NewEmployee newEmployee4 = new NewEmployee("abc1", 42, 102, 2, 160000)

        List<NewEmployee> employeeList = [newEmployee1, newEmployee2, newEmployee3]

        //Grouping employee on basis of salary
        Map map = employeeList.groupBy {
            it.salary > 5000
        }

        //Get the count of employee in each department
        Map<Integer, List> map1 = employeeList.groupBy {
            it.departmentNumber
        }
        map1.each {
            print("dept = " + it.getKey())
            println(" number of employee " + it.getValue().size())
        }

        //Get the employee between 18 to 35

        List<Employee> age = []
        Map map3 = employeeList.groupBy {
            it.age > 18 && it.age < 35
        }.each {
            age.add(it.value)
        }
        println(age.name)

//     Group the employees according to the alphabet with which their
//     first name starts and display the number of employees in each group
//      whose age is greater than

//        Map map4 = employeeList.groupBy {
//            it.name.startsWith()
//        }
//        println(map4)





        // Group employees according to department
        Map map5=employeeList.groupBy {
            it.departmentNumber
        }

    }
}
