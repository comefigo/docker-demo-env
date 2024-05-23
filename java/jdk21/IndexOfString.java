public class IndexOfString {
    public static void main(String[] args) {
        String text = "This is a sample text for demonstrating the new indexOf method.";

        // 指定された範囲内で "sample" を検索
        int beginIndex = 10;
        int endIndex = 40;
        int result = text.indexOf("sample", beginIndex, endIndex);

        if (result != -1) {
            System.out.println("\"sample\" found at index: " + result);
        } else {
            System.out.println("\"sample\" not found within the specified range.");
        }
    }
}
