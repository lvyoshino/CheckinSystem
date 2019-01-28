package stu.lkh.system.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.lkh.system.app.dto.CheckInReqDTO;
import stu.lkh.system.infra.dataobject.MeetingDO;
import stu.lkh.system.infra.dataobject.MeetingRoomDO;
import stu.lkh.system.infra.repository.CheckInRepository;
import stu.lkh.system.service.CheckInService;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 15:40
 * Description:
 */

@Service
public class CheckInServiceImpl implements CheckInService {

    @Autowired
    private CheckInRepository checkInRepository;

    @Override
    public Boolean checkIn(CheckInReqDTO checkInReqDTO) {

        MeetingDO meetingDO=checkInRepository.checkIn(checkInReqDTO);//获取会议记录
        MeetingRoomDO meetingRoomDO=checkInRepository.getMeetingRoom(meetingDO.getMeetingRoomName());//获取会议室

        String[] coordinate = checkInReqDTO.getMeetingRoomPlace().split(";");
        Double x = Double.valueOf(coordinate[0]);
        Double y = Double.valueOf(coordinate[1]);//获取坐标
        Double meetingRoomX=Double.valueOf(meetingRoomDO.getMeetingRoomPlaceX());
        Double meetingRoomY=Double.valueOf(meetingRoomDO.getMeetingRoomPlaceY());//将string转为double
        if ((x<=meetingRoomX+0.0003&&x>=meetingRoomX-0.0003)&&(y<=meetingRoomY+0.0003&&y>=meetingRoomY-0.0003)){
            checkInRepository.saveCheckInRecord(checkInReqDTO);
            return true;
        }else {
            return false;
        }

    }
}
