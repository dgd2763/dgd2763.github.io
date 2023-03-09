---
layout: post
title: Programmers Code Test - Lv1.문자열을 정수로 바꾸기
category: codetest
tag: 코드테스트
---

**문제 설명**

- 함수 solution은 정수 `n`을 매개변수로 입력받습니다. `n`의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.



##### 제한 사항

- `n`은 1이상 8000000000 이하인 자연수입니다.


##### 입출력 예

|n     |return|
|------|------|
|118372|873211|

###### 풀이

```java

import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
		String[] sArray = (n+"").split("");
		Arrays.sort(sArray,Collections.reverseOrder());
		StringBuffer sbf = new StringBuffer();
		for(String s : sArray) {
			sbf.append(s);
		}
		answer = Long.parseLong(sbf.toString());
        
        return answer;
    }
}

```
