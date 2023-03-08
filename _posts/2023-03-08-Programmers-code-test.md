---
layout: post
title: Programmers Code Test - Lv1.문자열을 정수로 바꾸기
category: codetest
tag: 코드테스트
---

**문제 설명**

- 문자열 `s`를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

##### 제한 사항

- `s`의 길이는 1 이상 5이하입니다.
- `s`의 맨앞에는 부호(+, -)가 올 수 있습니다.
- `s`는 부호와 숫자로만 이루어져있습니다.
- `s`는 `"0"`으로 시작하지 않습니다.

##### 입출력 예

예를들어 `str`이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.<br>
`str`은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.

###### 풀이

```java

class Solution {
    public int solution(String s) {

        int answer = Integer.parseInt(s);
        return answer;
    }
}

```
