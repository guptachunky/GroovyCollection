class Question5 {
    static void main(String[] args) {

        List list = [1, 2, 3, 4, 5, 67, 8, 98, 59, 15, 48, 59]
        List withoutOdd =[]

        for (int index = 0; index <= list.size(); index++) {

            if (index % 2 == 0) {
                withoutOdd.add(list[index])
            }
        }

        println(list)
        println(withoutOdd)
    }
}
