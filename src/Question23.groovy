class Question23 {

    static void main(String[] args) {

        String s = "http://www.google.com?name=johny&age=20&hobby=cricket"
        URL url = new URL(s)
        String query = url.getQuery()
//        String f = query.split("&")[0]
//        println(f)
        String[] queries = query.split("&")

        Map map = [:]
        for (int i = 0; i < queries.length; i++) {
            map.put(queries[i].split("=")[0], queries[i].split("=")[0])
        }
        println("Name = " + map.get("name"))
        println("hobby = " + map.get("hobby"))


        println(url.getQuery())
    }
}
