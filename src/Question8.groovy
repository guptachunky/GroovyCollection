class Question8 {
    static void main(String[] args) {

        Employee employee1 = new Employee("chunky", 22, 15000)
        Employee employee2 = new Employee("rohit", 23, 99999)
        Employee employee3 = new Employee("prachi", 24, 4000)
        List<Employee> employee = [employee1, employee2, employee3]



        // List of employee who get salaary less than 5000
        employee.each {
            if (it.salary < 5000)
            println(it.name +"  "  + it.salary + "   " + it.age)
        }

        // get the name of oldest employee and youngest employee
        employee.sort({
            it.age
        })

        print("youngest employee  = ")
        println(employee.first().name +"  "  + employee.first().salary + "   " + employee.first().age)

        print( "Oldest Employee  = ")
        println(employee.last().name +"  "  + employee.last().salary + "   " + employee.last().age)

        employee.sort({
            it.salary
        })

        print("Maximum salary   = ")
        println(employee.last().name +"  "  + employee.last().salary + "   " + employee.last().age)

        List names=[]
        employee.each {
            names.add(it.name)
        }

        println("Names = " )
        names.each
                {
                    print(it + "  ")
                }

    }
}
