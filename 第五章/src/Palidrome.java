public class Palidrome {
    public boolean isPalindrome(String src){
        if(src.length() == 1){
            return true;
        }
        return src.equals(new StringBuilder(src).reverse().toString());
    }

    static void palindromeNumber(){
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i * 1000 + j * 100 + j * 10 + i);
            }
        }
    }

    public static void main(String[] args) {
        palindromeNumber();
    }
}
