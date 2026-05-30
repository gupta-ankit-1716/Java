class concatenateString {
    static void main(String[] args) {
        System.out.println("Concatenate String program.");
        String[] arr = new String[] {
                "IntelliJ" ,"Idea" , "File" , "Edit", "View" , "Navigate",
                "Code", "Refactor" , "Build" , "Run" , "Tools", "VCS" ,"Window",
                "Help"
        };

        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
