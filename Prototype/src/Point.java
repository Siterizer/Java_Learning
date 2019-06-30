class Point {
    private int x;
    private int y;
    private Character name;

    Point(int x, int y, Character name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }

    Character getName() {
        return name;
    }

    void setName(Character name) {
        this.name = name;
    }

}
