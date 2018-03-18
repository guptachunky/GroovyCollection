class Question18 {
    static void main(String[] args) {
        Map<String,Integer> map1 = ["1": 1, "2": 2, "3": 3, "4": 4, "5": 5]
        Map<String,Integer> map2 = ["3": 13, "6": 6, "7": 7, "8": 8, "9": 9]
        Map<String,Integer> map3 = map1 + map2
        println(map3.getClass())
        println(map3.class)
    }
}
