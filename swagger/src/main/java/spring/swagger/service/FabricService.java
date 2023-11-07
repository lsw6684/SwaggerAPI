package spring.swagger.service;

import spring.swagger.model.Fabric;

public interface FabricService {
    Fabric findDescriptionByFabricNo(String fabricNo);
}
