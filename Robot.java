public class Robot {

    Point pos = new Point();
    int speed;
    String color = "r";

    void move() {
        if(pos.d == 1) {
            pos.y--;
        } else if(pos.d == 2) {
            pos.y++;    
        } else if(pos.d == 3) {
            pos.x++;
        } else if(pos.d == 4) {
            pos.x--;    
        }
    }
}
