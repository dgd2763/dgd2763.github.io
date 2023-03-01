---
layout: post
title: Programmers Code Test - Lv1.문자열 내 p와 y의 개수
category: codetest
tag: 코드테스트
---
**문제 설명**

- 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.<br>'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
<br>예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
##### 제한 사항

- 문자열 `s`의 길이 : 50 이하의 자연수
- 문자열 `s`는 알파벳으로만 이루어져 있습니다.

##### 입출력 예

| s         | return |
| --------- | ------ |
| "pPoooyY" | true   |
| "Pyy"     | false  |

##### 입출력 예 설명
입출력 예 #1
- 'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.

입출력 예 #2
- 'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.

###### 풀이

```java

import java.util.Arrays;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        String[] array = s.split("");
		Arrays.sort(array);
		Stack<String> pstack = new Stack<>();
		Stack<String> ystack = new Stack<>();
		for(String a : array) {
			if(a.equalsIgnoreCase("p")) {
				pstack.add(a);
			} else if(a.equalsIgnoreCase("y")) {
				ystack.add(a);
			}
		}
		
        return pstack.size()==ystack.size();
    }
}
```
