
public class RabinKarp {
    final static long seed = 31;

    public static void main(String[] args) {
        String s = "ABABABA";
        String p = "ABA";
        match(p, s);
    }

    private static void match(String p, String s) {
        long hash_p = hash(p);
        long[] hashOfS = hash(s, p.length());
        match(hash_p, hashOfS);
    }

    private static void match(long hash_p, long[] hashOfS) {
        for (int i = 0; i < hashOfS.length; i++) {
            if(hashOfS[i] == hash_p){
                System.out.println("match: " + i);
            }
        }
    }

    private static long[] hash(String s, int length) {
        long[] res = new long[s.length() - length + 1];
        res[0] = hash(s.substring(0, length));
        for (int i = length; i < s.length(); i++) {
            char newChar = s.charAt(i);
            char oldChar = s.charAt(i - length);
            long v = (long) ((res[i - length] * seed + newChar - oldChar * Math.pow(seed, length)) % Long.MAX_VALUE);
            res[i-length+1] = v;
        }
        return res;
    }

    private static long hash(String p) {
        long h = 0;
        for (int i = 0; i != p.length(); ++i) {
            h = seed * h + p.charAt(i);
        }
        return h % Long.MAX_VALUE;
    }
}

// thia is good
//buikdak
