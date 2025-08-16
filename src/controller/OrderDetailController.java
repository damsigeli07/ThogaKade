
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import db.DBConnection;
import model.OrderDetail;

public class OrderDetailController {
    public static boolean addOrderDetail(ArrayList <OrderDetail>orderDetailList) throws ClassNotFoundException, SQLException{
        for (OrderDetail orderDetail : orderDetailList) {
            if(!addOrderDetail(orderDetail)){
                return false;
            }
        }
        return true;
    }
    public static boolean addOrderDetail(OrderDetail orderDetail) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Insert into OrderDetail values(?,?,?,?)");
        stm.setObject(1, orderDetail.getOrderId());
        stm.setObject(2, orderDetail.getItemCode());
        stm.setObject(3, orderDetail.getQty());
        stm.setObject(4, orderDetail.getUnitPrice());
        return stm.executeUpdate()>0;
    }
}
