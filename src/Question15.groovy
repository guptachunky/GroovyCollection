class Question15 {

    static List myPush(List<Integer> list, int element) {
        list.push(element)
        return list
    }

    static List myPop(List<Integer> list) {
        list.pop()
        return list
    }

    static int getTop(List<Integer> list) {
        return list.get(list.size())
    }

    static void display(List<Integer> list) {
        list.each { print(it + "  ") }
    }

    static void main(String[] args) {
        List<Integer> list = 1..10
        Question15 obj=new Question15()
        Scanner scanner = new Scanner(System.in)
        int choice = 0;
        while (true) {
            println("Enter Choice  \n 1. for push \n 2. for pop  \n 3.to get top \n 4 . for display  \n5. for exit")
            choice = scanner.nextInt()
            if (choice == 1) {
                println("Enter Elemeet to push")
                int element = scanner.nextInt()
                print(element)
                list = myPush(list, element)
            } else if (choice == 2) {
                list = myPop(list)
            } else if (choice == 3) {
                println(getTop(list))
            } else if (choice == 4) {
                display(list)
            } else
                break


        }
    }
}
