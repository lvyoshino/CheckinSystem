package stu.lkh.system.infra.mapper;

import org.apache.ibatis.annotations.Param;
import stu.lkh.system.infra.dataobject.MeetingDO;
import stu.lkh.system.infra.dataobject.MeetingRoomDO;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 15:45
 * Description:
 */

public interface CheckInMapper {
    MeetingDO checkIn(@Param("meetingName") String meetingName,
                      @Param("meetingRoomName") String meetingRoomName);

    MeetingRoomDO getMeetingRoom(@Param("meetingRoomName") String meetingRoomName);
    Boolean saveCheckInRecord(@Param("studentId") Long studentId,
                              @Param("meetingName") String meetingName);
}

