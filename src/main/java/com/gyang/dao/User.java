package com.gyang.dao;

public class User
{
    public String name;
    public String gender;
    public String dob;
    public int id;

    public User(String name, String gender, String dob, int id)
    {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getDob()
    {
        return dob;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
