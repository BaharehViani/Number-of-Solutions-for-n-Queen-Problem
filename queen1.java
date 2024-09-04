public class queen1 {

    public static void main(String[] args) {
        int n = 1;  // number of queens
        int count = 0;  // a counter to count how many answers we have
        long start = System.nanoTime();  // time before execution of for loops
        for (int i = 0; i < n; i++) {
            count++;
        }
        long finish = System.nanoTime(); // time after execution of for loops
        long duration = finish - start; // the differnece between start and end time gives us the duration of execution
        System.out.println("duration = " + duration + " ns");
        System.out.println("number of solutions = " + count);
        
    }

    // this function checks all the possible ways that queens can hit each other
    public static boolean Hit(int x, int y, int x2, int y2) {
        if (x == x2 || y == y2 || (x == x2+1 && y == y2+1) || (x == x2-1 && y == y2-1) || (x == x2+1 && y == y2-1) || (x == x2-1 && y == y2+1) ||
            ((Math.abs(x2-x)) == (Math.abs(y2-y)))) {
            return true;
        }
        return false;
    }
}