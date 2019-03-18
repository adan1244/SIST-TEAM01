# String Method

### char charAt(int index)
```java
package string; 

public class charAt {

	public static void main(String[] args) {
		String str1 ="java";
		System.out.println(str1.charAt(1));	
		System.out.println(str1.charAt(2));	
	}
}
// a
// v
```
지정한 인데스번째에 있는 문자를 반환한다.

<br>
<br>

### int compareTo(Object o)
```java
package string; 

public class comparetotwo {


	public static void main(String[] args) {
		String str1 = "java";
	    String str2 = new String("javaa");
	    String str3 = new String("java");
	      
	    int result = str1.compareTo( str2 );
	    System.out.println(result);	//-1
	      
	    result = str1.compareTo( str3 );
	    System.out.println(result);	// 0 일치
	}

}
// -1
// 0	


```
사용자가 임의로 결정한 오브젝트와 문자열을 비교하여 문자열이 같으면 0이 나오게 되고 
다른 문자열일 경우에는 문자열과 비교후 차이 값을 계산하여 반환한다.

<br>
<br>

### int compareTo(String anotherString)
```java	
package string; 

public class compareTo {

	public static void main(String[] args) {
		String str1 = "s";
		String str2 = "p";
		System.out.println(str1.compareTo(str2));

	}

}
// 3

```

두개의 문자를 비교하여 int 자료형으로 값을 변환한다.

<br>
<br>

### int compareToIgnoreCase(String str)
```java
package string; 
public class compareToIgnoreCase {

	public static void main(String[] args) {
		String str1 = "q";
		String str2 = "Q";
		System.out.println(str1.compareToIgnoreCase(str2)); //0

	}

}
// 0
```

두개의 문자열을 대소문자 구분없이 비교하여 아스키 코드 번호의 차이를 int 자료형으로 값을 반환한다.

<br>
<br>

### String concat(String str)
```java
package string; 

public class concat {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "happy";
		System.out.println(str1.concat(str2));  //javahappy
	}
}
//javahappy
```
두개의 문자열을 결합시켜준다. 

<br>
<br>

### boolean contentEquals(Stringbuffer sb)
```java 
package string;

public class contentsequal {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "lang";
		StringBuffer str3 = new StringBuffer("java");

		boolean result = str1.contentEquals(str3);
		System.out.println(result);	// true

		result = str2.contentEquals(str3);
		System.out.println(result); //false

	}

}
// true
// false
```
String이 StringBuffer로 지정된 것과 같은 문자 순서를 나타내는 경우에만 0으로 결과가 나온다.

<br>
<br>

### static String copyValueOf(char[] data)
```java
package string; 

public class copyValueOf {

	public static void main(String[] args) {
		 char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
	      String Str2 = "";
	      Str2 = Str2.copyValueOf( Str1 );
	      System.out.println(Str2);	// hello world

	}

}
// hello world
```
지정된 배열 내의 문자를 반환한다.

<br>
<br>

###  static String copyValueOf(char[] data int offset, int count)
```java

package string; 

public class copyValueoftwo {

	public static void main(String[] args) {
		
		char[] Str1 = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		String Str2 = "";
		Str2 = Str2.copyValueOf(Str1, 2, 6);	// llo wo
		System.out.println(Str2);
	}

}
// llo wo
```

지정된 배열 내의 지정한 범위의 (시작부분과 문자열의 길이)문자를 반환한다

<br>
<br>

### boolean endsWith(String suffix)
```java
package string; 
public class endsWith {

	public static void main(String[] args) {
		String str1 = "seoul";
		String str2 = "ul";
		String str3 = "o";
		System.out.println(str1.endsWith(str2)); // true
		System.out.println(str1.endsWith(str3)); // false
	}
}
// true
// false
```

문자열 마지막에 지정한 문자가 있는지를 판단후 있다면 true, 없으면 false를 반환한다. 

<br>
<br>

### boolean equals(Object anObject)
```java
package string;
public class equals {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "sist";
		String str3 = "java";
		System.out.println(str1.equals(str2));	// false
		System.out.println(str1.equals(str3));	// true
	}
}
// false
// true
```
두 개의 String의 값만을 비교해서 같으면 true , 다르면 false를 반환한다. (대소문자 비교)

<br>
<br>

