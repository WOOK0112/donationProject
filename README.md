<img width="1198" alt="스크린샷 2024-01-26 오후 4 55 10" src="https://github.com/codestates-seb/seb44_main_004/assets/124886494/0d9e7c5a-f629-4e26-a0fe-174fd47a79f5">

# 기부 활성화 웹 커뮤니티 서비스 'WarmWave'

**`프로젝트 명` :** WarmWave <br/>
**`프로젝트 기간` :** 2023.11.01 - 2023.12.01 <br/>
`프로젝트 팀원` <br/>
|이름|담당기능|
|------|---|
|김동욱|기부게시판|
|장영조|메인페이지/배포|
|신재안|보안/인증/마이페이지|
|곽윤희|회원가입|
|서예린|채팅방|
|이은호|커뮤니티게시판|

## 0. 목차
  1. 프로젝트 개요
  2. 상세기능
  3. 기술스택
  4. etc.

## 1. 프로젝트 개요
  - 기부에 대한 심리적, 물리적 접근성을 높여 기부를 활성화 하는 것을 목표로 하는 서비스 입니다.
  - 이용자는 자신 주변의 기부를 할 수 있는 복지기관을 확인할 수 있습니다.
  - 일반 이용자는 기부하고 싶은 물품을 등록하거나, 복지기관의 필요물품을 확인하고 기부를 진행할 수 있습니다.
  - 복지기관은 필요물품에 대한 요청글을 게시하거나, 이용자가 등록한 기부물품에 대해 기부받기를 진행할 수 있습니다.
  - 일반이용자 및 복지기관은 커뮤니티 게시판을 통해 봉사활동 모집이나 봉사인증 등의 커뮤니티 활동을 할 수 있습니다.

## 2. 상세기능
### - 메인페이지 & 채팅기능
<table>
  <thead>
    <tr>
      <th style='text-align: center'>메인페이지</th>
      <th style='text-align: center'>채팅방생성 및 채팅</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/7b35d5cf-2beb-4505-ac62-d34dd9ea93f2' />
      </td>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/05316a10-64c3-441e-91a7-c0a0c99f0573' />
      </td>
    </tr>
  </tbody>
  
  <tbody>
    <td>
      - 기부완료된 총 건수를 확인할 수 있다.<br/>
      - 가장 최근에 업로드된 기부게시글을 확인할 수 있다.<br/>
      - 로그인할 경우 지도를 통해 회원가입시 등록된 주소지를 기준으로 주변 복지시설을 확인할 수 있다.
    </td>
    <td>
      - 기부게시판에 등록된 게시글을 통해 채팅방을 생성할 수 있다.<br/>
      - 게시글 등록자와 채팅방 생성자간의 실시간 채팅을 통해 기부진행에 대해 논의할 수 있다.
    </td>
  </tbody>
</table>

### - 개인회원 & 기관회원가입
<table>
  <thead>
    <tr>
      <th style='text-align: center'>개인회원가입</th>
      <th style='text-align: center'>기관회원가입</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/b249cc68-b85d-44b4-918d-f4e0c22c1ffe' />
      </td>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/d663c406-a6f8-40f4-a20c-4c1608a0d1b8' />
      </td>
    </tr>
  </tbody>
  <tbody>
    <td>
      - 일반사용자는 개인정보(이메일, 주소지 등)를 등록하여 회원가입을 진행할 수 있다.<br/>
      - 회원가입시 기입한 이메일을 통해 이메일인증을 진행하여 회원가입을 완료할 수 있다.
    </td>
    <td>
      - 복지기관에 한하여 기관회원가입을 할 수 있다.
      - 기관사용자는 기관정보(이메일, 기관명, 기관주소, 사업자등록증 등)를 등록하여 회원가입을 진행할 수 있다.<br/>
      - 사업자등록증 및 이메일 인증을 완료한 후에 회원가입을 완료할 수 있다.
    </td>
  </tbody>
