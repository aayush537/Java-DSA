public class count{
    static int count(int r, int c){{
        if(r==1||c==1){
            return 1;
        }
        int left= count(r-1, c);
        int right = count(r, c-1);
        return left+right;
    }

    }
    public static void main(String[] args) {
        System.out.print(count(3, 3));
    }
}