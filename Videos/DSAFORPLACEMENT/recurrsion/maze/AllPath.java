public class AllPath {
    static void printPath(int r, int c, String p){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printPath(r-1, c, p+'D');
        }
        if(c>1){
            printPath(r, c-1, p+'R');
        

    }
    return;
}
    public static void main(String[] args) {
        printPath(3, 3, "");
    }

}