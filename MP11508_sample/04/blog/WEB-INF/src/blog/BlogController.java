package blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *�إ� Blog���޿�
 * 
 * @author Shinji Miyamoto
 */
public class BlogController {

    /**
     *²��������
     */
    private static BlogController controller = new BlogController();

    /**
     *�p��s�����p�ƾ�
     */
    private int idCounter;

    /**
     *Blog���峹�M��
     */
    private List<Topic> topics = new ArrayList<Topic>();

    /**
     *���o�����O������
     * 
     * @return BlogController������
     */
    public static BlogController getInstance() {
        return controller;
    }

    private BlogController() {
    }

    /**
     *�s�W�D�D
     * @param topic�D�D
     */
    public void postTopic(Topic topic) {
        synchronized (this) {
            topic.setId(idCounter++);
            topic.setPostDate(new Date());//�ثe�ɶ�
            topics.add(topic);
        }
    }

    /**
     *���o�̷s�D�D�峹
     * 
     * @return �D�D�峹�M��
     */
    public List<Topic> getTopics() {
        return new ArrayList<Topic>(topics);
    }

}