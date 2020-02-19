package blog;

import java.util.Date;

/**
 *主題視窗
 */
public class Topic {

	/**連續編號 */
	private int id;	
	/**標題 */
	private String title;
	/**內 */
	private String content;
	/**貼文日 */
	private Date postDate;

	public String toString(){
		return super.toString()
			+ ",id=" + id
			+ ",title=" + title
			+ ",content=" + content
			+ ",postDate=" + postDate
			;
	}
	
	
	//
	//單純的Setter、Getter
	//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
