---
layout: post
title: Programmers Code Test - Lv1.자연수 뒤집어 배열로 만들기
category: codetest
tag: 코드테스트
---
*문제 설명**

- 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

##### 제한 사항

- `n`은 10,000,000,000이하인 자연수입니다.

##### 입출력 예

| n    | return      |
| ---- | ------      |
| 12345| [5,4,3,2,1] |

###### 풀이

```java

    class Solution {
        public int[] solution(long n) {
            String ns = n+"";
            String[] sArray = ns.split("");
            int[] answer = new int[sArray.length];
            
            for(int a = 0; a<sArray.length; a++){   
                answer[a]=Integer.parseInt(sArray[sArray.length-(a+1)]);
            }
            
            return answer;
        }
    }
```
