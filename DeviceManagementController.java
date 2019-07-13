package com.problem.shaheed.statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.problem.shaheed.dao.Device;
import com.problem.shaheed.service.DeviceManagementService;


@RestController
public class DeviceManagementController {

    @Autowired
    DeviceManagementService deviceManagementService;

  @RequestMapping(value="/devices/list", method=RequestMethod.GET)
  public void createDevic(@RequestBody Device device){
       List<Device> objects = new ArrayList<Device>();
      deviceManagementService.createDevice(device);

   }

    @RequestMapping(value="/device", method=RequestMethod.GET)
    public Optional<com.problem.shaheed.dao.Device> getDevice(@RequestParam Long id){
        return deviceManagementService.getDevice(id);

    }

    @RequestMapping(value="/device/create", method=RequestMethod.GET)
    public List<com.problem.shaheed.dao.Device> getAllDevices(){
        return deviceManagementService.getAllDevices();

    }

}
