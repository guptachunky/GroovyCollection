class Question4 {
    static void main(String[] args) {

        List listFirst = [11, 12, 13, 14]
        List listSecond = [13, 14, 15]
        List listThrid = [16, 17]
        println(listSecond.intersect(listFirst))
        println(listSecond.intersect(listThrid))
    }
}
