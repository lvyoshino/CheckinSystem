package stu.lkh.system.infra.dataobject;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 16:50
 * Description:
 */

@Table(name = "meeting")
public class MeetingDO {
    @Id
    @GeneratedValue
    private Long meetingId;
    private String meetingName;
    private String meetingRoomName;

    public Long getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Long meetingId) {
        this.meetingId = meetingId;
    }

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

    @Override
    public String toString() {
        return "MeetingDO{" +
                "meetingId=" + meetingId +
                ", meetingName='" + meetingName + '\'' +
                ", meetingRoomName='" + meetingRoomName + '\'' +
                '}';
    }
}
