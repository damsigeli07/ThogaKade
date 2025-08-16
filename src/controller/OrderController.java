
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import db.DBConnection;
import model.Order;
import model.OrderDetail;

public class OrderController {
    
    public static String getLastOrderId() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT id FROM Orders ORDER BY id DESC LIMIT 1");
        return rst.next() ? rst.getString("id") : null;
    }
    public static boolean addOrder(Order order) throws ClassNotFoundException, SQLException{
        DBConnection.getInstance().getConnection().setAutoCommit(false);
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Insert into Orders values(?,?,?)");
        stm.setObject(1, order.getId());
        stm.setObject(2, order.getDate());
        stm.setObject(3, order.getCustomerId());
        boolean isOrderAdded=stm.executeUpdate()>0;
        if(isOrderAdded){
            boolean isOrderDetails=OrderDetailController.addOrderDetail(order.getOrderDetailList());
            if(isOrderDetails){
                boolean isItemUpdate=ItemController.updateStock(order.getOrderDetailList()); 
                if(isItemUpdate){
                    DBConnection.getInstance().getConnection().commit();
                    return true;
                }
            }
        }
        return false;
    }
}
