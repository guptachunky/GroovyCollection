class Question13 {
    static void main(String[] args) {

        String string = "my name is khan and i am not a terrorist"
        HashMap hashMap = [:]
        for(int i=0;i<string.length();i++){
            if(hashMap.containsKey(string.charAt(i))){
                hashMap.put(string.charAt(i),hashMap.get(string.charAt(i))+1)
            }
            else
                hashMap.put(string.charAt(i),1)
        }
        println(hashMap)
    }
}
