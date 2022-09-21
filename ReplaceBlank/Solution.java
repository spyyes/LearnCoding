package ReplaceBlank;

/**
 * a brief introduction
 *
 * @author spy@pku.edu.cn
 */
class Solution {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 实际上，只有C语言的字符串才可以原地修改，Java的String是不可变的。因此已经需要开辟新的空间了。
     * @return
     */
    public String replaceSpace(String s) {
        char[] charArray = s.toCharArray();
        //输入的Null和空值检查
        if (s == null || s.length() == 0) {
            return s;
        }
        int numOfBlank = 0;
        for (char c : charArray) {
            if (c == ' ') {
                numOfBlank++;
            }
        }
        char[] newArray = new char[charArray.length + numOfBlank * 2 ];
        int idx = charArray.length - 1;
        int newIdx = charArray.length + numOfBlank * 2 - 1;
        while (idx >= 0) {
            char c = charArray[idx];
            if (c == ' ') {
                newArray[newIdx--] = '0';
                newArray[newIdx--] = '2';
                newArray[newIdx--] = '%';
                numOfBlank -= 1;
                idx -= 1;//易错点
                continue;
            }
            newArray[newIdx--] = c;
            idx--;
        }
        return String.valueOf(newArray);
    }


}