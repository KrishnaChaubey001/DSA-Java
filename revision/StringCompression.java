package DSA.revision;

import java.util.ArrayList;

public class StringCompression {

        public int compress(char[] arr) {
            int n = arr.length;
            int i = 0, write = 0;

            while(i < n) {
                char ch = arr[i];
                int j = i;

                while(j < n && arr[j] == ch) {
                    j++;
                }

                arr[write++] = ch;
                int count = j - i;

                if(count > 1) {
                    String num = String.valueOf(count);
                    for(char digit : num.toCharArray()) {
                        arr[write++] = digit;
                    }
                }

                i = j;
            }

            return write;
        }
}