### boolean equalsIgnoreCase(String anotherString)
```java
package string;
public class equalsIgnoreCase {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "naver";
		String str3 = "JAVA";
		System.out.println(str1.equalsIgnoreCase(str2));	// false 
		System.out.println(str1.equalsIgnoreCase(str3));	// true
	}

}
// false 
// true
```
두개의 String의 값을 대소문자를 무시하고  같으면 true, 다르면 false를 반환한다.

<br>
<br>     

### byte getBytes()

```java
public class Test {

   public static void main(String args[]) {
        String s1 = "String";
        byte [] b1 = s1.getBytes();

        System.out.println(Arrays.toString(b1));
   }
}

// Return Value : [83, 116, 114, 105, 110, 103]
```
문자열을 인코딩하여 바이트의 시퀀스를 반환해준다. 

<br>
<br>

### byte getBytes(String charsetName)

```java
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {

   public static void main(String args[]) {
        String s1 = "String";
        byte[] encodedName = null;
        char s = 'S';

        try {
            encodedName = s1.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(encodedName));
   }
}

// Return Value : [83, 116, 114, 105, 110, 103]
```
1. 문자열을 `utf-8`로 읽어 `utf-8`을 기준으로 인코딩하여 바이트의 시퀀스를 반환해준다.
2. 만약 `UNICODE`로 작성된 문자열을 `utf-8`을 기준으로 읽으면 오류가 발생하기 때문에
`UnsupportedEncodingException` 처리를 해줘야 한다. 

<br>
<br>

### void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

```java
import java.util.Arrays;

public class Test {

   public static void main(String args[]) {
        char [] carr = new char [8];
        String s1 = "abcdABCD";

        s1.getChars(4, 8, carr, 0);
        s1.getChars(0, 4, carr, 4);

        System.out.println(Arrays.toString(carr));
   }
}

// Return Value : [A, B, C, D, a, b, c, d]
```
`.getChars()` 메소드는 String의 문자열 중 지정된 범위만큼만 뽑아와 배열에 넣어준다. 

```java
s1.getChars(4, 8, carr, 0);
```
이 코드는 s1 문자열의 4번째 글자 ('A')부터 7번째 글자 ('D')까지의 글자를 carr[0]부터 넣는 것을 말한다. 

```java
s1.getChars(0, 4, carr, 4);
```
이 코드는 s1 문자열의 0번째 글자 ('a')부터 3번째 글자 ('d')까지의 글자를 carr[4]부터 넣는 것을 말한다. 

<br>
<br>

### int hashCode()

```java
public class Test {

   public static void main(String args[]) {
        String s1 = "abc";
        String s2 = "ABC";

        int h1 = s1.hashCode();
        int h2 = s2.hashCode();

        System.out.println(h1);
        System.out.println(h2);
   }
}

// Return Value : 96354
// Return Value : 64578

```
1. `equals()`와 같이 객체를 비교하는 데에 쓰인다.   
2. `hashCode()`의 반환값은 `int`로, 객체의 주소값을 이용하여 객체 고유의 해시코드를 반환한다.  
3. 서로 다른 객체의 해시코드가 겹칠 일이 극히 드물기 때문에 비교 연산에 쓰인다.

<br>
<br>

### int indexOf(int ch)

```java
public class Test {

   public static void main(String args[]) {
        String s1 = "start";

        int sidx1 = s1.indexOf('s');
        int sidx2 = s1.indexOf('t');
        int sidx3 = s1.indexOf('a');
        int sidx4 = s1.indexOf('r');
        int sidx5 = s1.indexOf('t');

        int sidx6 = s1.indexOf("art");
        int sidx7 = s1.indexOf('z');

        System.out.printf("%d %d %d %d %d %n", sidx1, sidx2, sidx3, sidx4, sidx5);
        System.out.println(sidx6);
        System.out.println(sidx7);
   }
}

// Return Value : 0 1 2 3 1
// Return Value : 2
// Return Value : -1
```
1. 문자열에 있는 한 글자의 위치를 반환한다.  
2. 인덱스는 0부터 시작한다. 
3. 위 코드에서 't'와 같이 겹치는 글자의 위치를 찾을 때는 가장 앞에 있는 't'의 위치를 반환한다.  
4. 한 단어를 입력했을 때에는 단어의 첫글자의 위치만 반환한다. 
5. 문자열에 없는 단어를 찾을 때에는 -1을 반환한다. 

