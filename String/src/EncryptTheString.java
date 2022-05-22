public class EncryptTheString {
    public static void main(String[] args) {
        System.out.println(encryptString("aabbc"));
    }

    public static String encryptString(String s) {
        String res = s.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                res += count;
                res += curr;
                if (count > 1)
                    count = 1;
            }
        }
        if (count == 1) {
            res = res + "1";
        } else {
            res = res + count;
        }
        String nres="";
        for(int j=res.length()-1;j>=0;j--){
            
        }
        return count == 1 ? res + "1" : res + count;
    }
}
