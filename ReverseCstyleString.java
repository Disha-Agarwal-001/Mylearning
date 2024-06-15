public class ReverseCstyleString {

    public static void reverseCString(char str[]) {
        int start = 0;
        int end = str.length-2; // Exclude the null character
        // Swap characters from start and end positions until they meet
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        char[] str = {'a', 'b', 'c', 'd', '\0'}; // Example C-style string
        System.out.print("Original string: ");
        printCString(str);

        // Reverse the C-style string
        reverseCString(str);

        System.out.print("Reversed string: ");
        printCString(str);
    }

    public static void printCString(char[] str) {
        for (char ch : str) {
            if (ch == '\0') {
                break;
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}
