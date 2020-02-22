package com.wu.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
@Data
@TableName(value="user_a")
public class Usera {
@TableId(value="id")
private long id;
@TableField(value="name")
private String name;
private int age;
private String email;
private long manager_id;
private  LocalDateTime create_time;
}
