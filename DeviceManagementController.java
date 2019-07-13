package com.device.management.controller;

import org.springframework.web.bind.annotation.RestController;
import com.device.management.service.DeviceManagementService;
import com.device.management.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathParam;


@RestController("register")
public class DeviceManagementController {

    @Autowired
    DeviceManagementService deviceManagementService;

    @RequestMapping(value="/devices/list", method=RequestMethod.GET)
    public ResponseBody getAllDevices{
        List<Device> objects = new ArrayList<Device>();
        return deviceManagementService.getAllDevices();

    }

    @RequestMapping(value="/device", method=RequestMethod.GET)
    public ResponseBody getDevice(@PathParam Long id){
        return deviceManagementService.getDevice(id);

    }

    @RequestMapping(value="/device/create", method=RequestMethod.GET)
    public ResponseBody createDevice(@RequestBody Device device){
        return deviceManagementService.createDevice(device);

    }

}
