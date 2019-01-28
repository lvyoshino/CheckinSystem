package stu.lkh.system.app.dto;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 17:27
 * Description:
 */
public class CheckInReqDTO {
    /**
     * 会议名字
     */
    private String meetingName;
    /**
     * 会议室名字
     */
    private String meetingRoomName;
    /**
     * 会议室位置
     */
    private String meetingRoomPlace;
    /**
     * 打卡人学号
     */
    private Long studentId;

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
    }

    public String getMeetingRoomPlace() {
        return meetingRoomPlace;
    }

    public void setMeetingRoomPlace(String meetingRoomPlace) {
        this.meetingRoomPlace = meetingRoomPlace;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
