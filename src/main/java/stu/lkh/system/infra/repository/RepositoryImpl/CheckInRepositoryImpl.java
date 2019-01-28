package stu.lkh.system.infra.repository.RepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import stu.lkh.system.app.dto.CheckInReqDTO;
import stu.lkh.system.infra.dataobject.MeetingDO;
import stu.lkh.system.infra.dataobject.MeetingRoomDO;
import stu.lkh.system.infra.mapper.CheckInMapper;
import stu.lkh.system.infra.repository.CheckInRepository;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 15:44
 * Description:
 */

@Component
public class CheckInRepositoryImpl implements CheckInRepository {

    @Autowired
    private CheckInRepository checkInRepository;
    @Autowired
    private CheckInMapper checkInMapper;

    @Override
    public MeetingRoomDO getMeetingRoom(String meetingRoomName) {
        return checkInMapper.getMeetingRoom(meetingRoomName);
    }

    @Override
    public MeetingDO checkIn(CheckInReqDTO checkInReqDTO) {
        String meetingName = checkInReqDTO.getMeetingName();
        String meetingRoomName = checkInReqDTO.getMeetingRoomName();

        return checkInMapper.checkIn(meetingName, meetingRoomName) ;
    }

    @Override
    public Boolean saveCheckInRecord(CheckInReqDTO checkInReqDTO) {
        return checkInMapper.saveCheckInRecord(checkInReqDTO.getStudentId(),checkInReqDTO.getMeetingName());
    }
}
