class Question15 {
//
//    static List myPush(List<Integer> list, int element) {
//        list.push(element)
//        return list
//    }
//
//    static List myPop(List<Integer> list) {
//        list.pop()
//        return list
//    }
//
//    static int getTop(List<Integer> list) {
//        return list.get(list.size())
//    }
//
//    static void display(List<Integer> list) {
//        list.each { print(it + "  ") }
//    }

    static void main(String[] args) {
        List<Integer> list = []
        Scanner scanner = new Scanner(System.in)
        int choice
        while (true) {
            println("Enter Choice  \n 1. for push \n 2. for pop  \n 3.to get top \n 4 . for display  \n5. for exit")
            choice = scanner.nextInt()
            if (choice == 1) {
                println("Enter Elemeet to push")
                int element = scanner.nextInt()
                list.push(element)
            } else if (choice == 2) {
                list.pop()
            } else if (choice == 3) {
                println(list.last())
            } else if (choice == 4) {
                println(list)
            } else
                break


        }
    }
}
