public class Practice19 {
    public static void main(String[] args){
        /* continue文 */
        for (int i = 0 ; i < 5 ; i++) {
            if (i == 3) {
                System.out.println("iの値は" + i);
                continue;    // i == 3の時は下記のprintln処理がスキップされfor文の先頭に戻る
            }
            System.out.println(i);
        }
    }
}
