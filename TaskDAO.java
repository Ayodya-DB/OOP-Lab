package tasktracker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TaskDAO {

    public boolean addTask(Task task) {

        try {
            Connection con = DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO tasks(task_id, task_title, status) VALUES(?,?,?)";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, task.getTaskId());
            pst.setString(2, task.getTaskTitle());
            pst.setString(3, task.getStatus());

            int rows = pst.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            System.out.println(e);
            return false;
        }
    }

    public Task searchTask(int id) {

        try {

            Connection con =
                    DatabaseConnection.getConnection();

            String sql =
                    "SELECT * FROM tasks WHERE task_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, id);

            ResultSet rs =
                    pst.executeQuery();

            if (rs.next()) {

                return new Task(
                        rs.getInt("task_id"),
                        rs.getString("task_title"),
                        rs.getString("status")
                );
            }

        } catch (Exception e) {

            System.out.println(e);
        }

        return null;
    }

    public boolean updateTask(Task task) {

        try {

            Connection con =
                    DatabaseConnection.getConnection();

            String sql =
                    "UPDATE tasks SET task_title=?, status=? WHERE task_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setString(1, task.getTaskTitle());
            pst.setString(2, task.getStatus());
            pst.setInt(3, task.getTaskId());

            int rows = pst.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            System.out.println(e);
            return false;
        }
    }

    public boolean deleteTask(int id) {

        try {

            Connection con =
                    DatabaseConnection.getConnection();

            String sql =
                    "DELETE FROM tasks WHERE task_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, id);

            int rows = pst.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            System.out.println(e);
            return false;
        }
    }
}