package com.mapsa.bta.services;

import com.mapsa.bta.model.userDto;
import org.springframework.stereotype.Component;
import com.mapsa.bta.db.connection ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RegisterService {

    public void adduser(userDto userDto) throws SQLException {
        String sql = "insert into USERS_DB(name,family,password,EMAIL,phonenumber) values(?,?,?,?,?)";
        Connection connectionDB = connection.getConnection() ;
        PreparedStatement ps = connectionDB.prepareStatement(sql) ;
        ps.setString(1,userDto.getName());
        ps.setString(2,userDto.getFamily());
        ps.setString(3,userDto.getPassword());
        ps.setString(4,userDto.getEmail());
        ps.setLong(5,userDto.getPhoneNumber());
        ps.execute() ;
        connectionDB.close();


}
}
