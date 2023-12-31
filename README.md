## 1차 요구사항 구현
- [x] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [x] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [x] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [x] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [x] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [x] 게시글 상세 페이지에는 id에 맞는 게시글 데이터와 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)
Form을 이용한 공백이 입력값으로 들어왔을 때 차단이 되게 기능 구현
## 미비사항 or 막힌 부분
- html article_form.html 작성하는데에 인터넷의 힘을 빌렸다
- 아직 html 작성하는데에는 반복이 더필요한것 같다

## MVC 패턴
- MVC 패턴은 Model, View, Controller로 각각 임무를 따로 맡아 프로젝트나 개발을 하는데에 있어
- 효율적이고 유지보수도 원활하게 만드는 작업이다
- 오늘 진행한 게시글 게시판 만들기에서는 Controller, Service, Repository 등으로 역할을 맡게
- 하여 MVC 패턴을 적용하였다

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- 의존성 주입 3가지 방법
1. 어노테이션 @Autowired를 사용, test목적으로 많이 사용한다
2. 직접 생성자 함수를 만들어 의존성 주입하는 방법
3. 롬복 @RequiredArgsConstructor를 사용해 final 키워드를 사용가능하게 해준다

## JPA의 장점과 단점
- 장점
1. JPA는 맵핑된 관계를 통하여 SQL을 생성하고 실행을 해주는 기능이기때문에 개발을 하는데에 있어
SQL보다는 코드를 짜는것에 더욱 집중하여 짤수 있다.
2. 유지보수 그리고 생산성이 수월해진다
- 단점
1. 맵핑된 관계를 통하여 SQL을 생성하고 실행하기 때문에 직접 SQL문을 복잡하게 작성하는 것에 비해 성능이 떨어질 수 있다
## HTTP GET 요청과 POST 요청의 차이
- HTTP GET 요청은 URL에 데이터를 포함시켜 요청을 보내는 구조이고 HTTP POST는 URL에 데이터를 숨기고 요청을
보내는 차이가 있다.
- 해당 차이로 인해 보안에 대한 안정성의 차이가 생긴다
