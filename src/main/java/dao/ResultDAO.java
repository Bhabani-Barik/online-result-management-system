//CRUD for Results
package dao;

import model.Result;
import java.sql.*;
import java.util.*;

public class ResultDAO {

    public boolean addResult(Result result) {
        String sql = "INSERT INTO result (result_id, student_id, subject, marks) VALUES (result_seq.NEXTVAL, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, result.getStudentId());
            pst.setString(2, result.getSubject());
            pst.setInt(3, result.getMarks());

            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Result> getResultsByStudentId(int studentId) {
        List<Result> results = new ArrayList<>();
        String sql = "SELECT * FROM result WHERE student_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, studentId);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Result result = new Result();
                    result.setId(rs.getInt("result_id"));
                    result.setStudentId(rs.getInt("student_id"));
                    result.setSubject(rs.getString("subject"));
                    result.setMarks(rs.getInt("marks"));
                    results.add(result);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
}
