<%@page contentType="text/html; charset=Windows-31J"%>
<%@page import="blog.Topic,java.util.List"%>
<html>
<body>

<h2>²����log</h2>

<a href="read">���s���J</a>

<form action="post" method="POST">
	���D<input type="text" name="title" size="40">
	<br>
	<textarea name="content" rows="5" cols="40"></textarea>
	<br>
	<input type="submit" value="�K��">
</form>

<%
List topics = (List)request.getAttribute("topics");
if(topics != null){
	for(int i=topics.size()-1; i>=0; i--){
		Topic topic = (Topic)topics.get(i);
%>
		<hr>
		���D<%=topic.getTitle()%>
		(<%=topic.getPostDate()%>)
		<pre><%=topic.getContent()%></pre>
<%
	}
}
%>

</body>
</html>