<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/29
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form method="post" action="${pageContext.request.contextPath}/books/addBookDo">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" required placeholder="书籍名称" name="bookName" class="form-control" id="bookName">
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="number" required placeholder="书籍数量" name="bookCounts" class="form-control" id="bookCounts">
        </div>
        <div class="form-group">
            <label for="detail">书籍简介</label>
            <textarea placeholder="书籍简介..." required name="detail" class="form-control" id="detail"></textarea>
        </div>

        <button type="submit" class="btn btn-default">确认提交</button>
    </form>
</div>
</body>
</html>
