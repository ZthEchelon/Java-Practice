ypublic class Main {

    public static String ReverseWordsInString(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip trailing or extra spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // If we reached the start of empty spaces, stop
            if (i < 0) break;

            // Build the current word backwards
            word.setLength(0);
            while (i >= 0 && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i--;
            }

            // Reverse the word (because we collected it backwards)
            word.reverse();

            // Add to result
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "  hello   world  java  ";
        System.out.println(ReverseWordsInString(input));  // Output: "java world hello"
    }
}
