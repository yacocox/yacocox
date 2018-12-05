
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.jspsmart.upload.*" %>

<%
    String path = request.getContextPath();
    String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String url = basepath;
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basepath%>">
</head>
<body>
        <%
            SmartUpload smart = new SmartUpload();
            smart.initialize(config,request,response);
            smart.upload();
            smart.save("/upload");


//            int count = 0;
//            mySmartUpload.initialize(pageContext);
//            mySmartUpload.setTotalMaxFileSize(100000);
//            mySmartUpload.upload();
//            count = mySmartUpload.save("/upload");
//            out.println(count + "file(s) uploaded.");

        %>
</body>
</html>
