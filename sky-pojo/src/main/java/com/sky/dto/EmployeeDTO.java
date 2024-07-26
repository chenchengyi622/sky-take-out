package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {
    /*
    DTO的目的是在不同层（例如，应用程序层、业务逻辑层和数据访问层）之间传递数据，以便解耦和减少通信的开销。
    特点
    DTO的属性通常与业务实体对象（如数据库实体）相对应，但它们可能只包含业务实体的子集。
    DTO还可以用于跨网络传输数据，例如在客户端和服务器之间传递数据
    EmployeeDTO的数据是用户注册时需要填写的，而Employee是全部属性，额外多时间，状
     */
    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