<br>
<br>

### int indexOf(int ch, int fromIndex)

```java
public class Test {

   public static void main(String args[]) {
        String s1 = "start";
        int sidx1 = s1.indexOf('t');
        int sidx2 = s1.indexOf('t', 2);

        System.out.printf("%d %d %n", sidx1, sidx2);
   }
}

// Return Value : 1
// Return Value : 4
```
1. 문자열에 겹치는 글자가 있을 때 사용된다.
2. 인덱스 시작 넘버를 정해주면, 해당 위치 이후에 있는 글자의 위치를 반환한다. 따라서 위 코드에서는 'a' 이후의 't'의 위치를 찾아준다. 

<br>
<br>

### int lastIndexOf(int ch)

```java
public class Test {

   public static void main(String args[]) {
        String s1 = "start";
        int sidx1 = s1.lastIndexOf('t');

        System.out.printf("%d %n", sidx1);
   }
}

// Return Value : 4	
```
 `.indexOf()` 메소드가 왼쪽부터 글자의 위치를 찾았다면, `.lastIndexOf()` 메소드는 문자열의 오른쪽부터 글자의 위치를 찾는다. 

<br>
<br>

### int lastIndexOf(int ch, int fromIndex)

```java
public class Test {

   public static void main(String args[]) {
        String s1 = "start";
        int sidx1 = s1.lastIndexOf('t', 3);

        System.out.printf("%d %n", sidx1);
   }
}

// Return Value : 1
```
인덱스 시작 넘버를 정해주면, 해당 위치 이후에 있는 글자의 위치를 반환한다. 따라서 위 코드에서는 'r' 이후의 't'의 위치를 찾아준다. 

<br>
<br>

### int indexOf(String str)

```java
public class Test {

   public static void main(String args[]) {
        String s1 = "start apple bottle";
        int sidx1 = s1.indexOf("apple");

        System.out.printf("%d %n", sidx1);
   }
}

// Return Value : 6 
```
![indexOf(String)](./img/indexOf(String).png)
1. 문장에서 단어의 위치를 찾을 때 사용된다.
2. 단어의 위치는 첫 글자의 위치로 반환된다.
3. 공백도 한 자리를 차지한다. 

<br>
<br>

### int indexOf(String str, int fromIndex)

```java
public class Test {

   public static void main(String args[]) {
        String str = "today to too metoo";
        int sidx = str.indexOf("to", 2);

        System.out.println(sidx);
   }
}


// Return Value : 6
```
1. 문장에 겹치는 단어가 있을 때 사용된다.
2. 인덱스 시작 넘버를 정해주면, 해당 위치 이후에 있는 단어의 위치를 반환한다.

<br>
<br>

### String intern()

```java
public class Test {

   public static void main(String args[]) {
        String literal = "abc";
        String object = new String("abc");

        System.out.println(literal.equals(object));
        System.out.println(literal == object);
   }
}

// Return Value : true
// Return Value : false
```
1. String은 객체이기 때문에 String 생성 방식이 2가지가 있다. 첫번째는 리터럴을 이용한 방식이고 두번째는 `new`연산자를 이용한 방식이다.
2. 리터럴을 이용해 String을 생성하면 `string constant pool` 영역에 저장되고, `new` 연산자를 이용해 생성하면 `heap` 영역에 저장된다.
3. 따라서 문자열을 비교하는 `.equals()`는 true를 반환하지만, `literal`과 `object` 객체의 주소값을 비교한 `==` 연산자의 결과는 false가 나오게 된다. 

```java
public class Test {

   public static void main(String args[]) {
       String literal = "abc";
        String object = new String("abc");
        String intern = object.intern();

        System.out.println(literal.equals(intern));
        System.out.println(literal == intern);
   }
}

// Return Value : true
// Return Value : true
```
1. `.intern()`메소드는 주어진 문자열이 `string constant pool`에 존재하는지 검색한다. 검색 결과 문자열이 있으면 그 주소값을 반환하고, 없다면 문자열을 `string constant pool`에 넣고 새로운 주소값을 반환한다.
2. 따라서 위의 코드에서 `.inter()`메소드는 `object`변수가 갖는 문자열이 `string constant pool`에 존재하는지 검색한다.
3. 검색 결과 `literal`의 문자열이 있음이 학인되어 `literal`의 주소값을 반환하게 된다.
4. 따라서 `==` 연산자의 결과도 true가 나오게 된다. 

