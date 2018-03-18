class Question21 {
    static void main(String[] args) {
        Map<String, Map<String, Integer>> m = ["Computing"  : ["Computing": 600, "Information Systems": 300],
                                               "Engineering": ["Civil": 200, "Mechanical": 100],
                                               "Management" : ["Management": 800]]
        println("How Many universities are there??")
        println(m.size())

        println("How many programs are delivered by the Computing department?")
        println(m.get("Computing").size())

        println("How many students are enrolled in the Civil Engineering program?")
        println(m.get("Engineering").get("Civil"))
    }
}
