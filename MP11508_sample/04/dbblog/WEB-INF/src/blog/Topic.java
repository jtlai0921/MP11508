package blog;

import java.util.Date;

/**
 * �D�D�����e
 */
public class Topic {

	/**�s�� */
	private int id;	
	/**���D */
	private String title;
	/**���e */
	private String content;
	/** �K��� */
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
	//�P��ª�Setter�PGetter
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
