package stu.lkh.system.infra.dataobject;

import javax.persistence.Table;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 19:13
 * Description:
 */
@Table(name = "meeting_room")
public class MeetingRoomDO {
    private Long meetingRoomId;
    private String meetingRoomName;
    private String meetingRoomPlaceX;
    private String meetingRoomPlaceY;

    public Long getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(Long meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
    }

    public String getMeetingRoomPlaceX() {
        return meetingRoomPlaceX;
    }

    public void setMeetingRoomPlaceX(String meetingRoomPlaceX) {
        this.meetingRoomPlaceX = meetingRoomPlaceX;
    }

    public String getMeetingRoomPlaceY() {
        return meetingRoomPlaceY;
    }

    public void setMeetingRoomPlaceY(String meetingRoomPlaceY) {
        this.meetingRoomPlaceY = meetingRoomPlaceY;
    }
}
