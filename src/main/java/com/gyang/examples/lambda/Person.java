package com.gyang.examples.lambda;

public class Person
{
    /**
     * 
     */
    private String _name;
    private int _age;
    private String _gender;

    public Person(String name, int age, String gender)
    {
        _name = name;
        _age = age;
        _gender = gender;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        this._name = _name;
    }

    public int getAge()
    {
        return _age;
    }

    public void setAge(int age)
    {
        this._age = _age;
    }

    public String getGender()
    {
        return _gender;
    }

    public void setGender(String gender)
    {
        this._gender = _gender;
    }
}