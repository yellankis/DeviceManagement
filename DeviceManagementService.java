package com.problem.shaheed.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.problem.shaheed.dao.Device;


@Service
public class DeviceManagementService {
  private final static List<Device> devices = new ArrayList<>();

  static {
    devices.add(new Device(1l, "Alice"));
    devices.add(new Device(2l, "Bob"));
    devices.add(new Device(3l, "Chris"));
    devices.add(new Device(4l, "Dick"));
    devices.add(new Device(5l, "Eve"));
    devices.add(new Device(6l, "Finn"));
  }

  public Optional<Device> getDevice(Long id) {
    return devices.stream()
            .filter(device -> device.getDeviceId()
                    .equals(id))
            .findFirst();
  }

  public void createDevice(Device device) {
    devices.add(device);
  }

  public List<Device> getAllDevices(){
    return devices;
  }

}
