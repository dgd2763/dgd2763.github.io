---
layout: post
title: Programmers Code Test - Lv1.짝수와 홀수
category: codetest
tag: 코드테스트
---

**문제 설명**

- 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

**제한 조건**

- `num`은 `int` 범위의 정수입니다.
- `0` 은 `짝수`입니다.
  
**입출력 예**

| num  | return |
| ---- | ------ |
| 3    | "Odd"  |
| 4    | "Even" |

**풀이**

```java
class Solution {
    public String solution(int num) {
        String answer = num%2==0?"Even":"Odd";
        return answer;
    }
}
```

