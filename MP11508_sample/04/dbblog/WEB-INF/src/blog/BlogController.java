package blog;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 操作Blog的商業邏輯
 * 
 * @author Shinji Miyamoto
 */
public class BlogController {

    /**
     * 簡易介面
     */
    private static BlogController controller = new BlogController();

    /**
     * 取得此類別的介面
     * 
     * @return BlogController的介面
     */
    public static BlogController getInstance() {
        return controller;
    }

    private BlogController() {
    }

    /**
     * 貼上主題文章
     * 
     * @param topic
     * 主題
     */
    public void postTopic(Topic topic) {
        String sql = "INSERT INTO TOPIC(TITLE, CONTENT)"
                + " VALUES(" + "'" + topic.getTitle() + "'"
                + ",'" + topic.getContent() + "'" + ")";

        Connection con = null;
        Statement smt = null;
        try {
            con = ConnectionManager.getConnection();
            smt = con.createStatement();
            smt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (smt != null) {
                try {
                    smt.close();
                } catch (Exception ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ignore) {
                }
            }
        }
    }

    /**
     * 取得最新的主題
     * 
     * @return 主題文章的清單
     */
    public List<Topic> getTopics() {

        String sql = "SELECT * FROM TOPIC";
        List<Topic> topics = new ArrayList<Topic>();

        Connection con = null;
        Statement smt = null;
        ResultSet rs = null;
        try {
            con = ConnectionManager.getConnection();
            smt = con.createStatement();
            rs = smt.executeQuery(sql);
            while (rs.next()) {
                Topic topic = new Topic();
                topic.setId(rs.getInt("ID"));
                topic.setPostDate(rs
                        .getTimestamp("POST_DATE"));
                topic.setTitle(rs.getString("TITLE"));
                topic.setContent(rs.getString("CONTENT"));
                topics.add(topic);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception ignore) {
                }
            }
            if (smt != null) {
                try {
                    smt.close();
                } catch (Exception ignore) {
                }
            }            
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ignore) {
                }
            }
        }

        return topics;
    }

    public static void main(String[] args) {
        BlogController ctrl = BlogController.getInstance();
        List<Topic> topics = ctrl.getTopics();
        for (int i = 0; i < topics.size(); i++) {
            System.out.println(topics.get(i));
        }

        System.out.println("END");
    }

}