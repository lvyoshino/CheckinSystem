package stu.lkh.system.infra.dataobject;

import javax.persistence.Table;

@Table(name = "checkin_record")
public class CheckinRecordDO {
    private Long recordId;
    private Long studentId;
    private String meetingName;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }
}
