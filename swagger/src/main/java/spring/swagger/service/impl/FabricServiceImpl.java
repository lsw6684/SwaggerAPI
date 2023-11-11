package spring.swagger.service.impl;

import spring.swagger.model.Fabric;
import spring.swagger.service.FabricService;

import java.util.HashMap;
import java.util.Map;


public class FabricServiceImpl implements FabricService {

    private static final Map<String, Fabric> fabricRepository = new HashMap<>();

    // 샘플 데이터
    static {
        fabricRepository.put("12345", new Fabric("12345", "Cotton Blend"));
        fabricRepository.put("67890", new Fabric("67890", "Polyester"));
    }

    @Override
    public Fabric findDescriptionByFabricNo(String fabricNo) {
        // fabric_no 코드로 description을 조회
        return fabricRepository.get(fabricNo);
    }

    // description 문자열 반환 추가 메소드
    public String getFabricDescription(String fabricNo) {
        Fabric fabric = this.findDescriptionByFabricNo(fabricNo);
        return (fabric != null) ? fabric.getDescription() : null;
    }
}