<br>
<br>

### int lastIndexOf(String str)

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint");
      String SubStr1 = new String("Tutorials" );
      System.out.print("Found Last Index :" );
      System.out.println( Str.lastIndexOf( SubStr1 ));
   }
}

// Return Value : Found Last Index :11
```
1. 주어진 부분 문자열(SubStr1)의 마지막 인덱스 위치를 반환한다.
2. "Welcome to Tutorialspoint"에서 "Tutorials"는 0,1,2,3,4 순으로 해서 11번째부터 위치한다. 

<br>
<br>

### int lastIndexOf(String str, int fromIndex)

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");
      String SubStr1 = new String("Tutorials" );
      System.out.print("Found Last Index :" );
      System.out.println( Str.lastIndexOf( SubStr1, 15 ));
   }
}

// Return Value : Found Last Index :11
```
1. 이 인스턴스에서 마지막으로 발견되는 지정된 문자열의 0부터 시작하는 인덱스 위치를 보고한다. 
2. 지정된 문자 위치에서 시작하고 문자열의 시작 부분을 향해 뒤로 검색이 진행된다.  
3. 찾을 수없는 경우에는 -1로 나타난다. 

<br>
<br>

### int length()

```java
public class Test {

   public static void main(String args[]) {
      String Str1 = new String("Welcome to Tutorialspoint.com");
      String Str2 = new String("Tutorials" );

      System.out.print("String Length :" );
      System.out.println(Str1.length());

      System.out.print("String Length :" );
      System.out.println(Str2.length());
   }
}

// String Length : 29
// String Length : 9
```
문자열의 길이를 반환한다.

<br>
<br>

### boolean matches(String regex)

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.println(Str.matches("(.*)Tutorials(.*)"));
      System.out.println(Str.matches("Tutorials"));
      System.out.println(Str.matches("Welcome(.*)"));
   }
}

// Return Value : true
// Return Value : false
// Return Value : true
```
1. 문자열이 주어진 정규 표현식과 일치하는지 여부를 알려준다. 
2. 문자열이 정해진 정규 표현에 일치하는 경우에만 true를 돌려준다.


<br>
<br>

### boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset,  int len)

```java
public class Test {

   public static void main(String args[]) {
      String Str1 = new String("Welcome to Tutorialspoint");
      String Str2 = new String("TUTORIALS");

      System.out.println(Str1.regionMatches(true, 11, Str2, 0, 9));
   }
}

// Return Value :true
```
1. 두 개의 문자열 영역이 동일한지 테스트하는데 사용한다.
2. `ignoreCase` : 대소문자 구분 무시
3. `toffset` : 주어진 부분 문자열이 시작하는 부분("Welcome to Tutorialspoint"에서 Tutorials은 11번째에서 시작된다.)
3. `ooffset`과 `len` : str2의 TUTORIALS이 비교를 시작하는 문자의 위치와 그 문자로부터 마지막 문자의 길이를 나타낸다.
4. 일치하면 true를 반환하고 그렇지않으면 false를 반환한다.

<br>
<br>

### boolean regionMatches(int toffset, String other, int ooffset, int len)

```java
public class Test {

   public static void main(String args[]) {
      String Str1 = new String("Welcome to Tutorialspoint.com");
      String Str2 = new String("Tutorials");
      String Str3 = new String("TUTORIALS");

      System.out.println(Str1.regionMatches(11, Str2, 0, 9));
      System.out.println(Str1.regionMatches(11, Str3, 0, 9));
   }
}

//Return Value :true
//Return Value :false
```
1. 두개의 문자열 영역이 동일한지 테스트 하는데 사용한다.  
2. 2번째 출력 결과는 위의 `regionMatches(boolean ignoreCase, int toffset, String other, int ooffset,  int len)`과 다르게 `ignoreCase`가 적용되지 않아 false로 반환된다.

<br>
<br>

### String replace(char oldChar, char newChar)

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");


      System.out.println(Str.replace('o', 'T'));
      System.out.println(Str.replace('l', 'D'));
   }
}

// Return Value :WelcTme tT TutTrialspTint.cTm
// Return Value :WeDcome to TutoriaDspoint.com
```
1. oldChar를 모두 newChar로 치환하는 메소드이다.
2. 첫번째 출력 결과 알파벳 'o' 가 모두 대문자 알파벳 'T'로 치환된 것을 확인할 수 있고
3. 두번쨰 출력 결과 알파벳 'l' 가 모두 대문자 알파벳 'D'로 치환된 것을 확인할 수 있다.

