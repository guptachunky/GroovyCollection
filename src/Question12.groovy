class Question12 {
    static void main(String[] args) {

        List<Character> list='a'..'z'
//        list.each {println it}

        int j='j'
        j=j-96
        list.subList(j,list.size()).each { print it+" "}
        list.each {}

    }
}
