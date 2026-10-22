public class DuplicateCharInString {
    public static void main(String[] args) {
        String string1 = "Hakkuna Matata";
        int count;
        char[] stringChar = string1.toCharArray();
        for (int i = 0; i < stringChar.length; i++) {
            count = 1;
            for (int j = i + 1; j < stringChar.length; j++) {
                if (stringChar[i] == stringChar[j] && stringChar[i] != ' ') {
                    count++;
                    stringChar[j] = 0;
                }
            }
            if (count > 1 && stringChar[i] != 0) {
                System.out.println(stringChar[i]);
            }
        }

    }
}
