package model;

public class StudentsDomainObject {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.ID
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    private String ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.Name
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.Age
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.ID
     *
     * @return the value of students.ID
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    public String getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.ID
     *
     * @param ID the value for students.ID
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.Name
     *
     * @return the value of students.Name
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.Name
     *
     * @param name the value for students.Name
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.Age
     *
     * @return the value of students.Age
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.Age
     *
     * @param age the value for students.Age
     *
     * @mbg.generated Sun Dec 03 13:20:06 CST 2017
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}