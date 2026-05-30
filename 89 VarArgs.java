class VarArgs {
    static void main(String[] args) {
        System.out.println(concatenate("This"));
        System.out.println(concatenate("program", "is", "being" , "coded"));
        System.out.println(concatenate("on", "IntelliJ"));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();

    }

}
