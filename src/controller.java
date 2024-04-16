import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class controller {
	static View v;
	static void saveImage(BufferedImage image, String filename) {
        try {
            File file = new File(filename);
            ImageIO.write(image, "png", file); // Lưu BufferedImage vào file ở định dạng PNG
            System.out.println("Panel saved to: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	static void openFile(String filename) {
        try {
            File file = new File(filename);
            Desktop.getDesktop().open(file); // Mở file bằng ứng dụng mặc định
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }
	public static void insert(model md, String tablebill) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionDatabase.connect(); // Thiết lập kết nối đến cơ sở dữ liệu
            String sql = "INSERT INTO " + tablebill + " (\"Tên hàng\", \"Đơn giá\", \"Số lượng\", \"Thành tiền\") VALUES (?, ?, ?, ?)";

            statement = connection.prepareStatement(sql);
            statement.setString(1, md.getTenhang());
            statement.setInt(2, md.getDongia());
            statement.setInt(3, md.getSoluong());
            statement.setInt(4, md.getThanhtien());

            statement.executeUpdate(); // Thực hiện câu lệnh INSERT

        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ bằng cách in thông tin lỗi ra console
            throw e; // Ném lại ngoại lệ để xử lý ở cấp độ gọi hàm
        } finally {
            // Đóng tài nguyên trong khối finally để giải phóng kết nối cơ sở dữ liệu
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
	
	public static void update(model md, String tablebill) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {    	
            connection = ConnectionDatabase.connect(); // Thiết lập kết nối đến cơ sở dữ liệu
            String sql = "UPDATE " + tablebill + " SET so_luong="  + " WHERE [DIEU_KIEN]";

            statement = connection.prepareStatement(sql);
            statement.setString(1, md.getTenhang());
            statement.setInt(2, md.getDongia());
            statement.setInt(3, md.getSoluong());
            statement.setFloat(4, md.getThanhtien());

            statement.executeUpdate(); // Thực hiện câu lệnh UPDATE

        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý ngoại lệ bằng cách in thông tin lỗi ra console
            throw e; // Ném lại ngoại lệ để xử lý ở cấp độ gọi hàm
        } finally {
            // Đóng tài nguyên trong khối finally để giải phóng kết nối cơ sở dữ liệu
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
	
}
