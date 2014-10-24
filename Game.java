public class Game {

    //A global Ball "b"
    static Ball b;
    //A global Robot "r"
    static Robot r;
    //A global int "size"
    static int size = 10;
    //A global String array "field" of size <size * size>
    static String[] field = new String[size * size];
    
    public static void main(String[] args) {
        /**
         * Point pos = new Point();
         * pos.x = 3;
         * pos.y = 4;
         * System.out.println(pos.x + " " + pos.y);
        **/
        
        //Initialize b
        b = new Ball();
        //Assign b a position
        b.pos.x = 1;
        b.pos.y = 1;
        
        //Initialize r
        r = new Robot();
        //Assign b a position
        r.pos.x = 0;
        r.pos.y = 0;
        
        draw();
        r.move();
        draw();
    }
    
    static void draw() {
        //Clear the field
        for (int i = 0; i < size * size; i++) {
            field[i] = " ";
        }
        //Set the ball's space in the field to "O"
        field[b.pos.x + (b.pos.y * size)] = "O";
        //Set the robot's space in the field to "R"
        field[r.pos.x + (r.pos.y * size)] = "R";
        //Draw the field
            
        for (int j = 0; j < size * 4; j++){
            System.out.print("-");
        }
        System.out.println("-");
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.print("| " + field[x + (y * size)] + " ");
            }
            System.out.println("|");
            
            for (int j = 0; j < size * 4; j++){
                System.out.print("-");
            }
            System.out.println("-");
        }
        System.out.println();
    }
}

/**
 * Indices of the board positions:
 *    0  1  2  3  4  5  6  7  8  9
 *   10 11 12 13 14 15 16 17 18 19
 *   20 21 22 23 24 25 26 27 28 29
 *   30 31 32 33 34 35 36 37 38 39
 *   40 41 42 43 44 45 46 47 48 49
 *   50 51 52 53 54 55 56 57 58 59
 *   60 61 62 63 64 65 66 67 68 69
 *   70 71 72 73 74 75 76 77 78 79
 *   80 81 82 83 84 85 86 87 88 89
 *   90 91 92 93 94 95 96 97 98 99
 * 
 * Equivalent coordinates:
 * (0,0) (1,0) (2,0) (3,0) (4,0) (5,0) (6,0) (7,0) (8,0) (9,0)
 * (0,1) (1,1) (2,1) (3,1) (4,1) (5,1) (6,1) (7,1) (8,1) (9,1)
 * (0,2) (1,2) (2,2) (3,2) (4,2) (5,2) (6,2) (7,2) (8,2) (9,2)
 * (0,3) (1,3) (2,3) (3,3) (4,3) (5,3) (6,3) (7,3) (8,3) (9,3)
 * (0,4) (1,4) (2,4) (3,4) (4,4) (5,4) (6,4) (7,4) (8,4) (9,4)
 * (0,5) (1,5) (2,5) (3,5) (4,5) (5,5) (6,5) (7,5) (8,5) (9,5)
 * (0,6) (1,6) (2,6) (3,6) (4,6) (5,6) (6,6) (7,6) (8,6) (9,6)
 * (0,7) (1,7) (2,7) (3,7) (4,7) (5,7) (6,7) (7,7) (8,7) (9,7)
 * (0,8) (1,8) (2,8) (3,8) (4,8) (5,8) (6,8) (7,8) (8,8) (9,8)
 * (0,9) (1,9) (2,9) (3,9) (4,9) (5,9) (6,9) (7,9) (8,9) (9,9)
**/