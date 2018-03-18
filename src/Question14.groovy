class Question14 {
    static void main(String[] args) {

        List<Integer> list=1..100
        list.each {
            if(it % 3==0 && it % 5==0)
                println(it +  " FizzBuzz")
            else if (it % 3==0)
                println(it +  " Fizz")
            else if (it % 5==0)
                println(it +  " Buzz")
            else
                println(it + " ")
        }
    }
}
