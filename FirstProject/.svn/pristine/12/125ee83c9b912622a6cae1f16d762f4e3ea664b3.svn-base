<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학교 생활</title>
<!-- Bootstrap CSS -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
<script type="text/javascript">

//등록
function create(){
	var frm = document.search_form;
	frm.pgMode.value = 'create';
	frm.action="/class/classRegister.do";
	frm.submit();
}

//수정 및 정보
function edit(seq){
	var frm = document.search_form;
	frm.classSeq.value = seq;
	frm.pgMode.value = 'edit';
	frm.submit();
}

//삭제
function deleteClass(id){
	var frm = document.search_form;
	if(!confirm('수업을 삭제하시겠습니까?\n 삭제한 수업은 복구 할 수 없습니다.')) return;
	frm.classSeq.value = id;
	frm.pgMode.value = 'deleteClass';
	frm.action="/deleteClass.do";
	frm.method="post";
	frm.submit();
}

//이전 버튼 이벤트
//5개의 인자값을 가지고 이동 classList.do
//무조건 이전페이지 범위의 가장 앞 페이지로 이동
function fn_prev(page, range, rangeSize, listSize, searchType, keyword) {
        
    var page = ((range - 2) * rangeSize) + 1;
    var range = range - 1;
        
    var url = "/class/classList.do";
    url += "?page=" + page;
    url += "&range=" + range;
    url += "&listSize=" + listSize;
    url += "&searchType=" + searchType;
    url += "&keyword=" + keyword;
    location.href = url;
    }


//페이지 번호 클릭
function fn_pagination(page, range, rangeSize, listSize, searchType, keyword) {

    var url = "/class/classList.do";
        url += "?page=" + page;
        url += "&range=" + range;
        url += "&listSize=" + listSize;
        url += "&searchType=" + searchType;
        url += "&keyword=" + keyword; 

        location.href = url;    
    }

//다음 버튼 이벤트
//다음 페이지 범위의 가장 앞 페이지로 이동
function fn_next(page, range, rangeSize, listSize, searchType, keyword) {
    var page = parseInt((range * rangeSize)) + 1;
    var range = parseInt(range) + 1;            
    var url = "/class/classList.do";
        url += "?page=" + page;
        url += "&range=" + range;
        url += "&listSize=" + listSize;
        url += "&searchType=" + searchType;
        url += "&keyword=" + keyword;
        location.href = url;
    }
    
// 검색
$(document).on('click', '#btnSearch', function(e){
    e.preventDefault();
    var url = "/class/classList.do";
    url += "?searchType=" + $('#searchType').val();
    url += "&keyword=" + $('#keyword').val();
    location.href = url;
}); 
</script>

<style type="text/css">
a{
 text-decoration: auto;
}
body{
	padding-top: 0px;
	padding-bottom: 30px;
}
</style>
</head>
<body>
<!--메뉴바 추가 부분-->

<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <a class="navbar-brand" href="/class/classList.do">University Class Plan</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

<!--   <div class="collapse navbar-collapse" id="navbarsExample03"> -->
<!--     <ul class="navbar-nav mr-auto"> -->
<!--       <li class="nav-item active"> -->
<!--         <a class="nav-link" href="#">Class <span class="sr-only">(current)</span></a> -->
<!--       </li> -->
<!--       <li class="nav-item"> -->
<!--         <a class="nav-link" href="#">Notes</a> -->
<!--       </li> -->
<!--       <li class="nav-item"> -->
<!--         <a class="nav-link disabled" href="#">Disabled</a> -->
<!--       </li> -->
<!--       <li class="nav-item dropdown"> -->
<!--         <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a> -->
<!--         <div class="dropdown-menu" aria-labelledby="dropdown03"> -->
<!--           <a class="dropdown-item" href="#">Action</a> -->
<!--           <a class="dropdown-item" href="#">Another action</a> -->
<!--           <a class="dropdown-item" href="#">Something else here</a> -->
<!--         </div> -->
<!--       </li> -->
<!--     </ul> -->

