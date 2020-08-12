package com.mapsa.bta.services;
import com.mapsa.bta.db.connection ;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class loginService {

    public static boolean Authenticate(String email , String password)  {
        String sql = "select * from users_db where EMAIL=? and PASSWORD=?";
        Connection connectionDB = connection.getConnection();
        try {
            PreparedStatement ps = null ;
            ps = connectionDB.prepareStatement(sql) ;
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                connectionDB.close();
                return true ;

            }
        } catch (SQLException e) {
            e.getErrorCode();
        }

        return false ;
    }

    }



