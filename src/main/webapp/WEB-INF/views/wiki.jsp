<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>${(code['M001'])['0001'] }</title>
  <!-- Bootstrap core CSS-->
  <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="resources/css/sb-admin.css" rel="stylesheet">
  
  <link rel="stylesheet" href="resources/css/editormd.parser.css" />
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- Navigation-->
  <jsp:include page="navigation.jsp" flush="false"/>
  
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="index.html">아리따움</a>
        </li>
        <li class="breadcrumb-item">
          <a href="index.html">업무</a>
        </li>
        <li class="breadcrumb-item active">주문</li>
      </ol>
      
      <div class="row">
        <div class="col-12">

          <div style="float:right; z-index: 100;">
            <a class="btn btn-primary" href="#" id="toggleNavColor">Export to PDF</a>
            <a class="btn btn-primary" href="#" id="toggleNavColor">Improve this doc</a>
          </div>
		
		<div id="editormd">
			<div class="editormd-preview">
				<div id="markdown-body" class="markdown-body editormd-preview-container"></div>
			</div>
			<textarea style="display:none;"># 주문

## 용어

주문(발주) : 매장에서 제품을 판매를 위해서 본사(아모레퍼시픽)로 제품을 발주 요청하는 프로세스
환입 : 주문과 반대되는 용어로 매장에서 존재하는 제품을 여러 사유로 본사로 다시 반품하기 위하여 진행하는 프로세스
직영점
가맹점
수탁점

<img src="/img/ibmpos_blue.png"/>

## 직영 매장과 가맹 매장 주문/환입의 차이

가맹 매장은 ~~
코드
	#include <stdio.h>
	int main(void)
	{
		printf("hello, word");
		return 0;
	}

코드

|a|b|
| ------------ | ------------ |
|1|2|
|4|3|</textarea>
		</div>
          <!-- wiki 본문 끝 -->
        </div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->

	<!-- footer -->
 	<jsp:include page="footer.jsp" flush="false"/>
	
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
 	<jsp:include page="logout.jsp" flush="false"/>

    <!-- Bootstrap core JavaScript-->
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="resources/js/sb-admin.min.js"></script>

	<script src="resources/js/editormd.js"></script>
  <script src="resources/js/marked.min.js"></script>
  <script>
  	var marked = marked(
  			$("#editormd").children("textarea")[0].innerHTML,
  			{
  				breaks: true,
  				sanitize: true,
                gfm         : true,
                tables      : true,
                pedantic    : false,
                smartLists  : true,
                smartypants : true
  			}
  			);
    $("#markdown-body").html(marked);
  </script>
  </div>
</body>
</html>