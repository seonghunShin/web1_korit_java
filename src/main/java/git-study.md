# git
- 파일 버전 관리 툴

## git 명령어
### 로컬환경 셋팅
1. 내 프로젝트 변경사항을 git이 추적하게 만드는 것 - git init
2. 현재 작성자의 서명 등록
- git config user.name 나의git아이디
- git config user.email 나의git이메일

3. 변경사항에 대하여 임시저장 - git add
4. 임시저장된 것들을 하나의 버전으로 포장 - git commit -m"커밋메세지"
5. 로컬에 저장된 commit들을 원격 레포지토리로 보낸다. - git push

### github환경 셋팅
1. repository 생성
2. 내 repository 접근 가능한 token 발급

### 로컬 - github repository 연결
1. 원격 저장소 주소를 저장 - git remote add origin 레포지토리 주소
2. 최초 push시, 원격 저장소와 로컬을 동기화
- git push -u origin main