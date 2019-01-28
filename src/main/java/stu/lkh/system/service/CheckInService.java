package stu.lkh.system.service;

import stu.lkh.system.app.dto.CheckInReqDTO;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 15:39
 * Description:
 */
public interface CheckInService {
    Boolean checkIn(CheckInReqDTO checkInReqDTO);
}
