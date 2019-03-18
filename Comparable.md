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

<br>
<br>

# Interface Comparator<T>

### 정의
정렬 가능한 클래스(Comparable 인터페이스를 구현한 클래스)들의 기본 정렬 기준과 다르게 정렬 하고 싶을 때 사용하는 인터페이스
<br>

### 패키지
java.util.Comparator
<br>

### 특징
1. 주로 익명 클래스로 이용된다.
2. 기본적인 정렬 방법인 오름차순 정렬을 내림차순으로 정렬할 때 많이 사용한다.
<br>

### compare() 메서드 작성법

1. 첫 번째 파라미터로 넘어온 객체 < 두 번째 파라미터로 넘어온 객체: 음수 리턴
2. 첫 번째 파라미터로 넘어온 객체 == 두 번째 파라미터로 넘어온 객체: 0 리턴
3. 첫 번째 파라미터로 넘어온 객체 > 두 번째 파라미터로 넘어온 객체: 양수 리턴
4. 음수 또는 0이면 객체의 자리가 그대로 유지되고 양수이면 두 객체의 자리가 변경된다
5. 비교하는 첫번째 객체의 위치에 따라 오름차순 내림차순으로 정렬할 수 있다
<br>

### 정렬하기

```java
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Point> pointList = new ArrayList<>();
		pointList.add(new Point(40, 30));
		pointList.add(new Point(30, 20));
		pointList.add(new Point(20, 10));
		MyComparator myComparator = new MyComparator();
		Collections.sort(pointList, myComparator);
		
		for(Point p : pointList) {
			System.out.println(p.toString());
		}
	}

}
```
<br>

오름차순 정렬

```java
import java.awt.Point;
import java.util.Comparator;

class MyComparator implements Comparator<Point> {
	@Override
	public int compare(Point p1, Point p2) {
		if (p1.x > p2.x) {
			return 1;
		}else if(p1.x < p2.x){ 
			return -1;
		}else {
			return 0;
		}
	}
}
//java.awt.Point[x=20,y=10]
//java.awt.Point[x=30,y=20]
//java.awt.Point[x=40,y=30]
```
<br>

내림차순 정렬

```java
import java.awt.Point;
import java.util.Comparator;

class MyComparator implements Comparator<Point> {
	@Override
	public int compare(Point p1, Point p2) {
		if (p1.x < p2.x) {
			return 1;
		}else if(p2.x < p1.x){ 
			return -1;
		}else {
			return 0;
		}
	}
}
//java.awt.Point[x=40,y=30]
//java.awt.Point[x=30,y=20]
//java.awt.Point[x=20,y=10]
```
<br>

익명클래스 이용

```java
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Comparator<Point> myComparator = new Comparator<Point>() {
			  @Override
			  public int compare(Point p1, Point p2) { 
				  if (p2.x > p1.x) {
						return 1;
					}else if(p2.x < p1.x){ 
						return -1;
					}else {
						return 0;
					}
			  }
			};

			List<Point> pointList = new ArrayList<>();
			pointList.add(new Point(20, 10));
			pointList.add(new Point(40, 10));
			pointList.add(new Point(30, 10));
			Collections.sort(pointList, myComparator);
			
			for(Point m :pointList) {
				System.out.println(m.toString());
			}

	}

}
//java.awt.Point[x=40,y=10]
//java.awt.Point[x=30,y=10]
//java.awt.Point[x=20,y=10]
```