<br>
<br>

### String replaceAll(String regex, String replacement)

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.println(Str.replaceAll("(.*)Tutorials(.*)", "AMROOD"));
   }
}

// Return Value :AMROOD
```
1. 문자열의 각 부분 문자열을 주어진 정규 표현식과 일치하는 것으로 대체한다.
2. `regex` : 이 문자열을 일치시킬 정규 표현
3. `replacement` : 발견된 표현식을 대체할 문자열.

<br>
<br>

### String replaceFirst(String regex, String replacement)

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint");

      System.out.println(Str.replaceFirst("(.*)Tutorials(.*)", "AMROOD"));
      System.out.println(Str.replaceFirst("Tutorials", "AMROOD"));
   }
}

// Return Value :AMROOD
// Return Value :Welcome to AMROODpoint.com
```
1. 이 정규 표현식에 일치하는 문자열을, 지정된 다른 문자열로 치환한다.
2. 두번째 출력 결과 "Welcome to Tutorialspoint"의 Tutorials가 "AMROOD"로 치환된 것을 확인할 수 있다.

<br>
<br>

### String[] split(String regex)

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome-to-Tutorialspoint.com");    
      
      for (String retval: Str.split("-")) {
         System.out.println(retval);
      }
   }
}

// Return Value : Welcome
// Return Value : to
// Return Value : Tutorialspoint.com
```
이 문자열을 주어진 정규 표현식의 일치 부분으로 분할하여 계산된 문자열 배열을 반환한다.

<br>
<br>

### String[] split(String regex, int limit)

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome-to-Tutorialspoint.com");
      
      for (String retval: Str.split("-", 2)) {
         System.out.println(retval);
      }
      System.out.println("");
      
      for (String retval: Str.split("-", 3)) {
         System.out.println(retval);
      }
      System.out.println("");
      
      for (String retval: Str.split("-", 0)) {
         System.out.println(retval);
      }
   }
}


// Return Value : Welcome
// Return Value : to-Tutorialspoint.com

// Return Value :
// Return Value : Welcome
// Return Value : to
// Return Value : Tutorialspoint.com

// Return Value : Welcome
// Return Value : to
// Return Value : Tutorialspoint.com
```
1. 몇개까지 구분할 건지 숫자(limit)로 표현해 지정한다.
2. 0은 디폴트와 같다. 아무것도 지정하지 않는다는 의미이다.

<br>
<br>

### boolean startsWith(String prefix)
```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value : " );
      System.out.println(Str.startsWith("Welcome") );

      System.out.print("Return Value : " );
      System.out.println(Str.startsWith("Tutorials") );
   }
}

//Return Value : true
//Return Value : false
```
인수로 나타나는 문자열이 전체 문자열의 접두사 인지 아닌지 판별하여 boolean형으로 반환한다.

<br>
<br>

### boolean startsWith(String prefix, int toffset)
```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.startsWith("Welcome", 0) );
      
      System.out.print("Return Value :" );
      System.out.println(Str.startsWith("Welcome", 1) );
   }
}

//Return Value :true
//Return Value :false
```
인수로 나타나는 문자열의 접두사의 인덱스가 인수로 나타나는 인덱스와 일치하는지 판별하여 boolean형으로 반환한다.

<br>
<br>

### CharSequence subSequence(int beginIndex, int endIndex)
```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.subSequence(0, 10) );

      System.out.print("Return Value :" );
      System.out.println(Str.subSequence(10, 15) );
   }
}

//Return Value :Welcome to
//Return Value : Tuto
```
개시 인덱스와 종료 인덱스의 -1 만큼 문자열을 추출하여 CharSequence형으로 반환한다.

<br>
<br>

### String substring(int beginIndex)
```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10) );

   }
}

//Return Value : Tutorialspoint.com
```
개시 인덱스부터 맨 끝까지의 문자열을 추출하여 String형으로 반환한다.

