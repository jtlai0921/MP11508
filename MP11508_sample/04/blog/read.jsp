<%@page contentType="text/html; charset=Windows-31J"%>
<%@page import="blog.Topic,java.util.List"%>
<html>
<body>

<h2>簡易型log</h2>

<a href="read">重新載入</a>

<form action="post" method="POST">
	標題<input type="text" name="title" size="40">
	<br>
	<textarea name="content" rows="5" cols="40"></textarea>
	<br>
	<input type="submit" value="貼文">
</form>

<%
List topics = (List)request.getAttribute("topics");
if(topics != null){
	for(int i=topics.size()-1; i>=0; i--){
		Topic topic = (Topic)topics.get(i);
%>
		<hr>
		標題<%=topic.getTitle()%>
		(<%=topic.getPostDate()%>)
		<pre><%=topic.getContent()%></pre>
<%
	}
}
%>

</body>
</html>