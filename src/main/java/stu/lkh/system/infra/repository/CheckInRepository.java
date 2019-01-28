package stu.lkh.system.infra.repository;

import stu.lkh.system.app.dto.CheckInReqDTO;
import stu.lkh.system.infra.dataobject.MeetingDO;
import stu.lkh.system.infra.dataobject.MeetingRoomDO;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 15:44
 * Description:
 */

public interface CheckInRepository {
    MeetingRoomDO getMeetingRoom(String meetingRoomName);

    MeetingDO checkIn(CheckInReqDTO checkInReqDTO);

    Boolean saveCheckInRecord(CheckInReqDTO checkInReqDTO);
}