<br>
<br>

### String substring(int beginIndex, int endIndex)
```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10, 15) );
   }
}

//Return Value : Tuto
```
개시 인덱스와 종료 인덱스의 -1 만큼 문자열을 추출하여 String형으로 반환한다.

<br>
<br>

### char[] toCharArray()
```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.toCharArray() );
     
   }
}

//Return Value :Welcome to Tutorialspoint.com
```
문자열 전체를 char형 1차원배열 형태로 반환한다.

<br>
<br>

### String toLowerCase()
```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :");
      System.out.println(Str.toLowerCase());
      
   }
}

//Return Value :welcome to tutorialspoint.com
```
문자열 전체를 소문자로 변환하여 String형으로 반환한다.

<br>
<br>

### String toLowerCase(Locale locale)
```java
import java.util.Locale;

public class Test {

	public static void main(String args[]) {
		String str = new String("ABC IS NOT EQUAL TO XYZ");

		System.out.println(str.toLowerCase(new Locale("tr")));
		System.out.println(str.toLowerCase(new Locale("en-US")));

	}
}

//Return Value :abc ıs not equal to xyz
//Return Value :abc is not equal to xyz
```
문자열 전체를 소문자로 변환하여 나라별 형식에 맞춰 String형으로 반환한다.

<br>
<br>

###	String toString()
```java
public class Test {

	public static void main(String args[]) {
	      String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :");
	      System.out.println(Str.toString());

	}
}

//Return Value :Welcome to Tutorialspoint.com
```
문자열 전체를 String형으로 반환한다.

<br>
<br>

### String toUpperCase()
```java
public class Test {

	public static void main(String args[]) {
	      String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str.toUpperCase() );

	}
}

//Return Value :WELCOME TO TUTORIALSPOINT.COM
```
문자열 전체를 대문자로 변환하여 String형으로 반환한다.

<br>
<br>

###	String toUpperCase(Locale locale)
```java
import java.util.Locale;

public class Test {

	public static void main(String args[]) {
		String str = new String("abcdefghijklmnopqrstuvwxyz");

		System.out.println("Return Value :"+str.toUpperCase(new Locale("tr")));
		System.out.println("Return Value :"+str.toUpperCase(new Locale("en-US")));


	}
}

//Return Value :ABCDEFGHİJKLMNOPQRSTUVWXYZ
//Return Value :ABCDEFGHIJKLMNOPQRSTUVWXYZ
```
문자열 전체를 대문자로 변환하여 나라별 형식에 맞춰 String형으로 반환한다.

<br>
<br>

### String trim()

```java
public class Test {

   public static void main(String args[]) {
      String Str = new String("   Welcome to Tutorialspoint.com   ");

      System.out.print("Return Value :" );
      System.out.println(Str.trim() );
   }
}
// Return Value : Welcome to Tutorialspoint.com
```
문자열 앞 뒤의 공백을 지워준다.

<br>
<br>

### String valueOf()

* static String valueOf (boolean b)

* static String valueOf (char c)

* static String valueOf (char[] data)

* static String valueOf (char[] data, int offset, int count)

* static String valueOf (double d)

* static String valueOf (float f)

* static String valueOf (int i)

* static String valueOf (long l)

* static String valueOf (Object obj)


```java
public class Test {

   public static void main(String args[]) {
      double d = 102939939.939;
      boolean b = true;
      long l = 1232874;
      char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

      System.out.println("Return Value : " + String.valueOf(d) );
      System.out.println("Return Value : " + String.valueOf(b) );
      System.out.println("Return Value : " + String.valueOf(l) );
      System.out.println("Return Value : " + String.valueOf(arr) );
   }
}

// Return Value : 1.02939939939E8
// Return Value : true
// Return Value : 1232874
// Return Value : abcdefg
```
문자열 이외의 자료형을 가진 값들을 문자열로 바꿔준다.

<br>
<br>

### boolean contains(CharSequence s)

```java
public class Main {

	public static void main(String[] args) {
		String string = "abcdefg";
		boolean value1 = string.contains("fg");
		boolean value2 = string.contains("hi");
		
		System.out.println(value1);
		System.out.println(value2);
	}
}

// Return Value : true
// Return Value : false
```
문자열 안에 특정 문자열이 포함되어 있는지 알려준다. 
