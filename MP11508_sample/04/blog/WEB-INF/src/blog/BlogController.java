package blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *建立 Blog的邏輯
 * 
 * @author Shinji Miyamoto
 */
public class BlogController {

    /**
     *簡易式介面
     */
    private static BlogController controller = new BlogController();

    /**
     *計算編號的計數器
     */
    private int idCounter;

    /**
     *Blog的文章清單
     */
    private List<Topic> topics = new ArrayList<Topic>();

    /**
     *取得此類別的介面
     * 
     * @return BlogController的介面
     */
    public static BlogController getInstance() {
        return controller;
    }

    private BlogController() {
    }

    /**
     *新增主題
     * @param topic主題
     */
    public void postTopic(Topic topic) {
        synchronized (this) {
            topic.setId(idCounter++);
            topic.setPostDate(new Date());//目前時間
            topics.add(topic);
        }
    }

    /**
     *取得最新主題文章
     * 
     * @return 主題文章清單
     */
    public List<Topic> getTopics() {
        return new ArrayList<Topic>(topics);
    }

}