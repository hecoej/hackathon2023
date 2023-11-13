# hackathon2023
<span style="background-color: #fafab4"> 팀명 : 그대들은 어떻게 투표할 것인가 | 선거의 손전등 웹사이트 만들기</span> <br/>

### 제출 타입 및 주제
E타입 - 청년들의 정치 무관심 해결 및 잘못된 지표에 근거한 투표 예방<br/>

### 프로젝트 한 줄 설명
청년을 위한 정치 가이드라인 웹 플랫폼<br/>


### 개발 툴
> 개발언어: 자바<br/>
> 프레임워크: 스프링부트<br/>
> 통합개발환경: 인텔리제이C<br/>
> DB: mariadb<br/>
<br/>

*****
### 프로젝트에 활용된 기술
**1. 뷰 템플릿 : thymeleaf**<br/>
:<후보 게시판> <br/>
<img width="1440" alt="스크린샷 2023-11-13 오후 4 34 44" src="https://github.com/hecoej/hackathon2023/assets/104301276/b9edbdd5-3ce0-4143-addf-8e2453c70791">
**2. DB 접근 : jpa**<br/>
: <후보별 공약 페이지> jpa 레포지토리를 활용해서 DB에 접근하는 방식을 이용하여 선택한 후보자에 해당하는 공약이 출력되도록 구현하였다.<br/>
<img src="https://github.com/hecoej/hackathon2023/assets/113933238/08ec2c63-ee7a-4c62-bb9d-627b66298c8c.png" width="400"/>
<img src="https://github.com/hecoej/hackathon2023/assets/113933238/0a0062a9-bbb5-4420-b7c5-0eb30f1d088d.png" width="400"/> <br/>
모든 후보자의 공약이 있는 DB에서 원하는 후보자의 공약만을 필터링 하는 것은 구현하였으나, 같은 공약이 여러번 출력되는 오류를 해결하지 못하였다.<br/>
<img src="https://github.com/hecoej/hackathon2023/assets/113933238/ed8a64fc-ccdb-4d71-8807-aa35d5038b60.png" width="600"/> <br/>
**3. 카카오맵 API : 선관위 위치 찾기**<br/> : <투표소 찾기 페이지> 카카오에서 배포하는 카카오맵 API를 이용하여 지역별 선거관리위원회의 위치를 쉽게 찾을 수 있게 구현했다. </br>
- 지역구 검색
- 검색한 지역구의 선거관리위원회 데이터를 불러와 마커 표시 </br> **!!안드로이드 카카오맵 API 개발자의 해시 키가 없을 경우 지도가 나타나지 않습니다!!** </br>
<img width="960" alt="image" src="https://github.com/hecoej/hackathon2023/assets/124009718/de94070b-c3c3-443c-a7ae-b78ff1a9f431">


### 시연영상
링크 : https://youtu.be/wDDSOV2ypPA?feature=shared
