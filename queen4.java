public class queen4 {

    public static void main(String[] args) {
        int n = 4;   // number of queens
        int count = 0;  // a counter to count how many answers we have
        long start = System.nanoTime(); // time before execution of for loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    for (int k = 0; k < n; k++) {
                        // check each queen with the other queens not to hit each other
                        // location of each queen on chess board is considered as (number of row, number of column)
                        if (Hit(i, 0, j, 1)) {
                            continue;
                        }
                        if (Hit(i,0, j2,2)) {
                            continue;
                        }
                        if (Hit(i,0, k,3)) {
                            continue;
                        }
                        if (Hit(j,1, j2,2)) {
                            continue;
                        }
                        if (Hit(j,1, k,3)) {
                            continue;
                        }
                        if (Hit(j2,2, k,3)) {
                            continue;
                        }
                        count++; // no queens hit each other so increase counter by one
                        
                    }
                }
            }
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