</table>

### - 로그인 & 마이페이지
<table>
  <thead>
    <tr>
      <th style='text-align: center'>로그인</th>
      <th style='text-align: center'>마이페이지</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/b92117df-70cd-4186-adc9-3c657206a203' />
      </td>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/7f2194c2-62b2-48f2-80d5-57bc5186c3ab' />
      </td>
    </tr>
  </tbody>
  <tbody>
    <td>
      - 회원가입한 정보를 통해 로그인을 할 수 있다.<br/>
      - 로그인 후 메인페이지를 통해 회원주소지 근처의 복지시설 위치를 확인할 수 있다.<br/>
      - 로그인 후 권한에 맞는 서비스 이용이 가능하다.(게시글 작성, 실시간 채팅 등)
    </td>
    <td>
      - 로그인한 사용자는 마이페이지로 이동할 수 있다<br/>
      - 마이페이지를 통해 개인정보 변경, 작성한 게시글 조회 등의 기능을 사용할 수 있다.
    </td>
  </tbody>
</table>

### - 게부게시글 작성 & 수정 & 삭제
<table>
  <thead>
    <tr>
      <th style='text-align: center'>기부게시글작성</th>
      <th style='text-align: center'>기부게시글수정 및 삭제</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/835e6a7d-68f0-4d6b-8e32-c0d20ada3751' />
      </td>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/efd23258-04ef-433e-9d08-4652bf1ae2dc' />
      </td>
    </tr>
  </tbody>
  <tbody>
    <td>
      - 로그인한 사용자는 기부게시글을 작성할 수 있으며, 게시글종류는 `기부해요`,`필요해요`,`인증해요`가 있다.<br/>
      - 일반회원은 `기부해요`,`인증해요`게시글 작성이 가능하고, 기관회원은 `인증해요` 게시글 작성이 가능하다.<br/>
      - 게시글 작성시 다수의 이미지 첨부를 할 수 있으며, `글제목`, `글내용`, `물품종류`를 기입하여야 한다.
    </td>
    <td>
      - 본인이 작성한 게시글에 대해서만 글수정 및 삭제가 가능하다<br/>
      - 채팅방과 연결된 게시글에 대해서는 글삭제가 불가능하다.
    </td>
  </tbody>
</table>

### - 커뮤니티게시글 작성 및 수정 & 페이징 및 정렬
<table>
  <thead>
    <tr>
      <th style='text-align: center'>커뮤니티 게시글 작성 및 수정</th>
      <th style='text-align: center'>커뮤니티 게시글 페이징 및 정렬</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/5efa5490-9d06-41ec-bb4d-b2121d448ca5' />
      </td>
      <td>
        <img style='width: 450px;' src='https://github.com/codestates-seb/seb44_main_004/assets/124886494/f1d27d1a-3482-4565-b4dc-b0feff04e58a' />
      </td>
    </tr>
  </tbody>
  
  <tbody>
    <td>
      - 로그인한 사용자는 커뮤니티게시판에 게시글을 작성할 수 있으며, 단일 이미지 첨부가 가능하다.<br/>
      - 자신이 작성한 게시글에 대해서만 글수정 및 삭제가 가능하다.
    </td>
    <td>
      - 기부게시글 목록에 대해 페이징 기능이 적용되어 있다.<br/>
      - 기부게시글 목록에 대해 `최신순`,`조회순`으로 정렬을 할 수 있다.
    </td>
  </tbody>
</table>

## 3. 기술스택
<img width="925" alt="image" src="https://github.com/codestates-seb/seb44_main_004/assets/124886494/e703c574-4d79-4f18-86b9-f48a434a0823">

## 4. ERD
<img width="925" alt="image" src="https://github.com/codestates-seb/seb44_main_004/assets/124886494/c6a9336e-fff4-4953-8ca9-b4c6801fe5f7">
