
package com.example.demo.bean;


import java.util.Date;

/**
 * 人员信息表 人员信息表
 */
public class PersonInfo
{
  private int id;
  /**
   * 名称
   */
  private String name;
  /**
   * 1-男，2,-女，0-其他
   */
  private int sex;
  private int age;
  /**
   * 手机号码
   */
  private int mobile;
  /**
   * 邮箱
   */
  private String email;
  /**
   * 地址
   */
  private String address;
  /**
   * 关系ID
   */
  private int typeId;
  /**
   * 用户ID
   */
  private int userId;
  /**
   * 是否有效，0无效，1有效
   */
  private int status;
  /**
   * 创建时间
   */
  private Date createdAt;
  /**
   * 创建人
   */
  private String createdBy;
  /**
   * 更新时间
   */
  private Date updatedAt;
  /**
   * 更新人
   */
  private String updatedBy;

  public PersonInfo()
  {
  }

  public int getId()
  {
    return id;
  }
  public void setId(int value)
  {
    this.id = value;
  }
  /**
   * 获取名称
   */
  public String getName()
  {
    return name;
  }
  /**
   * 设置名称
   */
  public void setName(String value)
  {
    this.name = value;
  }
  /**
   * 获取1-男，2,-女，0-其他
   */
  public int getSex()
  {
    return sex;
  }
  /**
   * 设置1-男，2,-女，0-其他
   */
  public void setSex(int value)
  {
    this.sex = value;
  }
  public int getAge()
  {
    return age;
  }
  public void setAge(int value)
  {
    this.age = value;
  }
  /**
   * 获取手机号码
   */
  public int getMobile()
  {
    return mobile;
  }
  /**
   * 设置手机号码
   */
  public void setMobile(int value)
  {
    this.mobile = value;
  }
  /**
   * 获取邮箱
   */
  public String getEmail()
  {
    return email;
  }
  /**
   * 设置邮箱
   */
  public void setEmail(String value)
  {
    this.email = value;
  }
  /**
   * 获取地址
   */
  public String getAddress()
  {
    return address;
  }
  /**
   * 设置地址
   */
  public void setAddress(String value)
  {
    this.address = value;
  }
  /**
   * 获取关系ID
   */
  public int getTypeId()
  {
    return typeId;
  }
  /**
   * 设置关系ID
   */
  public void setTypeId(int value)
  {
    this.typeId = value;
  }
  /**
   * 获取用户ID
   */
  public int getUserId()
  {
    return userId;
  }
  /**
   * 设置用户ID
   */
  public void setUserId(int value)
  {
    this.userId = value;
  }
  /**
   * 获取是否有效，0无效，1有效
   */
  public int getStatus()
  {
    return status;
  }
  /**
   * 设置是否有效，0无效，1有效
   */
  public void setStatus(int value)
  {
    this.status = value;
  }
  /**
   * 获取创建时间
   */
  public Date getCreatedAt()
  {
    return createdAt;
  }
  /**
   * 设置创建时间
   */
  public void setCreatedAt(Date value)
  {
    this.createdAt = value;
  }
  /**
   * 获取创建人
   */
  public String getCreatedBy()
  {
    return createdBy;
  }
  /**
   * 设置创建人
   */
  public void setCreatedBy(String value)
  {
    this.createdBy = value;
  }
  /**
   * 获取更新时间
   */
  public Date getUpdatedAt()
  {
    return updatedAt;
  }
  /**
   * 设置更新时间
   */
  public void setUpdatedAt(Date value)
  {
    this.updatedAt = value;
  }
  /**
   * 获取更新人
   */
  public String getUpdatedBy()
  {
    return updatedBy;
  }
  /**
   * 设置更新人
   */
  public void setUpdatedBy(String value)
  {
    this.updatedBy = value;
  }
}

