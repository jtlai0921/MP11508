package blog;

import java.util.Date;

/**
 * ¥DÃDªº¤º®e
 */
public class Topic {

	/**½s¸¹ */
	private int id;	
	/**¼ÐÃD */
	private String title;
	/**¤º®e */
	private String content;
	/** ¶K¤å¤é */
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
	//’P³æ¯ÂªºSetter»PGetter
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
