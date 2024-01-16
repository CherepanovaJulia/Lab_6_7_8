package laba6;

public class ex1 {
    public static void main(String[] args) {
        newClass task1 = new newClass();

        task1.setChOrStr('n');
        task1.setChOrStr("Все получится");

        System.out.println(task1.ch);
        System.out.println(task1.str);

        char[] chars1 = new char[8];
        chars1[0] = 'э';
        chars1[1] = 'т';
        chars1[2] = 'о';
        chars1[3] = 'у';
        chars1[4] = 'с';
        chars1[5] = 'п';
        chars1[6] = 'е';
        chars1[7] = 'х';

        task1.setChOrStr(chars1);
        task1.setChOrStr(task1.str);

        char[] chars2 = new char[1];
        chars2 [0] = 'k';

        task1.setChOrStr(chars2);
        System.out.println(task1.ch);
    }

    public static class newClass {
        char ch;
        String str;

        public void setChOrStr(char ch) {
            this.ch = ch;
        }

        public void setChOrStr(String str) {
            this.str = str;
        }

        public void setChOrStr(char[] chars) {
            if (chars.length == 1) {
                this.ch = chars[0];
            } else if (chars.length > 1) {
                this.str = String.valueOf(chars);
            }
        }
    }

}
