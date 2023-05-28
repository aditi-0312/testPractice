package practice;

public class HtmlParserDemo {

    public static void main(String[] args) {
        String s = "<h1>  This is a heading   </h1>";
        String content = parser(s);
        System.out.println("~~~" + content + "~~~");
    }

    private static String parser(String str) {
    	
//    	StringBuilder in Java is a class used to create a mutable, 
//    	or in other words, a modifiable succession of characters. 
//    	Like StringBuffer, the StringBuilder class is an alternative to the Java Strings Class,
//    	as the Strings class provides an immutable succession of characters.
    	
        StringBuilder contentBuilder = new StringBuilder();
        boolean inTag = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '<') {
                inTag = true;
            } else if (c == '>') {
                inTag = false;
            } else if (!inTag) {
                contentBuilder.append(c);
            }
        }

        return contentBuilder.toString().trim();
    }
}
