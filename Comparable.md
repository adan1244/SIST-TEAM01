# Comparable interface

정렬 기능을 사용하기 위해서는 비교를 위한 메소드(compareTo)가 정의되어 있어야 한다.</br>
자바에서 제공하는 자료형들은 이미 해당 메소드가 정의되어 있지만, 사용자 정의 자료형의 경우에는 이를 따로 정의해주어야 한다.</br>
Comparable 인터페이스에 추상 메소드인 compareTo 메소드가 선언되어 있으며, 사용자 정의 자료형의 비교를 원하는 경우 Comparable 인터페이스를 상속받아 구현하면 된다.
</br>
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(3, 5));
        pointList.add(new Point(5, 2));
        pointList.add(new Point(14, 23));
        pointList.add(new Point(7, 10));
        pointList.add(new Point(1, 9));
        pointList.add(new Point(1, 14));
        pointList.add(new Point(1, 7));
        pointList.add(new Point(-2, 23));
        pointList.add(new Point(12, 3));
        Collections.sort(pointList);
        
        for(Point p : pointList) {
        	System.out.println(p);
        }
    }
}

class Point implements Comparable<Point> {
    private int x, y;

	public Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if(this.x > p.x) {
            return 1; // x에 대해서는 오름차순
        }
        else if(this.x == p.x) { //x가 같을 경우
            if(this.y < p.y) { // y에 대해서는 내림차순
                return 1;
            }
        }
        return -1;
    }
    
    public String toString() {
    	return String.format("(%d, %d)", this.x, this.y);
    }
}

/*  실행결과
    (-2, 23)
    (1, 14)
    (1, 9)
    (1, 7)
    (3, 5)
    (5, 2)
    (7, 10)
    (12, 3)
    (14, 23)
*/
```
