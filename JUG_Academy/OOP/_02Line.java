package JUG_Academy.OOP;

public class _02Line {
    public static void main(String[] args) {
//        Point point1 = new Point(1,2);
//        Point point2 = new Point(3,4);
//
//        Line line = new Line(point1,point2);
//        System.out.println(line.toString());

    }

    public static class Point {
        public int x;
        public int y;

        public Point() {
//            this.x = x;
//            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static class Line{
        public Point start;
        private Point end;

        public Line() {
//            this.start = start;
//            this.end = end;
        }

        public Point getStart() {
            return start;
        }

        public void setStart(Point start) {
            this.start = start;
        }

        public Point getEnd() {
            return end;
        }

        public void setEnd(Point end) {
            this.end = end;
        }

        @Override
        public String toString() {
            return String.format("[("+start.getX()+","+start.getY()+"),("+end.getX()+","+end.getY()+")]");
        }
    }
}
