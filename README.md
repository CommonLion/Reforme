# Reforme
2024년도 3학년 1학기 기초캡스톤 프로젝트입니다. Spring과 Vue.js 그리고 생성형 AI를 사용하여 사용자가 손쉽게 리폼 디자인을 생성하고, 이를 통해 디자이너와 원활하게 소통할 수 있는 "리폼 서비스 중개 플랫폼인" "리포미"라는 이름의 웹앱 프로그램을 개발하였습니다.

## 👨‍🏫 프로젝트 소개
리포미 프로젝트는 패스트 패션으로 인한 의류 폐기물 문제를 해결하기 위해 "의류 리폼 서비스 중개 플랫폼"을 개발하는 것을 목표로 합니다. 생성형 AI 기술을 활용하여 사용자가 손쉽게 원하는 리폼 디자인을 생성하고, 이를 통해 디자이너와 소비자가 원활하게 소통할 수 있는 환경을 제공합니다. 해당 프로젝트를 통해 의류 재사용을 촉진하고, 환경 오염 문제를 줄이며, 지속 가능한 패션 문화가 되기를 기대합니다.

## ⏲️ 개발 기간 
- 2024.03.04(월) ~ 2024.06.14(금)
- 프로젝트 기획
- 산학협력 전문가 미팅
- 서비스 개발
- 산학협력 발표 및 평가

## 🧑‍🤝‍🧑 개발자 소개 
- **정수영** : 팀장, Back-end
- **박시영** : Back-end
- **임현서** : Back-end
- **이영헌** : Back-end(AI-API)
- **조정훈** : Back-end(AI-API)
- **김동윤** : Front-end
- **김민성** : Front-end
- **김주현** : Front-end
- **박선봉** : Paper
- **허세현** : Paper
- **김민준** : architect

## 💻 개발환경
- **Version** : Java 17
- **IDE** : IntelliJ
- **Framework** : SpringBoot 3.2.4
- **ORM** : JPA

## ⚙️ 기술 스택
- **Server** : Tomcat (Local Server)
- **DataBase** : MySQL
- **WS/WAS** : Nginx, Tomcat
- **Frontend** : Vue.js
- **AI Tools** : DALL·E 3
- **아이디어 회의** : Discord, Notion

## 📝 프로젝트 아키텍쳐
![image](https://github.com/user-attachments/assets/32a5d0ef-da78-4a1a-b185-c374062f7932)

## 📌 주요 기능
### ✅ UI 구성

- **리포미 메인 페이지 & 회원가입 페이지 & 로그인 페이지**

![image](https://github.com/user-attachments/assets/d700ea7f-09d3-48cc-bafa-5956c01b9ee8)

- **리포미 탭(리폼 의뢰) & 리포유 탭(디자이너 소개)**

![image](https://github.com/user-attachments/assets/291a84b9-1061-47a2-9fa8-cc36a3aefb46)

- **생성형 이미지를 제공하는 AI 챗봇**

![image](https://github.com/user-attachments/assets/04dc37c6-ad2d-473a-8eb2-6814738094b5)

### ✅ 서비스 구성
- **유저 서비스**
	- 로그인 & 회원가입을 통한 회원 관리 기능
- **커뮤니티**
	- reforme : 리폼을 의뢰하는 게시글을 작성할 수 있는 페이지
	- reforyou : 디자이너 소개하는 게시글을 작성할 수 있는 페이지
		- 게시글 작성, 관리, 댓글 기능을 통해 리폼을 의뢰
- **AI 리포머**
	- DALL·E 3
	- 챗봇 기능을 활용하여 리폼을 원하는 이미지와 리폼 요청사항을 작성
	- 요청사항을 통해 작성된 생성형 이미지로 반환

## 💼 포스터
![캡스톤 디자인 경진대회 포스터_리포미 Team_2024](https://github.com/user-attachments/assets/1e04bf18-6fc4-4d20-a992-eecf4b3de83c)


## ✒️ 자료

- **back-git**: [🔗](https://github.com/CommonLion/reforme_back)

- **front-git** : [🔗](https://github.com/CommonLion/reforme_front)

- **논문** : [🔗](https://www.dbpia.co.kr/journal/articleDetail?nodeId=NODE11825610)

![논문 첫페이지](https://github.com/user-attachments/assets/ca9cffe7-53d2-4f2e-b0d2-eccf283b5920)
- **notion** : [🔗](https://patch-viburnum-087.notion.site/985cd8a9374f4d1ca11eeaac016f5dc4)

- **API 명세서** : [🔗](https://docs.google.com/spreadsheets/d/1SPrpvIgnhb34Qk32brxPfl3-MD7moHE-2pR4spV9G1s/edit?gid=0#gid=0)

