/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/6/26
 * Time: 21:38
 * Description:
 * 数字以 0123456789101112131415... 的格式序列化到一个字符串中，求这个字符串的第 index 位。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().getDigitAtIndex(19));
    }

    public int getDigitAtIndex(int index) {
        if (index < 0) {
            return -1;
        }
        int place = 1, totalNumber;
        while (true) {
            totalNumber = place * getAmountOfPlace(place);
            if (index <= totalNumber) {
                return getDigitAtIndex(index, place);
            }
            place++;
            index -= totalNumber;
        }
    }

    private int getAmountOfPlace(int place) {
        if (place == 1) {
            return 10;
        }
        return (int) Math.pow(10, place - 1);
    }

    private int getBeginNumberOfPlace(int place) {
        if (place == 1) {
            return 0;
        }
        return (int) Math.pow(10, place - 1);
    }

    private int getDigitAtIndex(int index, int place) {
        int begin = getBeginNumberOfPlace(place);
        String number = begin + index / place + "";
        return number.charAt(index % place) - '0';
    }

}
