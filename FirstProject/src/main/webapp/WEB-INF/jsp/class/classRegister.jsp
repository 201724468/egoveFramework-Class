<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수업 개설</title>
<!-- Latest compiled and minified CSS -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
    integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
    crossorigin="anonymous">
 
<!-- Optional theme -->
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
    integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
    crossorigin="anonymous">
 
<!-- Latest compiled and minified JavaScript -->
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
    integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
    crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <a class="navbar-brand" href="/class/classList.do">University Class Plan</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
</nav>
<br/>
    <h1 class="text-center">수업 개설</h1>
<br/>
<br/>
<div class="container">

		<form action="/class/classList.do" id="move_form" name="move_form" method="get">
			<input type="hidden" id="pgMode" name="pgMode" 	value="${vo.pgMode }" />
    	</form>
    	
        <form id="write_form" name="write_form" action="insertClass.do" method="post"
            encType="multiplart/form-data">
			<input type="hidden" id="pgMode" name="pgMode" 	value="${searchVo.pgMode }" />
			
            <table class="table table-bordered">
                <tbody>
                    <tr>
                        <th>수업코드</th>
                        <td><input type="text" placeholder="수업 코드을 입력하세요."
                            name="classCode" class="form-control" /></td>
                    </tr>
                    <tr>
                        <th>수업명</th>
                        <td><input type="text" placeholder="수업명을 입력하세요."
                            name="className" class="form-control" /></td>
                    </tr>
                    <tr>
                        <th>수업 내용</th>
                        <td><textarea placeholder="수업 내용을 입력하세요 ." name="classNote"
                                class="form-control" style="height: 200px;"></textarea></td>
                    </tr>
<!--                     <tr> -->
<!--                         <th>첨부파일</th> -->
<!--                         <td><input type="file" name="uploadFile"></td>     -->
<!--                     </tr> -->
                    <tr>
                        <td colspan="2">
                            <button id="btn_previous" type="button" class="btn_previous" onclick="javascript:previous();">이전</button>
                            <button id="btn_store" type="button" class="btn_store" onclick="javascript:store();">등록</button>
                    </tr>
 
                </tbody>
            </table>
        </form>
    </div>
</body>
<script type="text/javascript">

function previous(){
	var frm = document.move_form;
	frm.pgMode.value = 'classList';
	frm.submit();
}

function store(){	
	var frm = document.write_form;

	if(confirm("등록하시겠습니까?")){
		frm.pgMode.value = 'insertClass';
		frm.action = "/insertClass.do";
		frm.submit();
	}
	 
}
</script>
</html>
