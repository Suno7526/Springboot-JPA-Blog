<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">

    <form>
        <input type="hidden" id="id" value="${principal.user.id}"/>
        <div class="form-group">
            <label for="username">ID</label>
            <input type="text" value="${principal.user.username}" class="form-control" id="username" placeholder="Enter ID" name="username" readonly>
        </div>
        <div class="form-group">
            <label for="password">비밀번호</label>
            <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password">
        </div>
        <div class="form-group">
            <label for="email">이메일</label>
            <input type="email" value="${principal.user.email}" class="form-control" id="email" placeholder="Enter Email" name="email">
        </div>

    </form>

    <button id="btn-update" class="btn btn-primary">Update</button>

</div>
<br>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>