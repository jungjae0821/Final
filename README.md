<h1>202330211 박정재</h1>

* 프로그램 동작상태: 부분동작
    * 구구단은 정상적으로 출력되지만 창이 실행되지는 않음
```java
// 예상 문제구간
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            new Final(); // 결과 화면의 윈도우 출력
            } 
        });
    }
```