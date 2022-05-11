<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
 <style>
      * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
      }
      body {
        width: 100%;
        height: 100%;
      }
      section#log_body {
        width: 100%;
        height: 100%;
        padding: 0;
        margin: 0;
      }
      #login_body form {
        width: 600px;
        padding: 40px;
        
        background-color: white;
        text-align: center;
        position: absolute;
        border-radius: 10px;
        border: 2px solid #888;
        margin: 200px 35%;
      }

      #login_body input {
        display: block;
        margin: 0 auto;
        text-align: center;
        width: 200px;
        padding: 16px 12px;
        background: none;
        outline: none;
        border: 0;
        color: black;
        transition: 0.5s;
      }
      #login_body button {
        display: block;
        margin: 20px auto;
        text-align: center;
        width: 200px;
        padding: 16px 12px;
        background: none;
        outline: none;
        border: 0;
      }
      #login_body input {
        border: 2px solid #888;
        color: black;
        border-radius: 10px;
      }
      #login_body input:focus {
        width: 280px;
        border: 2px solid black;
      }
      #login_body button {
        border: 2px solid white;
        color: white;
        background-color: #ff7f00;
        border-radius: 10px;
      }
  
 
      input {
        color: black;
      }
      form ul {
        display: flex;
        list-style: none;
        margin: 30px auto 0;
      }
      form ul li {
        margin: auto;
        font-size: 14px;
        font-weight: bold;
      }
      form ul li, button:hover {
        cursor: pointer;
      }
      img {
        width: 50%;
        margin: 20px;
      }
      p {
        margin: 20px;
        display: none;
        /* onclick시 display: block; */
        color: red;
        font-size: 10px;
      }
    </style>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${rootPath}/resources/js/log.js?ver=2022-05-09"/></script>
</head>
<body>
<section id="login_body">
      <form id="login-form">
       <a href="./.jsp"><img class="logo" src="${rootPath}/resources/images/logo.png"></a>
        <input type="text" placeholder="ID" name="m_name" class="id" />
        <input type="password" placeholder="비밀번호" name="m_password" />
        <div>
        <p class="show">
          아이디(로그인 전용 아이디) 또는 비밀번호를 잘못 입력했습니다.<br />
          입력하신 내용을 다시 확인해주세요.
        </p>
        <button type="button" class="login">로그인</button>
        </div>
        <ul>
          <li>비밀번호 찾기</li>
          <li>아이디 찾기</li>
          <li>회원가입</li>
        </ul>
      </form>
    </section>
    <nav>
      <ul></ul>
    </nav>
</body>
</html>