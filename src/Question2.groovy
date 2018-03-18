class Question2 {
    static void main(String[] args) {

        List list = [1, 1, 2, 5, 6, 8, 9, 8, 9, 8, 1, 2, 3, 4, 5]
        Set set = list.toSet()
        println("Normal List  " + list)
        println("Set output  " + set)
        List outputList = []
        // firstWay
        for (l in list) {
            if (!outputList.contains(l)) {
                outputList.add(l)
            }
        }

        // Second way
        list.unique()
        println("Uniques List = "+ list)
        println("OutputList =  " + outputList)
    }
}