<!--     <form class="form-inline my-2 my-md-0"> -->
<!--       <input class="form-control" type="text" placeholder="Search"> -->
<!--     </form> -->
<!--   </div> -->
</nav>

    <br/>
    <h1 class="text-center">수업 리스트</h1>
    <br/>
    <br/>
    
    
    <div class="container">
    	<form name="search_form" method="get" action="/class/classList.do" onsubmit="return search(this);">
			<input type="hidden" name="pgMode" value="${searchVo.pgMode }" />
			<input type="hidden" id="classSeq" name="classSeq" value="${vo.classSeq }"/>

			<!-- search start -->
		    <div class="form-group row">
		        <div class="w100" style="padding-right: 10px">
		            <select class="form-control form-control-sm" name="searchType" id="searchType">
		                <option value="className">수업명</option>
		                <option value="classCode">수업코드</option>
		                <option value="classNote">수업 내용</option>
		            </select>
		        </div>
		        <div class="w300" style="padding-right: 10px">
		            <input type="text" class="form-control form-control-sm" id="keyword" name="keyword">
		        </div>
		        <div>
		        	<button class="btn btn-sm btn-primary" name="btnSearch" id="btnSearch">검색</button>
		        </div>
		    </div>
		    <!-- search end -->
	    </form>
        <table class="table table-hover table-striped text-center" style="border:1px solid;">
            <colgroup>
                <col width="5%" />
                <col width="30%" />
                <col width="20%" />
                <col width="*" />
                <col width="10%"/>
                <col width="10%"/>
                <col width="10%"/>
            </colgroup>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>수업 이름</th>
                    <th>수업 코드</th>
                    <th>수업 설명</th>
                    <th>등록 일자</th>
                    <th>정보 보기</th>
                    <th>관리</th>
                </tr>
            </thead>
            
            <tbody>
            <c:forEach items="${list }" var="vo" varStatus="status">
                <tr>
               		<td>${status.index + 1 }</td>
                    <td>${vo.className}</td>
                    <td>${vo.classCode}</td>
                    <td>${vo.classNote}</td>
                    <td>${vo.regiDtm }</td>
                    <td>
                    	<a class="btn btn-outline-info" onClick="javascript:edit(${vo.classSeq});">수업 정보</a><br/>
                    </td>
                    <td>
        				<a class="btn btn-outline-info" style="float:right" onClick="javascript:deleteClass(${vo.classSeq});">수업 삭제</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <!-- pagination start -->
        <div id="paginationBox" class="pagination1">
            <ul class="pagination" style="justify-content: center;">
 
                <c:if test="${pagination.prev}">
                    <li class="page-item"><a class="page-link" href="#"
                        onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}', '${pagination.listSize}'
                    ,'${search.searchType}', '${search.keyword}')">이전</a></li>
                </c:if>
 
                <c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" var="classSeq">
                    <li class="page-item <c:out value="${pagination.page == classSeq ? 'active' : ''}"/> ">
                    <a class="page-link" href="#"
                        onClick="fn_pagination('${classSeq}', '${pagination.range}', '${pagination.rangeSize}', '${pagination.listSize}'
                     ,'${search.searchType}', '${search.keyword}')">
                            ${classSeq} </a></li>
                </c:forEach>
 
                <c:if test="${pagination.next}">
                    <li class="page-item"><a class="page-link" href="#"
                        onClick="fn_next('${pagination.range}', '${pagination.range}', '${pagination.rangeSize}', '${pagination.listSize}'
                    ,'${search.searchType}', '${search.keyword}')">다음</a></li>
                </c:if>
            </ul>
        </div>
        <!-- pagination end -->
        <hr/>
        <a class="btn btn-outline-info" style="float:right" onClick="javascript:create();">수업 개설</a>
    </div>
    <br>
    </body>
</html>