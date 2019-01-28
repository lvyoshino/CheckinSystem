package stu.lkh.system.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stu.lkh.system.app.dto.CheckInReqDTO;
import stu.lkh.system.service.CheckInService;

/**
 * Created by n!Ck
 * Date: 2019-01-26
 * Time: 15:33
 * Description:
 */

@RestController
@RequestMapping(value = "/check-in")
public class CheckInController {

    private final CheckInService checkInService;

    @Autowired
    public CheckInController(CheckInService checkInService) {
        this.checkInService = checkInService;
    }

    @PostMapping
    public Boolean checkIn(
            @RequestBody CheckInReqDTO checkInReqDTO) {

        return checkInService.checkIn(checkInReqDTO);
    }
}
