package pkg.mybatis.model;

public class ChildTeacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CHILD_TEACHER.CHILD_ID
     *
     * @mbg.generated Tue May 22 11:48:09 EEST 2018
     */
    private Integer childId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CHILD_TEACHER.TEACHER_ID
     *
     * @mbg.generated Tue May 22 11:48:09 EEST 2018
     */
    private Integer teacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CHILD_TEACHER.CHILD_ID
     *
     * @return the value of PUBLIC.CHILD_TEACHER.CHILD_ID
     *
     * @mbg.generated Tue May 22 11:48:09 EEST 2018
     */
    public Integer getChildId() {
        return childId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CHILD_TEACHER.CHILD_ID
     *
     * @param childId the value for PUBLIC.CHILD_TEACHER.CHILD_ID
     *
     * @mbg.generated Tue May 22 11:48:09 EEST 2018
     */
    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CHILD_TEACHER.TEACHER_ID
     *
     * @return the value of PUBLIC.CHILD_TEACHER.TEACHER_ID
     *
     * @mbg.generated Tue May 22 11:48:09 EEST 2018
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CHILD_TEACHER.TEACHER_ID
     *
     * @param teacherId the value for PUBLIC.CHILD_TEACHER.TEACHER_ID
     *
     * @mbg.generated Tue May 22 11:48:09 EEST 2018
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}